package com.bjmoonlight.conversor;

import java.util.Scanner;

public class Principal {

    private final Scanner lectura = new Scanner(System.in);
    private final ConsultaAPI consulta = new ConsultaAPI();
    private final Conversor conversor = new Conversor();

    public void ejecutar() {
        System.out.println("**************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda");
        System.out.println("**************************************");

        while (true) {
            mostrarMenu();

            String opcion = lectura.nextLine().trim();

            if (opcion.equals("7")) {
                System.out.println("Finalizando la aplicación.");
                break;
            }

            try {
                manejarOpcion(opcion);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }

            System.out.println(); // línea en blanco para que se vea bonito
        }
    }

    private void mostrarMenu() {
        System.out.println("""
                1) Dólar (USD) => Peso argentino (ARS)
                2) Peso argentino (ARS) => Dólar (USD)
                3) Dólar (USD) => Real brasileño (BRL)
                4) Real brasileño (BRL) => Dólar (USD)
                5) Dólar (USD) => Peso chileno (CLP)
                6) Peso chileno (CLP) => Dólar (USD)
                7) Salir
                """);
        System.out.print("Elija una opción válida: ");
    }

    private void manejarOpcion(String opcion) throws Exception {
        String base;
        String destino;

        switch (opcion) {
            case "1" -> { base = "USD"; destino = "ARS"; }
            case "2" -> { base = "ARS"; destino = "USD"; }
            case "3" -> { base = "USD"; destino = "BRL"; }
            case "4" -> { base = "BRL"; destino = "USD"; }
            case "5" -> { base = "USD"; destino = "CLP"; }
            case "6" -> { base = "CLP"; destino = "USD"; }
            default -> {
                System.out.println("Opción inválida. Intenta nuevamente.");
                return;
            }
        }

        System.out.print("Ingresa el valor que deseas convertir: ");
        String textoMonto = lectura.nextLine().trim();

        double monto;
        try {
            monto = Double.parseDouble(textoMonto.replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Número inválido. Debes ingresar un valor numérico.");
            return;
        }

        String json = consulta.obtenerDatos(base, destino);
        double tasa = conversor.obtenerTasa(json);
        double resultado = conversor.convertir(monto, tasa);

        System.out.printf("El valor de %.2f %s corresponde al valor final de %.2f %s%n",
                monto, base, resultado, destino);
    }
}

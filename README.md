# Conversor de Monedas - Alura Challenge ONE

Aplicación de consola desarrollada en Java que permite convertir monedas en tiempo real utilizando la API ExchangeRate.

## Funcionalidades

- Conversión entre:
  - USD ⇄ ARS
  - USD ⇄ BRL
  - USD ⇄ CLP
- Consumo de API externa (ExchangeRate API)
- Manejo de JSON con Gson
- Arquitectura separada en clases
- Menú interactivo en consola
- Uso de variables de entorno para proteger la API Key

## Tecnologías utilizadas

- Java 17+
- Maven
- Gson
- HttpClient
- IntelliJ IDEA

##  Seguridad

La API Key no se encuentra hardcodeada en el proyecto.  
Se utiliza una variable de entorno: EXCHANGE_API_KEY


##  Estructura del proyecto

- `ConsultaAPI` → Maneja la conexión con la API
- `Conversor` → Lógica de conversión
- `RespuestaExchange` → Modelo para mapear JSON
- `Principal` → Menú interactivo
- `Main` → Punto de entrada

##  Estado del proyecto

✔ Funcional  
✔ Integración con API  
✔ Conversión validada  


---

Desarrollado por Bjmoonlight 

---

Desarrollado por Bjmoonlight 💜



# Conversor de Monedas - Alura Challenge ONE

Aplicación de consola desarrollada en Java que permite convertir monedas en tiempo real utilizando la API ExchangeRate.

El usuario puede seleccionar distintas opciones de conversión y obtener el resultado actualizado según la tasa oficial del día.


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

Esto evita exponer credenciales sensibles en el repositorio.


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

##  Cómo ejecutar el proyecto

1. Clonar el repositorio.
2. Configurar la variable de entorno EXCHANGE_API_KEY con tu clave personal.
3. Ejecutar el proyecto desde la clase Main.

Ejemplo en Windows (PowerShell):

setx EXCHANGE_API_KEY "tu_api_key_aqui"


-------

Desarrollado por Bjmoonlight 





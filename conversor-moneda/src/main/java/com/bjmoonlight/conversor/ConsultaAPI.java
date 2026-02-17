package com.bjmoonlight.conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    private static final String API_KEY = System.getenv("EXCHANGE_API_KEY");

    public String obtenerDatos(String monedaBase, String monedaDestino)
            throws Exception {

        String direccion = "https://v6.exchangerate-api.com/v6/"
                + API_KEY + "/pair/"
                + monedaBase + "/"
                + monedaDestino;

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .GET()
                .build();

        HttpResponse<String> response =
                cliente.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}

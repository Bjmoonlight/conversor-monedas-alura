package com.bjmoonlight.conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

    public double obtenerTasa(String json) {

        JsonObject objeto = JsonParser.parseString(json).getAsJsonObject();

        double tasa = objeto.get("conversion_rate").getAsDouble();

        return tasa;
    }

    public double convertir(double monto, double tasa) {
        return monto * tasa;
    }
}

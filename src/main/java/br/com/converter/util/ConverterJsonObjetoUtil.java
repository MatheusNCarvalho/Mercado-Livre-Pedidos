package br.com.converter.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

public  class ConverterJsonObjetoUtil {

    public static Object jsonParaObjeto(String json, Class<?> classe) throws IOException {
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            return mapper.readValue(json, classe);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Objeto nÃ£o pode ser convertido para JSON!", e);
        }
    }

    public static JsonArray getPropriedadeJson(String json, String chave) throws IOException {
        JsonObject jsonObjeto = (new JsonParser()).parse(json).getAsJsonObject();
        JsonArray parteDoJson = jsonObjeto.getAsJsonArray(chave);
        return parteDoJson != null ? parteDoJson : null;
    }


}

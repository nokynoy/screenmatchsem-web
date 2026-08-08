package br.com.alura.screanmatch.service;

import br.com.alura.screanmatch.moldel.DadosSerie;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class converteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }

    }
}

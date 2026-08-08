package br.com.alura.screanmatch.moldel;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("Year") Integer ano,
                         @JsonAlias("imdbRating") String avaliacao,
                        @JsonProperty("imdbVoter")  String votos) {
}

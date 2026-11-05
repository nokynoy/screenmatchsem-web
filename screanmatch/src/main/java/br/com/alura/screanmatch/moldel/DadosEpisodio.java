package br.com.alura.screanmatch.moldel;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,// numero = duracao
                            @JsonAlias("Episode") Integer numero,
                           // @JsonAlias("Episode") String duracao,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("Released") String dataLandamento) {
}




















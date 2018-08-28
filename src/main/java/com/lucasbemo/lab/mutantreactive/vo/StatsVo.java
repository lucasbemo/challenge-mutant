package com.lucasbemo.lab.mutantreactive.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author lucasbemo
 */
@JsonIgnoreProperties(value = { "mutant" })
public class StatsVo implements Serializable {

    @JsonIgnoreProperties
    private static final long serialVersionUID = -8495108873507045835L;

    @JsonProperty("count_mutant_dna")
    public Long count_mutant_dna;

    @JsonProperty("count_human_dna")
    public Long count_human_dna;

    @JsonProperty("ratio")
    public Double ratio;

    public StatsVo(Long count_human_dna, Long count_mutant_dna) {
        this.count_human_dna = count_human_dna;
        this.count_mutant_dna = count_mutant_dna;

        this.ratio = Double.valueOf(String.valueOf(count_mutant_dna))/Double.valueOf(String.valueOf(count_human_dna));
    }

    public Long getCount_mutant_dna() {
        return count_mutant_dna;
    }

    public Long getCount_human_dna() {
        return count_human_dna;
    }
}

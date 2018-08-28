package com.lucasbemo.lab.mutantreactive.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author lucasbemo
 */
public class StatsVo implements Serializable {

    @JsonIgnoreProperties
    private static final long serialVersionUID = -8495108873507045834L;

    @JsonProperty("count_mutant_dna")
    public Long count_mutant_dna;

    @JsonProperty("count_human_dna")
    public Long count_human_dna;

    @JsonProperty("ratio")
    public Double ratio;

    public StatsVo(){}

    @JsonCreator
    public StatsVo(@JsonProperty("count_mutant_dna")Long count_human_dna, @JsonProperty("count_human_dna")Long count_mutant_dna) {
        this.count_human_dna = count_human_dna;
        this.count_mutant_dna = count_mutant_dna;

        if (this.count_human_dna != null && this.count_human_dna > 0 && this.count_mutant_dna != null && this.count_mutant_dna > 0) {
            this.ratio = Double.valueOf(String.valueOf(count_mutant_dna)) / Double.valueOf(String.valueOf(count_human_dna));
        } else {
            this.ratio = new Double(0);
        }
        if (this.count_human_dna == null)
            this.count_human_dna = new Long(0);
        if (this.count_mutant_dna == null)
            this.count_mutant_dna = new Long(0);
    }

    public Long getCount_mutant_dna() {
        return count_mutant_dna;
    }

    public Long getCount_human_dna() {
        return count_human_dna;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setCount_mutant_dna(Long count_mutant_dna) {
        this.count_mutant_dna = count_mutant_dna;
    }

    public void setCount_human_dna(Long count_human_dna) {
        this.count_human_dna = count_human_dna;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}

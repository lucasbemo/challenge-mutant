package com.lucasbemo.lab.mutantreactive.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucasbemo.lab.mutantreactive.service.MutantService;

import java.io.Serializable;

/**
 * @author lucasbemo
 */
@JsonIgnoreProperties(value = { "mutant" })
public class MutantVo implements Serializable {

    @JsonIgnoreProperties
    private static final long serialVersionUID = -8495108873507045835L;

    @JsonProperty("dna")
    private String[] dna;

    @JsonProperty("isMutant")
    private boolean mutant;

    public MutantVo(){}

    @JsonCreator
    public MutantVo(@JsonProperty("dna")String[] dna) throws Exception {
        this.dna = dna;
        this.mutant = MutantService.isMutant(this.dna);
    }

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }

    public boolean isMutant() {
        return mutant;
    }

    public void setMutant(boolean mutant) {
        this.mutant = mutant;
    }
}

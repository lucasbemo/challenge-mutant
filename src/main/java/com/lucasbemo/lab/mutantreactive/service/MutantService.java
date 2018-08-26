package com.lucasbemo.lab.mutantreactive.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author lucasbemo
 */
@Service
public class MutantService {

    public boolean isMutant(String[] dna) {

        if (isValidDna(dna))

        if (matchHorizontal(dna)) {
            return true;
        }
        if (matchVertical(dna)) {
            return true;
        }
        if (matchOblique(dna)) {
            return true;
        }
        return false;
    }

    private boolean isValidDna(String[] dna) {
        if (dna == null) {
            return false;
        }

        if (!isValidLengthDna(dna)) {
            return false;
        }

        if (!isValidItens(dna)) {
            return false;
        }

        return true;
    }

    private boolean isValidItens(String[] dna) {
        boolean condiction = true;

        for (String item: dna) {
            if (!item.matches("[ACGT]+")) {
                condiction = false;
                break;
            }
        }
        return condiction;
    }

    /**
     * Valida tamanho do dna e seus itens.
     * @param dna
     * @return
     */
    public boolean isValidLengthDna(String[] dna) {
        int columnLength = dna[0].length();
        int dnaLegth = dna.length;

        // É uma matriz com o mínimo de itens possivel.
        if (dna.length < 4) {
            return false;
        }

        // É uma matriz (NxN).
        if (columnLength != dnaLegth) {
            return false;
        }

        long itensLegthCorrects = Arrays.asList(dna).stream()
                .filter(item -> item.length() == columnLength)
                .count();

        // É uma matriz com os itens do mesmo tamanho.
        if (dnaLegth == itensLegthCorrects)
            return true;

        return false;
    }

    public boolean matchHorizontal(String[] dna) {
        int repetedItem =0;

        for (String item: dna) {
            char matchToken = item.charAt(0);

            for (int columnIdx=1; columnIdx < item.length(); columnIdx++) {
                char token = item.charAt(columnIdx);

                if (matchToken == token) {
                    repetedItem++;
                } else {
                    repetedItem = 0;
                    matchToken = token;
                }

                if (repetedItem == 3) {
                    break;
                }
            }

            if (repetedItem == 3) {
                break;
            }
        }
        return (repetedItem == 3? true: false);
    }

    public boolean matchVertical(String[] dna) {
        int matchedItens = 0;

        for (int columnIdx = 0; columnIdx < dna.length; columnIdx++) {
            char previousToken = dna[0].charAt(columnIdx);

            for (int lineIdx = 1; lineIdx < dna.length; lineIdx++) {
                char currentToken = dna[lineIdx].charAt(columnIdx);

                if (previousToken == currentToken) {
                    matchedItens++;
                } else {
                    matchedItens = 0;
                    previousToken = currentToken;
                }

                if (matchedItens == 3) {
                    break;
                }
            }

            if (matchedItens == 3) {
                break;
            }
        }

        return (matchedItens == 3? true: false);
    }

    public boolean matchOblique(String[] dna) {
        if (matchObliqueFromLeft(dna)) {
            return true;
        }
        if (matchObliqueFromRight(dna)) {
            return true;
        }
        return false;
    }

    private boolean matchObliqueFromLeft(String[] dna) {
        int matchedItens = 0;
        int halfMatrix = 0;

        for (int lineIdxInitial = dna.length-1, columnIdxInitial=0; halfMatrix <= dna[0].length();) {

            char previousToken = dna[lineIdxInitial].charAt(columnIdxInitial);

            for (int columnIdx = columnIdxInitial+1, lineIdx = lineIdxInitial+1
                 ; lineIdx < dna.length && columnIdx < dna[lineIdx].length()
                    ; lineIdx++, columnIdx++) {
                char currentToken = dna[lineIdx].charAt(columnIdx);

                if (previousToken == currentToken) {
                    matchedItens++;
                } else {
                    matchedItens = 0;
                    previousToken = currentToken;
                }

                if (matchedItens == 3) {
                    break;
                }
            }

            if (matchedItens == 3) {
                break;
            } else {
                matchedItens = 0;

                if (lineIdxInitial > 0) {
                    lineIdxInitial--;
                } else {
                    halfMatrix++;
                    if (halfMatrix > 1) {
                        columnIdxInitial++;
                    }
                }
            }
        }

        return (matchedItens == 3? true: false);
    }

    private boolean matchObliqueFromRight(String[] dna) {
        int matchedItens = 0;
        int halfMatrix = 0;

        for (int lineIdxInitial = dna.length-1, columnIdxInitial=dna.length-1; halfMatrix <= dna[0].length();) {

            char previousToken = dna[lineIdxInitial].charAt(columnIdxInitial);

            for (int columnIdx = columnIdxInitial-1, lineIdx = lineIdxInitial+1
                 ; lineIdx < dna.length && columnIdx >= 0
                    ; lineIdx++, columnIdx--) {
                char currentToken = dna[lineIdx].charAt(columnIdx);

                if (previousToken == currentToken) {
                    matchedItens++;
                } else {
                    matchedItens = 0;
                    previousToken = currentToken;
                }

                if (matchedItens == 3) {
                    break;
                }
            }

            if (matchedItens == 3) {
                break;
            } else {
                matchedItens = 0;

                if (lineIdxInitial > 0) {
                    lineIdxInitial--;
                } else {
                    halfMatrix++;

                    if (halfMatrix > 1) {
                        columnIdxInitial--;
                    }
                }
            }
        }

        return (matchedItens == 3? true: false);
    }
}

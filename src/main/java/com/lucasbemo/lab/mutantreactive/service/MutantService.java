package com.lucasbemo.lab.mutantreactive.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author lucasbemo
 */
public class MutantService {

    private static String VALID_LETTERS_MUTANT_DNA = "ACGT";

    /**
     * Verifique se o dna informado é de um mutante ou não.
     * @param dna
     * @return
     */
    public static boolean isMutant(String[] dna) {

        if (MutantService.isValidDna(dna))

        if (MutantService.matchHorizontal(dna)) {
            return true;
        }
        if (MutantService.matchVertical(dna)) {
            return true;
        }
        if (MutantService.matchOblique(dna)) {
            return true;
        }
        return false;
    }

    /**
     * Verifica se o DNA informado é válido.
     * @param dna
     * @return
     */
    private static boolean isValidDna(String[] dna) {
        if (dna == null) {
            return false;
        }

        if (!MutantService.isValidLengthDna(dna)) {
            return false;
        }

        if (!MutantService.isValidItens(dna)) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se os itens do DNA contém as letras válidas.
     * @param dna
     * @return
     */
    public static boolean isValidItens(String[] dna) {
        boolean condiction = true;

        for (String item: dna) {
            if (!item.matches("["+VALID_LETTERS_MUTANT_DNA+"]+")) {
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
    public static boolean isValidLengthDna(String[] dna) {
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

    /**
     * Verifica se o DNA informado é mutant baseado somente no layout Horizontal.
     * @param dna
     * @return
     */
    public static boolean matchHorizontal(String[] dna) {
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

    /**
     * Verifica se o DNA informado é mutant baseado somente no layout Vertical.
     * @param dna
     * @return
     */
    public static boolean matchVertical(String[] dna) {
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

    /**
     * Verifica se o DNA informado é mutant baseado somente no layout Oblique.
     * @param dna
     * @return
     */
    public static boolean matchOblique(String[] dna) {
        if (MutantService.matchObliqueFromLeft(dna)) {
            return true;
        }
        if (MutantService.matchObliqueFromRight(dna)) {
            return true;
        }
        return false;
    }

    private static boolean matchObliqueFromLeft(String[] dna) {
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

    private static boolean matchObliqueFromRight(String[] dna) {
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

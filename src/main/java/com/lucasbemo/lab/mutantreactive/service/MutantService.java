package com.lucasbemo.lab.mutantreactive.service;

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
    public static boolean isMutant(String[] dna)  {
        int matchedSequence = 0;

        if (!MutantService.isValidDna(dna)) {
            return false;
        }

        matchedSequence = matchedSequence + MutantService.matchHorizontal(dna);

        if (matchedSequence>=2)
            return true;

        matchedSequence = matchedSequence + MutantService.matchVertical(dna);

        if (matchedSequence>=2)
            return true;

        matchedSequence = matchedSequence + MutantService.matchOblique(dna);

        if (matchedSequence>=2)
            return true;

        return false;
    }

    /**
     * Verifica se o DNA informado é válido.
     * @param dna
     * @return
     */
    public static boolean isValidDna(String[] dna) {
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
    public static int matchHorizontal(String[] dna) {
        int matchedItens = 0;
        int matchDna = 0;

        for (String item: dna) {
            char matchToken = item.charAt(0);

            for (int columnIdx=1; columnIdx < item.length(); columnIdx++) {
                char token = item.charAt(columnIdx);

                if (matchToken == token) {
                    matchedItens++;
                } else {
                    matchedItens = 0;
                    matchToken = token;
                }

                if (matchedItens == 3) {
                    matchDna++;
                    matchedItens = 0;
                }
                if (matchDna >= 2) {
                    break;
                }
            }

            if (matchDna >= 2) {
                break;
            }
        }
        return matchDna;
    }

    /**
     * Verifica se o DNA informado é mutant baseado somente no layout Vertical.
     * @param dna
     * @return
     */
    public static int matchVertical(String[] dna) {
        int matchedItens = 0;
        int matchDna = 0;

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
                    matchDna++;
                    matchedItens = 0;
                }
                if (matchDna >= 2) {
                    break;
                }
            }

            if (matchDna >= 2) {
                break;
            }
        }

        return matchDna;
    }

    /**
     * Verifica se o DNA informado é mutant baseado somente no layout Oblique.
     * @param dna
     * @return
     */
    public static int matchOblique(String[] dna) {
        int matchedSequence = 0;

        matchedSequence = matchedSequence + MutantService.matchObliqueFromLeft(dna);
        if (matchedSequence >= 2) {
            return matchedSequence;
        }
        matchedSequence = matchedSequence + MutantService.matchObliqueFromRight(dna);
        if (matchedSequence >= 2) {
            return matchedSequence;
        }

        return matchedSequence;
    }

    public static int matchObliqueFromLeft(String[] dna) {
        int matchedItens = 0;
        int halfMatrix = 0;
        int matchDna = 0;

        for (int lineIdxInitial = dna.length-1, columnIdxInitial=0; halfMatrix <= dna[0].length() - 1;) {

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
                    matchDna++;
                    matchedItens = 0;
                }
                if (matchDna >= 2) {
                    break;
                }
            }

            if (matchDna >= 2) {
                break;
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
                    } else {
                        columnIdxInitial++;
                        lineIdxInitial = 0;
                    }
                }
            }
        }

        return matchDna;
    }

    public static int matchObliqueFromRight(String[] dna) {
        int matchedItens = 0;
        int halfMatrix = 0;
        int matchDna = 0;

        for (int lineIdxInitial = dna.length-1, columnIdxInitial=dna.length-1; halfMatrix <= dna[0].length()-1;) {

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
                    matchDna++;
                    matchedItens = 0;
                }
                if (matchDna >= 2) {
                    break;
                }
            }

            if (matchDna >= 2) {
                break;
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
                    } else {
                        columnIdxInitial = dna.length-2;
                        lineIdxInitial++;
                    }
                }
            }
        }

        return matchDna;
    }
}

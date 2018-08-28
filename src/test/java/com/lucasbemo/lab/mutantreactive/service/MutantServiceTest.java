package com.lucasbemo.lab.mutantreactive.service;

import com.lucasbemo.lab.mutantreactive.App;
import com.lucasbemo.lab.mutantreactive.util.MutantUtilTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author lucasbemo
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MutantServiceTest {

    // Testa posicoes possiveis de ser mutante, no layout Horizontal da Matriz.
    @Test
    public void isNotMutant_1horizontalLine0column0() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_0_COLUMN_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_0_COLUMN_0));
    }
    @Test
    public void isNotMutant_1horizontalLine0column1() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_0_COLUMN_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_0_COLUMN_1));
    }
    @Test
    public void isNotMutant_1horizontalLine0column2() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_0_COLUMN_2)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_0_COLUMN_2));
    }
    @Test
    public void isNotMutant_1horizontalLine1column0() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_1_COLUMN_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_1_COLUMN_0));
    }
    @Test
    public void isNotMutant_1horizontalLine1column1() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_1_COLUMN_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_1_COLUMN_1));
    }
    @Test
    public void isNotMutant_1horizontalLine1column2() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_1_COLUMN_2)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LINE_1_COLUMN_2));
    }
    @Test
    public void isNotMutant_1horizontalLastLineColumn0() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LAST_LINE_COLUMN_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LAST_LINE_COLUMN_0));
    }
    @Test
    public void isNotMutant_1horizontalLastLineColumn1() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LAST_LINE_COLUMN_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LAST_LINE_COLUMN_1));
    }
    @Test
    public void isNotMutant_1horizontalLastLineColumn2() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LAST_LINE_COLUMN_2)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_HORIZONTAL_LAST_LINE_COLUMN_2));
    }


    // Testa posicoes possiveis de ser mutante, no layout Vertical da Matriz.
    @Test
    public void isNotMutant_1verticalColumn0Line0() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_0_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_0_LINE_0));
    }
    @Test
    public void isNotMutant_1verticalColumn0Line1() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL1_COLUMN_0_LINE_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL1_COLUMN_0_LINE_1));
    }
    @Test
    public void isNotMutant_1verticalColumn0Line2() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_0_LINE_2)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_0_LINE_2));
    }
    @Test
    public void isNotMutant_1verticalColumn1Line0() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_1_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_1_LINE_0));
    }
    @Test
    public void isNotMutant_1verticalColumn1Line1() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_1_LINE_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_1_LINE_1));
    }
    @Test
    public void isNotMutant_1verticalColumn1Line2() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_1_LINE_2)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_COLUMN_1_LINE_2));
    }
    @Test
    public void isNotMutant_1verticalLastColumnLine0() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_LAST_COLUMN_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_LAST_COLUMN_LINE_0));
    }
    @Test
    public void isNotMutant_1verticalLastColumnLine1() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_LAST_COLUMN_LINE_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_LAST_COLUMN_LINE_1));
    }
    @Test
    public void isNotMutant_1verticalLastColumnLine2() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_LAST_COLUMN_LINE_2)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_LAST_COLUMN_LINE_2));
    }


    // Testa posicoes possiveis de ser mutante, no layout Oblique da Matriz.
    @Test
    public void isMutant_1obliqueFromLeftColumn0LastPossibleLine() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_0_LAST_POSSIBLE_LINE)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_0_LAST_POSSIBLE_LINE));
    }
    @Test
    public void isMutant_1obliqueFromLeftColumn0Line1() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_1));
    }
    @Test
    public void isMutant_1obliqueFromLeftColumn0Line0() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_0));
    }
    @Test
    public void isMutant_1obliqueFromLeftColumn1Line0() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_1_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_1_LINE_0));
    }
    @Test
    public void isMutant_1obliqueFromLeftColumn2Line0() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_2_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_COLUMN_2_LINE_0));
    }
    @Test
    public void isMutant_1obliqueFromRightLastColumnLine2() throws Exception {
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_2)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_2));
    }
    @Test
    public void isMutant_1obliqueFromRightLastColumnLine1() throws Exception {
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_1)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_1));
    }
    @Test
    public void isMutant_1obliqueFromRightLastColumnLine0() throws Exception {//
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_0));
    }
    @Test
    public void isMutant_1obliqueFromRightColumn4Line0() throws Exception {
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_COLUMN_4_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_COLUMN_4_LINE_0));
    }
    @Test
    public void isMutant_1obliqueFromRightColumn3Line0() throws Exception {
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_COLUMN_3_LINE_0)==1);
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_COLUMN_3_LINE_0));
    }

    @Test
    public void isInvalidItensNotNxN() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_VALID_NOT_NXN));
    }
    @Test
    public void isInvalidItensEmpty() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_WITH_EMPTY_FILDS));
    }
    @Test
    public void isInvalidItensLessThan4itens() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_WITH_LESS_THAN_4_FIELDS_INTERLEAVED));
    }
    @Test
    public void isInvalidItensSpecialItens() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_WITH_SPECIAL_CHARACTERS));
    }
    @Test
    public void isInvalidItensSpecialItens2() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_WITH_LESS_SPECIAL_ITENS));
    }
    @Test
    public void isNotMutant() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_NOT_MUTANT));
    }
    @Test
    public void isNotMutantNull() throws Exception {
        assertFalse(MutantService.isMutant(null));
    }
    @Test
    public void isNotMutantLettersNotPermited() throws Exception {
        assertFalse(MutantService.isValidItens(MutantUtilTest.DNA_INVALID_LETTERS_NOT_PERMITED));
    }
    @Test
    public void isNotMutantLessThan4Itens() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_INVALID_LESS_THAN_4_ITENS));
    }

    @Test
    public void isMutant2Horizontal() throws Exception {
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_2_HORIZONTAL)==2);
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_2_HORIZONTAL));
    }
    @Test
    public void isMutant2Vertical() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_2_VERTICAL)==2);
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_2_VERTICAL));
    }
    @Test
    public void isMutant2ObliqueFromLeft() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_2_OBLIQUE_FROM_LEFT)==2);
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_2_OBLIQUE_FROM_LEFT));
    }
    @Test
    public void isMutant2ObliqueFromRight() throws Exception {
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_2_OBLIQUE_FROM_RIGHT)==2);
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_2_OBLIQUE_FROM_RIGHT));
    }
    @Test
    public void isMutant1ObliqueFromLeft1ObliqueFromRight() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_OBLIQUE_FROM_RIGHT)==1);
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_OBLIQUE_FROM_RIGHT)==1);

        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_OBLIQUE_FROM_RIGHT));
    }
    @Test
    public void isMutant1ObliqueFromLeft1Vertical() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_VERTICAL)==1);
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_VERTICAL)==1);

        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_VERTICAL));
    }
    @Test
    public void isMutant1ObliqueFromLeft1Horizontal() throws Exception {
        assertTrue(MutantService.matchObliqueFromLeft(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_HORIZONTAL)==1);
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_HORIZONTAL)==1);

        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_LEFT_1_HORIZONTAL));
    }
    @Test
    public void isMutant1ObliqueFromRight1Vertical() throws Exception {
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_1_VERTICAL)==1);
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_1_VERTICAL)==1);

        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_1_VERTICAL));
    }
    @Test
    public void isMutant1ObliqueFromRight1Horizontal() throws Exception {
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_1_HORIZONTAL)==1);
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_1_HORIZONTAL)==1);

        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_OBLIQUE_FROM_RIGHT_1_HORIZONTAL));
    }
    @Test
    public void isMutant1Vertical1Horizontal() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL)==1);
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL)==1);

        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL));
    }
    @Test
    public void isMutant1Vertical1Horizontal1ObliqueFromRight() throws Exception {
        assertTrue(MutantService.matchVertical(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT)==1);
        assertTrue(MutantService.matchHorizontal(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT)==1);
        assertTrue(MutantService.matchObliqueFromRight(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT)==1);

        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT));
    }
}

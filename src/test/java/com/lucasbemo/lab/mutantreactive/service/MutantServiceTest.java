package com.lucasbemo.lab.mutantreactive.service;

import com.lucasbemo.lab.mutantreactive.App;
import com.lucasbemo.lab.mutantreactive.util.MutantUtilTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author lucasbemo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MutantServiceTest {

    // Testa posicoes possiveis de ser mutante, no layout Horizontal da Matriz.
    @Test
    public void isMutant_horizontalLine0column0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_0_COLUMN_0));
    }
    @Test
    public void isMutant_horizontalLine0column1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_0_COLUMN_1));
    }
    @Test
    public void isMutant_horizontalLine0column2() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_0_COLUMN_2));
    }
    @Test
    public void isMutant_horizontalLine1column0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_1_COLUMN_0));
    }
    @Test
    public void isMutant_horizontalLine1column1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_1_COLUMN_1));
    }
    @Test
    public void isMutant_horizontalLine1column2() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_1_COLUMN_2));
    }
    @Test
    public void isMutant_horizontalLastLineColumn0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LAST_LINE_COLUMN_0));
    }
    @Test
    public void isMutant_horizontalLastLineColumn1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LAST_LINE_COLUMN_1));
    }
    @Test
    public void isMutant_horizontalLastLineColumn2() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LAST_LINE_COLUMN_2));
    }


    // Testa posicoes possiveis de ser mutante, no layout Vertical da Matriz.
    @Test
    public void isMutant_verticalColumn0Line0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_0_LINE_0));
    }
    @Test
    public void isMutant_verticalColumn0Line1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL1_COLUMN_0_LINE_1));
    }
    @Test
    public void isMutant_verticalColumn0Line2() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_0_LINE_2));
    }
    @Test
    public void isMutant_verticalColumn1Line0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_1_LINE_0));
    }
    @Test
    public void isMutant_verticalColumn1Line1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_1_LINE_1));
    }
    @Test
    public void isMutant_verticalColumn1Line2() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_1_LINE_2));
    }
    @Test
    public void isMutant_verticalLastColumnLine0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_LAST_COLUMN_LINE_0));
    }
    @Test
    public void isMutant_verticalLastColumnLine1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_LAST_COLUMN_LINE_1));
    }
    @Test
    public void isMutant_verticalLastColumnLine2() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_LAST_COLUMN_LINE_2));
    }


    // Testa posicoes possiveis de ser mutante, no layout Oblique da Matriz.
    @Test
    public void isMutant_obliqueFromLeftColumn0LastPossibleLine() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LAST_POSSIBLE_LINE));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn0Line1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_1));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn0Line0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn1Line0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_1_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn2Line0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_2_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromRightLastColumnLine2() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_2));
    }
    @Test
    public void isMutant_obliqueFromRightLastColumnLine1() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_1));
    }
    @Test
    public void isMutant_obliqueFromRightLastColumnLine0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromRightColumn4Line0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_COLUMN_4_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromRightColumn3Line0() throws Exception {
        assertTrue(MutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_COLUMN_3_LINE_0));
    }

    @Test
    public void isValidItens() throws Exception {
        String[] validDna = new String[] {"ATGCAT", "AAAAAAAAAA", "TTTTTTT", "CCCCCCCC", "GGGGGGGGG"};

        assertFalse(MutantService.isValidDna(validDna));
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
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_VALID_LETTERS_NOT_PERMITED));
    }

    @Test
    public void isNotMutantLessThan4Itens() throws Exception {
        assertFalse(MutantService.isMutant(MutantUtilTest.DNA_INVALID_LESS_THAN_4_ITENS));
    }
}

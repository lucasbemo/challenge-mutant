package com.lucasbemo.lab.mutantreactive.service;

import com.lucasbemo.lab.mutantreactive.App;
import com.lucasbemo.lab.mutantreactive.util.MutantUtilTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author lucasbemo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {App.class})
public class MutantServiceTest {

    @Autowired
    MutantService mutantService;

    // Testa posicoes possiveis de ser mutante, no layout Horizontal da Matriz.
    @Test
    public void isMutant_horizontalLine0column0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_0_COLUMN_0));
    }
    @Test
    public void isMutant_horizontalLine0column1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_0_COLUMN_1));
    }
    @Test
    public void isMutant_horizontalLine0column2() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_0_COLUMN_2));
    }
    @Test
    public void isMutant_horizontalLine1column0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_1_COLUMN_0));
    }
    @Test
    public void isMutant_horizontalLine1column1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_1_COLUMN_1));
    }
    @Test
    public void isMutant_horizontalLine1column2() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LINE_1_COLUMN_2));
    }
    @Test
    public void isMutant_horizontalLastLineColumn0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LAST_LINE_COLUMN_0));
    }
    @Test
    public void isMutant_horizontalLastLineColumn1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LAST_LINE_COLUMN_1));
    }
    @Test
    public void isMutant_horizontalLastLineColumn2() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_HORIZONTAL_LAST_LINE_COLUMN_2));
    }


    // Testa posicoes possiveis de ser mutante, no layout Vertical da Matriz.
    @Test
    public void isMutant_verticalColumn0Line0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_0_LINE_0));
    }
    @Test
    public void isMutant_verticalColumn0Line1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL1_COLUMN_0_LINE_1));
    }
    @Test
    public void isMutant_verticalColumn0Line2() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_0_LINE_2));
    }
    @Test
    public void isMutant_verticalColumn1Line0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_1_LINE_0));
    }
    @Test
    public void isMutant_verticalColumn1Line1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_1_LINE_1));
    }
    @Test
    public void isMutant_verticalColumn1Line2() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_COLUMN_1_LINE_2));
    }
    @Test
    public void isMutant_verticalLastColumnLine0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_LAST_COLUMN_LINE_0));
    }
    @Test
    public void isMutant_verticalLastColumnLine1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_LAST_COLUMN_LINE_1));
    }
    @Test
    public void isMutant_verticalLastColumnLine2() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_VERTICAL_LAST_COLUMN_LINE_2));
    }


    // Testa posicoes possiveis de ser mutante, no layout Oblique da Matriz.
    @Test
    public void isMutant_obliqueFromLeftColumn0LastPossibleLine() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LAST_POSSIBLE_LINE));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn0Line1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_1));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn0Line0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_0_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn1Line0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_1_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromLeftColumn2Line0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_LEFT_COLUMN_2_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromRightLastColumnLine2() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_2));
    }
    @Test
    public void isMutant_obliqueFromRightLastColumnLine1() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_1));
    }
    @Test
    public void isMutant_obliqueFromRightLastColumnLine0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_LAST_COLUMN_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromRightColumn4Line0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_COLUMN_4_LINE_0));
    }
    @Test
    public void isMutant_obliqueFromRightColumn3Line0() {
        assertTrue(mutantService.isMutant(MutantUtilTest.DNA_MUTANT_OBLIQUE_FROM_RIGHT_COLUMN_3_LINE_0));
    }

    @Test
    public void testSimpleTrue() {
        String[] validDna = new String[] {"ATGCAT", "AAAAAAAAAA", "TTTTTTT", "CCCCCCCC", "GGGGGGGGG"};
        assertTrue(validDna[0].matches("[ACGT]+"));
        assertTrue(validDna[1].matches("[ACGT]+"));
        assertTrue(validDna[2].matches("[ACGT]+"));
        assertTrue(validDna[3].matches("[ACGT]+"));
        assertTrue(validDna[4].matches("[ACGT]+"));

        String[] invalidDna = new String[] {
                "ATG CA", "AAAA\"AAAAAA", "T\'TTTTT", "CC!CCCCC", "@GGGGGGGG", "GGGGÇGGGG", "GGGGG%GGG",
                "GGG&GGGGG", "GGG)GGGGG", "GGGGG_GGG", "AT1CAT", "ATaCAT", "ATcCGT", "ATgCAT", "ATtCAT"};

        assertFalse(invalidDna[0].matches("[ACGT]+"));
        assertFalse(invalidDna[1].matches("[ACGT]+"));
        assertFalse(invalidDna[2].matches("[ACGT]+"));
        assertFalse(invalidDna[3].matches("[ACGT]+"));
        assertFalse(invalidDna[4].matches("[ACGT]+"));
        assertFalse(invalidDna[5].matches("[ACGT]+"));
        assertFalse(invalidDna[6].matches("[ACGT]+"));
        assertFalse(invalidDna[7].matches("[ACGT]+"));
        assertFalse(invalidDna[8].matches("[ACGT]+"));
        assertFalse(invalidDna[9].matches("[ACGT]+"));
        assertFalse(invalidDna[10].matches("[ACGT]+"));
        assertFalse(invalidDna[11].matches("[ACGT]+"));
        assertFalse(invalidDna[12].matches("[ACGT]+"));
        assertFalse(invalidDna[13].matches("[ACGT]+"));
        assertFalse(invalidDna[14].matches("[ACGT]+"));
    }
}

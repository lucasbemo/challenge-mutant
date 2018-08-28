package com.lucasbemo.lab.mutantreactive.vo;

import com.lucasbemo.lab.mutantreactive.service.MutantService;
import com.lucasbemo.lab.mutantreactive.util.MutantUtilTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class MutantVoTest {

    @Test
    public void setVo() throws Exception {
        MutantVo vo = new MutantVo();
        vo.setDna(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT);
        vo.setMutant(false);

        assertTrue(vo.getDna() == MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT);
        assertTrue(vo.isMutant() == false);
    }

    @Test
    public void constructorVo() throws Exception {
        MutantVo vo = new MutantVo(MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT);

        assertTrue(vo.getDna() == MutantUtilTest.DNA_MUTANT_1_VERTICAL_1_HORIZONTAL_1_OBLIQUE_FROM_RIGHT);
    }
}

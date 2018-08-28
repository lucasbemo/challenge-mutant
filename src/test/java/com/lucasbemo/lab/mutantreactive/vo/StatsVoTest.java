package com.lucasbemo.lab.mutantreactive.vo;

import com.lucasbemo.lab.mutantreactive.util.MutantUtilTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class StatsVoTest {

    @Test
    public void setVo() throws Exception {
        StatsVo vo = new StatsVo();
        vo.setCount_human_dna(new Long(1));
        vo.setCount_mutant_dna(new Long(1));

        assertTrue(vo.getCount_human_dna() == 1);
        assertTrue(vo.getCount_mutant_dna() == 1);
    }

    @Test
    public void constructorVo() throws Exception {
        StatsVo vo = new StatsVo(new Long(1), new Long(1));

        assertTrue(vo.getCount_human_dna() == 1);
        assertTrue(vo.getCount_mutant_dna() == 1);
        assertTrue(vo.getRatio() == 1);
    }

    @Test
    public void constructorNulVo() throws Exception {
        StatsVo vo = new StatsVo(null, null);

        assertTrue(vo.getCount_human_dna() == 0);
        assertTrue(vo.getCount_mutant_dna() == 0);
        assertTrue(vo.getRatio() == 0);
    }
}

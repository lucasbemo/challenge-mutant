package com.lucasbemo.lab.mutantreactive.controller;

import com.lucasbemo.lab.mutantreactive.App;
import com.lucasbemo.lab.mutantreactive.vo.MutantVo;
import com.lucasbemo.lab.mutantreactive.vo.MutantVoTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MutantControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void isMutant() {
        try {
            MutantVo vo = new MutantVo(new String[]{"TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "AAAAAA"});

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<?> entity = new HttpEntity<>(headers);

            ResponseEntity response = restTemplate.postForEntity(
                    "/mutant/", vo, MutantVoTest.class);

            Assert.assertEquals(response.getStatusCode().value(), 200);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }

    @Test
    public void isNotMutant() {
        try {
            MutantVo vo = new MutantVo(new String[]{"TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "AWSEDR"});

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<?> entity = new HttpEntity<>(headers);

            ResponseEntity response = restTemplate.postForEntity(
                    "/mutant/", vo, MutantVoTest.class);

            Assert.assertEquals(response.getStatusCode().value(), 403);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
}

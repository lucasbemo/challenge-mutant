package com.lucasbemo.lab.mutantreactive.controller;

import com.lucasbemo.lab.mutantreactive.App;
import com.lucasbemo.lab.mutantreactive.vo.StatsVoTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StatsControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void stats() {
        try {
            ResponseEntity<StatsVoTest> response = restTemplate.getForEntity(
                    "/stats/", StatsVoTest.class);

            Assert.assertEquals(response.getStatusCode().value(), 200);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
}

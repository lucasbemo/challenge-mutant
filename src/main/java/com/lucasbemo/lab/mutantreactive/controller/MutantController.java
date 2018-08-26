package com.lucasbemo.lab.mutantreactive.controller;

import com.lucasbemo.lab.mutantreactive.vo.MutantVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucasbemo
 */
@RestController
@RequestMapping("/mutant")
public class MutantController {

    @PostMapping("/")
    public ResponseEntity<MutantVo> isMutant(@RequestBody MutantVo vo) {
        if (vo.isMutant())
            return new ResponseEntity<MutantVo>(vo, HttpStatus.OK);
        else
            return new ResponseEntity<MutantVo>(vo , HttpStatus.FORBIDDEN);
    }
}

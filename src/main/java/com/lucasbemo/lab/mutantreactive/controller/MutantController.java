package com.lucasbemo.lab.mutantreactive.controller;

import com.lucasbemo.lab.mutantreactive.entity.VerificationEvent;
import com.lucasbemo.lab.mutantreactive.repository.VerificationEventRepository;
import com.lucasbemo.lab.mutantreactive.vo.MutantVo;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public VerificationEventRepository verificaionEventRepo;

    @PostMapping("/")
    public ResponseEntity<MutantVo> isMutant(@RequestBody MutantVo vo) {
        if (vo.isMutant()) {
            verificaionEventRepo.save(new VerificationEvent(true));
            return new ResponseEntity<MutantVo>(vo, HttpStatus.OK);
        }
        else {
            verificaionEventRepo.save(new VerificationEvent(false));
            return new ResponseEntity<MutantVo>(vo, HttpStatus.FORBIDDEN);
        }
    }
}

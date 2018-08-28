package com.lucasbemo.lab.mutantreactive.controller;

import com.lucasbemo.lab.mutantreactive.entity.VerificationEvent;
import com.lucasbemo.lab.mutantreactive.repository.VerificationEventRepository;
import com.lucasbemo.lab.mutantreactive.vo.MutantVo;
import com.lucasbemo.lab.mutantreactive.vo.StatsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author lucasbemo
 */
@RestController
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    public VerificationEventRepository verificaionEventRepo;

    @GetMapping("/")
    public ResponseEntity<StatsVo> isMutant() {
        Long ttlHuman = verificaionEventRepo.countByIsMutant(false);
        Long ttlMutant = verificaionEventRepo.countByIsMutant(true);

        return new ResponseEntity<StatsVo>(new StatsVo(ttlHuman, ttlMutant), HttpStatus.OK);
    }
}

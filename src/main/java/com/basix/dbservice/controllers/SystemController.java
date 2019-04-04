package com.basix.dbservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.basix.dbservice.repositories.SystemRepository;

import java.util.List;

@RestController
@RequestMapping({"/systems"})
public class SystemController {
    private SystemRepository systemRepository;

    SystemController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    @GetMapping({"/ping"})
    public ResponseEntity<String> ping() {
        return new ResponseEntity<>("PONG", HttpStatus.OK);
    }

    @GetMapping({"/all"})
    public List findAll() {
        return systemRepository.findAll();
    }

}

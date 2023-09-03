package com.cmr.wassini.Controllers;

import com.cmr.wassini.Models.Enfant;
import com.cmr.wassini.Services.EnfantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/enfants")
public class EnfantController {

    private final EnfantService enfantService;

    public EnfantController(EnfantService enfantService) {
        this.enfantService = enfantService;
    }

    @GetMapping
    public ResponseEntity<List<Enfant>> getAllEnfant(){
        List<Enfant> enfants = enfantService.findAllEnfant();
        return new ResponseEntity<>(enfants, HttpStatus.OK);
    }
}

package com.cmr.wassini.Controllers;

import com.cmr.wassini.Models.Defunt;
import com.cmr.wassini.Models.Enfant;
import com.cmr.wassini.Services.DefuntService;
import com.cmr.wassini.Services.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {
    private final DefuntService defuntService;
    private final EnfantService enfantService;

    @Autowired
    public Controller(DefuntService defuntService, EnfantService enfantService) {
        this.defuntService = defuntService;
        this.enfantService = enfantService;
    }

    //Defunts methods
    @GetMapping("/defunts")
    public ResponseEntity<List<Defunt>> getAllDefunts(){
        List<Defunt> defunts = defuntService.findAllDefunt();
        return new ResponseEntity<>(defunts, HttpStatus.OK);
    }

    @GetMapping("/defunts/{id}")
    public ResponseEntity<Optional<Defunt>> getDefuntById(@PathVariable("id") String cin){
        Optional<Defunt> defunt = defuntService.findDefuntByCIN(cin);
        return new ResponseEntity<>(defunt, HttpStatus.OK);
    }


    @PostMapping("/defunts")
    public ResponseEntity<Defunt> addDefunt(@RequestBody Defunt defunt){
        Defunt newDefunt = defuntService.addDefunt(defunt);
        return new ResponseEntity<>(defunt, HttpStatus.CREATED);
    }

    @PutMapping("/defunts")
    public ResponseEntity<Defunt> updateDefunt(@RequestBody Defunt defunt){
        Defunt newDefunt = defuntService.updateDefunt(defunt);
        return new ResponseEntity<>(defunt, HttpStatus.OK);
    }

    @DeleteMapping("/defunts/{id}")
    public ResponseEntity<?> deleteDefunt(@PathVariable("id") String cin){
        defuntService.deleteDefunt(cin);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //Enfants methods
    @GetMapping("/enfants")
    public ResponseEntity<List<Enfant>> getAllEnfants(){
        List<Enfant> enfants = enfantService.findAllEnfant();
        return new ResponseEntity<>(enfants, HttpStatus.OK);
    }

    @GetMapping("/enfants/{id}")
    public ResponseEntity<List<Enfant>> getEnfantsByCinDefunt(@PathVariable("id") String cin){
        List<Enfant> enfants = enfantService.findEnfantByDefunt(cin);
        return new ResponseEntity<>(enfants, HttpStatus.OK);
    }

    @PostMapping("/defunts/{id}/enfants")
    public ResponseEntity<Enfant> addEnfant(@PathVariable("id") String cin, @RequestBody Enfant enfant){


        Enfant newEnfant = defuntService.findDefuntByCIN(cin).map(defunt -> {
            enfant.setDefunt(defunt);
            return enfantService.addEnfant(enfant);
        }).orElseThrow();
        return new ResponseEntity<>(newEnfant, HttpStatus.CREATED);
    }
}

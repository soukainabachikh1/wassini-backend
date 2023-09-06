package com.cmr.wassini.Services;

import com.cmr.wassini.Models.Defunt;
import com.cmr.wassini.Repo.DefuntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefuntService {

    private final DefuntRepo defuntRepo;

    @Autowired
    public DefuntService(DefuntRepo defuntRepo) {
        this.defuntRepo = defuntRepo;
    }

    public Defunt addDefunt(Defunt defunt){
        Defunt newDefunt = new Defunt();
        newDefunt.setCin(defunt.getCin()); // Set the CIN value
        newDefunt.setRetired(defunt.isRetired());
        newDefunt.setHasChildren(defunt.isHasChildren());
        return defuntRepo.save(defunt);
    }

    public Optional<Defunt> findDefuntByCIN(String cin){
        return defuntRepo.findById(cin);
    }

    public List<Defunt> findAllDefunt(){
        return defuntRepo.findAll();
    }

    public Defunt updateDefunt(Defunt defunt){
        return defuntRepo.save(defunt);
    }

    public void deleteDefunt(String cin){
        defuntRepo.deleteById(cin);
    }

}

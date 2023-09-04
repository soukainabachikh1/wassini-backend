package com.cmr.wassini.Services;

import com.cmr.wassini.Models.Enfant;
import com.cmr.wassini.Repo.EnfantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfantService {
    private final EnfantRepo enfantRepo;

    @Autowired
    public EnfantService(EnfantRepo enfantRepo) {
        this.enfantRepo = enfantRepo;
    }

    public Enfant addEnfant(Enfant enfant){
        return enfantRepo.save(enfant);
    }

    public List<Enfant> findAllEnfant(){
        return enfantRepo.findAll();
    }

    public List<Enfant> findEnfantByDefunt(String cin){
        return enfantRepo.findEnfantByDefuntCin(cin);
    }

    public Enfant updateEnfant(Enfant enfant){
        return enfantRepo.save(enfant);
    }

    public void deleteEnfant(Long id){
        enfantRepo.deleteById(id);
    }
}

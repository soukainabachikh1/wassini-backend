package com.cmr.wassini.Services;

import com.cmr.wassini.Models.Conjoint;
import com.cmr.wassini.Repo.ConjointRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConjointService {
    private final ConjointRepo conjointRepo;

    @Autowired
    public ConjointService(ConjointRepo conjointRepo) {
        this.conjointRepo = conjointRepo;
    }

    public Conjoint addConjoint(Conjoint conjoint){
        return conjointRepo.save(conjoint);
    }

    public List<Conjoint> findAllConjoint(){
        return conjointRepo.findAll();
    }

    public List<Conjoint> findConjointByDefuntCin(String cin){
        return conjointRepo.findConjointByDefuntCin(cin);
    }

    public Conjoint updateConjoint(Conjoint conjoint){
        return conjointRepo.save(conjoint);
    }

    public void deleteConjoint(Long id){
        conjointRepo.deleteById(id);
    }
}

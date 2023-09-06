package com.cmr.wassini.Repo;

import com.cmr.wassini.Models.Enfant;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface EnfantRepo extends JpaRepository<Enfant, Long> {

    public List<Enfant> findEnfantByDefuntCin(String cin);

    @Transactional
    void deleteByDefuntCin(String cin);


}

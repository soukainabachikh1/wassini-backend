package com.cmr.wassini.Repo;

import com.cmr.wassini.Models.Conjoint;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConjointRepo extends JpaRepository<Conjoint, Long> {

    public List<Conjoint> findConjointByDefuntCin(String cin);

    @Transactional
    void deleteByDefuntCin(String cin);
}

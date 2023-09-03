package com.cmr.wassini.Repo;

import com.cmr.wassini.Models.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfantRepo extends JpaRepository<Enfant, Long> {

    void deleteEnfantById(Long id);
}

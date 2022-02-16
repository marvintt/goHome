package org.factoriaf5.gohome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoHomeRepository extends JpaRepository<GoHome, Long> {

}

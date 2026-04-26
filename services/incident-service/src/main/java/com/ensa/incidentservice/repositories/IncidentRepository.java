package com.ensa.incidentservice.repositories;

import com.ensa.incidentservice.entities.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {
    // Hna Spring ghadi i-3tik ga3 l-khidmat: save, findAll, delete... bla koutba
}
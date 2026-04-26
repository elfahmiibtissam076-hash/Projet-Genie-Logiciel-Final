package com.ensa.incidentservice.services;

import com.ensa.incidentservice.entities.Incident;
import com.ensa.incidentservice.repositories.IncidentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IncidentService {
    private final IncidentRepository repository;

    // Injection de dépendance pour parler à la base de données
    public IncidentService(IncidentRepository repository) {
        this.repository = repository;
    }

    // Votre première logique : Tout nouvel incident commence avec le statut "NEW"
    public Incident créerIncident(Incident i) {
        i.setStatut("NEW");
        return repository.save(i);
    }

    // Pour récupérer tous les incidents (utile pour votre futur Chatbot)
    public List<Incident> getAllIncidents() {
        return repository.findAll();
    }
}

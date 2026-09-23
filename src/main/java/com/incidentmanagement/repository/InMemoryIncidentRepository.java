package com.incidentmanagement.repository;

import com.incidentmanagement.domain.Incident;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryIncidentRepository implements IncidentRepository {

    private final Map<Long, Incident> incidents = new HashMap<>();

    @Override
    public void save(Incident incident) {
        incidents.put(incident.getId(), incident);
    }

    @Override
    public Incident findById(long id) {
        return incidents.get(id);
    }

    @Override
    public List<Incident> findAll() {
        return new ArrayList<>(incidents.values());
    }

    @Override
    public void deleteById(long id) {
        incidents.remove(id);
    }
}
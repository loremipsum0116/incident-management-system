package com.incidentmanagement.repository;

import com.incidentmanagement.domain.Incident;
import java.util.List;

public interface IncidentRepository {

    void save(Incident incident);

    Incident findById(long id);

    List<Incident> findAll();

    void deleteById(long id);

}

package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// TODO Check if phrase @Transitional is needed
@Repository
public interface EmployerRepository extends CrudRepository<Job, Integer> {
}

package com.ibaseit.examples.jpa.repository;

import org.springframework.data.repository.CrudRepository;


import com.ibaseit.examples.jpa.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

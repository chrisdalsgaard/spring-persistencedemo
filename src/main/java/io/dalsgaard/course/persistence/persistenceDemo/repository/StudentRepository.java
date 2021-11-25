package io.dalsgaard.course.persistence.persistenceDemo.repository;

import io.dalsgaard.course.persistence.persistenceDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

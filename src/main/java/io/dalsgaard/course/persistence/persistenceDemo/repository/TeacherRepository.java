package io.dalsgaard.course.persistence.persistenceDemo.repository;

import io.dalsgaard.course.persistence.persistenceDemo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}

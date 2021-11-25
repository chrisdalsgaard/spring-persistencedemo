package io.dalsgaard.course.persistence.persistenceDemo.repository;

import io.dalsgaard.course.persistence.persistenceDemo.model.Course;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {


}

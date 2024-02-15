package ru.antonio.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ru.antonio.teachers.model.Teacher;

import java.util.List;

@Component
public interface TeachRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findByExperience(int experience);

    List<Teacher> findBySubject(String subject);

    List<Teacher> findByOrderByName();

    List<Teacher> findByOrderByExperience();

    List<Teacher> findByOrderBySubject();
}

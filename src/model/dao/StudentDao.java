package model.dao;

import model.entities.Student;

import java.util.List;
import java.util.Locale;

public interface StudentDao {

    void create(Student student);
    List<Student> getAll();

    boolean daleteById(Long id);
    Student updateById(Long id,Student student);

    List<Student> searchByName(String name);


    mapper.StudentMapper save(Student student);
}


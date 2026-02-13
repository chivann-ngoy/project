package model.service;

import mapper.StudentMapper;
import model.dao.StudentDao;
import model.dto.StudentRequestDto;
import model.dto.StudentResponseDto;
import model.entities.Student;

import java.time.LocalDate;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao;
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentDao studentDao, StudentMapper studentMapper) {
        this.studentDao = studentDao;
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentResponseDto createStudent(StudentRequestDto requestDto) {
        if (requestDto.birthDate().isAfter(LocalDate.now().minusYears(4))) {
            throw new IllegalArgumentException("Student age must be less than 4 years");
        }
        Student student = studentMapper.fromStudentRequestDto(requestDto);
        StudentMapper saveStudent = studentDao.save(student);
        return studentMapper.toStudentResponseDto(saveStudent);
    }

    @Override
    public List<StudentResponseDto> getAllStudents() {
        return List.of();
    }

    @Override
    public boolean removeStudentById(Integer id) {
        return false;
    }
}
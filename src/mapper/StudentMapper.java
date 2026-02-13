package mapper;

import model.dto.StudentRequestDto;
import model.dto.StudentResponseDto;
import model.entities.Student;

import java.time.LocalDate;

public class StudentMapper {

    public Student fromStudentRequestDto(StudentRequestDto requestDto) {
        return new Student(
                requestDto.fullName(),
                requestDto.birthDate(),  // Already a LocalDate
                Student.valueOf(requestDto.gender().toUpperCase())
        );
    }

    public StudentResponseDto toStudentResponseDto(StudentMapper student) {
        return StudentResponseDto.builder()
                .id(Long.valueOf(student.getId()))
                .fullName(student.getFullName())
                .gender(student.getGender().toString())
                .dateOfBirth(student.getBirthDate())
                .build();
    }

    private LocalDate getBirthDate() {
        return null;
    }

    private String getFullName() {
        return null;
    }

    private long getId() {
        return 0;
    }

    private Boolean getGender() {
        return null;
    }

}
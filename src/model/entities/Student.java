package model.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.Random;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private Long id;
    private String fullName;
    private LocalDate dateOfBirth;
    private char Gender;

    public Student(String fullName , LocalDate dateOfBirth){
        this.id = new Random().nextLong();
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String s, LocalDate localDate, Object o) {

    }


    public static Object valueOf(String upperCase) {
        return null;
    }
}

package controller;

import mapper.Student;
import view.StudentView;

public class StudentController {

    private final Student student;
    private final StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void create() {
//        System.out.print("Enter ID: ");
//        Long id = Long.parseLong(scanner.nextLine());
//        System.out.print("Enter Name: ");
//        String fullName = scanner.nextLine();
//        System.out.print("Enter date of birth(2000-04-12): ");
//        String dateOfBirth = scanner.nextLine();
//        String[] parts = dateOfBirth.split("-");
//        int year = Integer.parseInt(parts[0]);
//        int month = Integer.parseInt(parts[1]);
//        int day = Integer.parseInt(parts[2]);
//        LocalDate dob = LocalDate.of(year, month, day);
//
//        student.setId(id);
//        student.setFullName(fullName);
//        student.setDateOfBirth(dob);


        Student student = studentView.createStudent();
        student.create(student);
    }

    public void remove() {
        Long id = studentView.showIdInput();
        if (studentView.deleteById(id)) {
            System.out.println("Remove Successfully ");

        } else {
            System.out.print("Failed to remove:");
        }
    }


    public void showData() {
        studentView.displayStudent(studentView.getAll());
    }

    public void update(){
        Long id = studentView.showIdInput();
        Student studentUpdate = studentView.createStudent();
        Object stuToUpdate = null;
        studentUpdate.updatedById(id ,stuToUpdate);
    }


    public void searchByName() {
        String name = studentView.showNameInput();
        studentView.searchByName(name);

    }

    public void run() {
        while (true) {
            int option = studentView.showMenuAndGetOption();

            switch (option) {
                case 1 -> create();
                case 2 -> showData();
                case 3 -> remove();
                case 4 -> searchByName();
                case 0 -> {
                    for (char ch : "Exiting...".toCharArray()) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(ch);
                    }
                    System.exit(0);
                }
            }
        }
    }

}
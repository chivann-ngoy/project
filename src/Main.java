import controller.StudentController;

import mapper.Student;
import model.dao.StudentDaoImpl;
import view.StudentView;

public class Main {

    public static void main(String[] args) {

//        Student student = new Student();
//        StudentView view = new StudentView();
//        StudentController controller = new StudentController(student, view);
//
//        controller.create(new Scanner(System.in));
//        controller.showData();

//         Student student = new Student();
        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller;
        controller = new StudentController(student, view);

        controller.create();
        controller.showData();

        controller.run();


    }

}



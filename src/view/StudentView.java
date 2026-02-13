package view;

import mapper.Student;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;




import java.time.LocalDate;
import java.util.Scanner;


public class StudentView {

    private static final Scanner scanner = new Scanner(System.in);
    public Student createStudent(){
        System.out.print(" [+] Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("[+] Enter Date of Birth (Format : 2000-12-31: ");
        String dob = scanner.nextLine();
        String [] parts = dob.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        LocalDate dateOfbirth = LocalDate.of(year,month,day);
        return new Student(name,dateOfbirth);

    }



//    public void displayStudent(Student student) {
//        Table table = new Table(
//                3, BorderStyle.CLASSIC
//        );
//        table.addCell(
//                "Student Details",
//                new CellStyle(CellStyle.HorizontalAlign.center),
//                3);
//
//        // student data
//        table.addCell(" ID ");
//        table.addCell(student.getId().toString(), 2);
//        table.addCell(" Full Name ");
//        table.addCell(student.getFullName(), 2);
//        table.addCell(" Date of Birth ");
//        table.addCell(student.getDateOfBirth().toString(), 2);
//
//        System.out.println(table.render());
//    }

    public void displayStudent(Student student){
        Table table = new Table(
                3,BorderStyle.UNICODE_BOX_DOUBLE_BORDER
        );
        table.addCell("Student Datails",
                new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell("ID");
        table.addCell(student.getId());
        table.addCell("Full Name");
        table.addCell(student.getFullName(),2);
        table.addCell(String.valueOf(student));

    }

    public Long showIdInput(){
        System.out.print("[!] Enter id to remove:");
        return Long.parseLong(scanner.nextLine());
    }

    public String showNameInput(){
        System.out.println("[!] Enter name to search:");
        return scanner.nextLine();
    }

    public int showMenuAndGetOption(){
        System.out.println("""
                1,Create
                2,Display All Students
                3.Remove Student
                4.Search By name
                0.Exit
                """);
        System.out.println("Choose an option :");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean deleteById(Long id) {
        return false;
    }

    public Student getAll() {
        return null;
    }

    public void searchByName(String name) {
        return;
    }
}

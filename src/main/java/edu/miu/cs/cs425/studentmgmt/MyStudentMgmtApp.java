package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Course;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyStudentMgmtApp implements CommandLineRunner {

    @Autowired
    StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Initializing data...");
        Transcript transcript = new Transcript("BS Computer Science");

        Classroom classroom = new Classroom("McLaughlin building", "M105");

        Course course = new Course("CS401", "Modern Prog Practices");

        Student student = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.parse("2019-05-24"), transcript, classroom, course);
        Student savedStudent = studentService.addNewStudent(student);
    }
}

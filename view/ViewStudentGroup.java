package QA_HomeWork_Sem5_OOP.view;

import QA_HomeWork_Sem5_OOP.model.Student;
import QA_HomeWork_Sem5_OOP.model.StudentGroup;

public class ViewStudentGroup {
    public static void displayStudentGroup(StudentGroup studentGroup) {
        System.out.println("Преподаватель: " + studentGroup.getTeacher().getUserId() + " - " + studentGroup.getTeacher().getName());
        System.out.println("Студенты:");
        for (Student student : studentGroup.getStudents()) {
            System.out.println("- " + student.getUserId() + " - " + student.getName());
        }
    }
}



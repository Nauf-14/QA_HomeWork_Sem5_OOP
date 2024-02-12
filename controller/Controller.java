package QA_HomeWork_Sem5_OOP.controller;

import QA_HomeWork_Sem5_OOP.model.StudentGroup;
import QA_HomeWork_Sem5_OOP.model.Teacher;
import QA_HomeWork_Sem5_OOP.model.Student;
import QA_HomeWork_Sem5_OOP.service.StudentGroupService;

import java.util.List;

public class Controller {
    public static StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        StudentGroupService studentGroupService = new StudentGroupService();
        return studentGroupService.createStudentGroup(teacher, students);
    }
}




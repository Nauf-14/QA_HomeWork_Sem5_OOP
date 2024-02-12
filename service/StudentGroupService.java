package QA_HomeWork_Sem5_OOP.service;

import QA_HomeWork_Sem5_OOP.model.Student;
import QA_HomeWork_Sem5_OOP.model.StudentGroup;
import QA_HomeWork_Sem5_OOP.model.Teacher;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}


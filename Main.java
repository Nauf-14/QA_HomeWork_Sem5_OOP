package QA_HomeWork_Sem5_OOP;

import QA_HomeWork_Sem5_OOP.model.StudentGroup;
import QA_HomeWork_Sem5_OOP.model.Teacher;
import QA_HomeWork_Sem5_OOP.model.Student;
import QA_HomeWork_Sem5_OOP.controller.Controller;
import QA_HomeWork_Sem5_OOP.view.ViewStudentGroup;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем некоторые тестовые данные
        Teacher teacher = new Teacher(1, "Иван Иванович");
        List<Student> students = Arrays.asList(new Student(101, "Алиса"), new Student(102, "Боб"), new Student(103, "Чарли"));

        // Вызываем контроллер для создания учебной группы
        StudentGroup studentGroup = Controller.createStudentGroup(teacher, students);

        // Отображаем учебную группу с помощью представления
        ViewStudentGroup.displayStudentGroup(studentGroup);
    }
}




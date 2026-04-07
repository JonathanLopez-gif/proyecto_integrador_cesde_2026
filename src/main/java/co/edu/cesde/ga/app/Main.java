package co.edu.cesde.ga.app;

import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.repository.StudentRepository;
import co.edu.cesde.ga.repository.impl.StudentRepositoryInMemory;

public class Main {

    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepositoryInMemory();
        StudentService studentService = new StudentServiceImpl(studentRepository);

        Student student = new Student();

    }

}

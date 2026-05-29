package co.edu.cesde.ga.repository.impl;

import co.edu.cesde.ga.model.Teacher;
import co.edu.cesde.ga.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryInMemory implements TeacherRepository  {

    private List<Teacher> teachers;
    private Long nextTeacherId;

    public TeacherRepositoryInMemory(){
        this.teachers = new ArrayList<>();
        this.nextTeacherId = 1L;
    }

    @Override
    public Teacher create(Teacher teacher){
        if (teacher == null){
            return null;
        }
        // Nota: El servicio ya debería validar esto, pero se deja como salvaguarda básica de persistencia
        if (existsByDocumentNumber(teacher.getDocumentNumber())){
            return null;
        }

        teacher.setTeacherId(nextTeacherId++);
        teachers.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> findAll() {
        return new ArrayList<>(teachers);
    }

    @Override
    public Teacher findById(Long teacherId){
        if (teacherId == null){
            return null;
        }

        for (Teacher teacher : teachers){
            if (teacherId.equals(teacher.getTeacherId())){
                return teacher;
            }
        }
        return null; // El repositorio retorna null si no existe; el servicio lanzará la excepción
    }

    @Override
    public Teacher findByDocumentNumber(String documentNumber){
        if (documentNumber == null || documentNumber.isBlank()){
            return null;
        }

        for (Teacher teacher : teachers){
            if (documentNumber.equals(teacher.getDocumentNumber())){
                return teacher;
            }
        }
        return null;
    }

    @Override
    public boolean update(Teacher teacher){
        if (teacher == null || teacher.getTeacherId() == null) return false;

        // CORRECCIÓN: Validar que el documento no pertenezca a OTRO maestro diferente
        Teacher existingTeacherWithDoc = findByDocumentNumber(teacher.getDocumentNumber());
        if (existingTeacherWithDoc != null && !existingTeacherWithDoc.getTeacherId().equals(teacher.getTeacherId())){
            return false;
        }

        for (int i = 0; i < teachers.size(); i++){
            if (teacher.getTeacherId().equals(teachers.get(i).getTeacherId())){
                teachers.set(i, teacher);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Long teacherId){
        Teacher teacher = findById(teacherId);
        if (teacher == null) return false;

        teachers.remove(teacher);
        return true;
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber){
        if (documentNumber == null || documentNumber.isEmpty()){
            return false;
        }
        return findByDocumentNumber(documentNumber) != null;
    }

    @Override
    public int count(){
        return teachers.size();
    }

}
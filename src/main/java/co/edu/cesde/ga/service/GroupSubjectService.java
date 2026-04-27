package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.GroupSubject;

import java.util.List;

public interface GroupSubjectService {

    GroupSubject create(GroupSubject groupSubject);

    List<GroupSubject> findAll();

    GroupSubject findById(Long groupSubjectId);

    boolean update(GroupSubject groupSubject);

    boolean delete(Long groupSubjectId);

    int count();

}

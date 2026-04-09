package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.GroupSubject;

import java.util.List;

public interface GroupSubjectService {

    GroupSubject create(GroupSubject groupSubject);

    GroupSubject findById(Long groupSubjectId);

    List<GroupSubject> findAll();

    boolean update(GroupSubject groupSubject);

    boolean delete(Long groupSubjectId);

}

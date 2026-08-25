package co.edu.cesde.am.application.service;

import co.edu.cesde.am.domain.model.GroupSubject;

import java.util.List;

public interface GroupSubjectService {

    GroupSubject create(GroupSubject groupSubject);

    List<GroupSubject> findAll();

    GroupSubject findById(Long groupSubjectId);

    boolean update(GroupSubject groupSubject);

    boolean delete(Long groupSubjectId);

    int count();

}

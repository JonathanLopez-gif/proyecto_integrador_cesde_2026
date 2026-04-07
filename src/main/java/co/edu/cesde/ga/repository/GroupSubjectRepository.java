package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.GroupSubject;

import java.util.List;

public interface GroupSubjectRepository {

    GroupSubject create (GroupSubject groupSubject);

    List<GroupSubject> findAll();

    GroupSubject findById(Long groupSubjectId);

    boolean update(GroupSubject groupSubject);

    boolean delete(Long groupSubjectId);

    int count();

}

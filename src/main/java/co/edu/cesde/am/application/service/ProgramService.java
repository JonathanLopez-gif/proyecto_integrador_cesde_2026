package co.edu.cesde.am.application.service;

import co.edu.cesde.am.domain.model.Program;

import java.util.List;

public interface ProgramService {

    Program create(Program program);

    List<Program> findAll();

    Program findById(Long programId);

    boolean update(Program program);

    boolean delete(Long programId);

    int count();

}

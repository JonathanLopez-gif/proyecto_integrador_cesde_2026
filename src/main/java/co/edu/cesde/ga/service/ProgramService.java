package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Program;

import java.util.List;

public interface ProgramService {

    Program create(Program program);

    List<Program> findAll();

    Program findById(Long programId);

    boolean update(Program program);

    boolean delete(Long programId);

    int count();

}

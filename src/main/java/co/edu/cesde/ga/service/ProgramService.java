package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Program;

import java.util.List;

public interface ProgramService {

    Program create(Program program);

    Program findById(Long programId);

    List<Program> findAll();

    boolean update(Program program);

    boolean delete(Long programId);

}

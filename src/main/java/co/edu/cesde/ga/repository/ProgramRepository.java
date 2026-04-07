package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Period;
import co.edu.cesde.ga.model.Program;

import java.util.List;

public interface ProgramRepository {

    Program create(Program program);

    List<Program> findAll();

    Program findById(Long programId);

    boolean update(Program program);

    boolean delete(Long programId);

    int count();

}

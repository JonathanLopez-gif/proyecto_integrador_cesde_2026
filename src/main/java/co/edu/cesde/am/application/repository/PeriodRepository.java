package co.edu.cesde.am.application.repository;

import co.edu.cesde.am.domain.model.Period;

import java.util.List;

public interface PeriodRepository {

    Period create(Period period);

    List<Period> findAll();

    Period findById(Long periodId);

    boolean update(Period period);

    boolean delete(Long periodId);

    int count();

}

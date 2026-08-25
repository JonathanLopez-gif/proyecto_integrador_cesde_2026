package co.edu.cesde.am.infrastructure.repository.impl;


import co.edu.cesde.am.domain.model.Period;
import co.edu.cesde.am.application.repository.PeriodRepository;

import java.util.ArrayList;
import java.util.List;

    public class PeriodJpaRepository implements PeriodRepository {

        // Atributos

        private List<Period> periods;
        private Integer nextPeriodId;

        // Constructor

        public PeriodJpaRepository(){
            this.periods = new ArrayList<>();
            this.nextPeriodId = 1;
        }

        // Sobrecarga de métodos

        @Override
        public Period create(Period period) {

            if (period == null){
                return null;
            }

            period.setPeriodId(nextPeriodId++);
            periods.add(period);
            return period;

        }

        @Override
        public List<Period> findAll() {

            return new ArrayList<>(periods);

        }

        @Override
        public Period findById(Long periodId){

            if (periods == null){
                return null;
            }

            for (Period period : periods){

                if (periodId.equals(period.getPeriodId())){
                    return period;
                }

            }

            return null;
        }

        @Override
        public boolean update(Period period) {

            if (period == null) return false;

            for (int i = 0; i < periods.size(); i++){

                if (period.getPeriodId().equals(periods.get(i).getPeriodId())){

                    periods.set(i, period);

                    return true;

                }

            }

            return false;

        }

        @Override
        public boolean delete(Long periodId){

            Period period = findById(periodId);

            if (period == null) return false;

            periods.remove(period);

            return true;

        }

        @Override
        public int count(){
            return periods.size();
        }

    }


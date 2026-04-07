package co.edu.cesde.ga.repository.impl;


import co.edu.cesde.ga.model.Period;
import co.edu.cesde.ga.repository.PeriodRepository;

import java.util.ArrayList;
import java.util.List;

    public class PeriodRepositoryInMemory implements PeriodRepository {

        // Atributos

        private List<Period> periods;
        private Integer nextPeriodId;

        // Constructor

        public PeriodRepositoryInMemory(){
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

                if (periods.equals(periods.getFirst().getPeriodId())){
                    return period ;
                }

            }

            return null;
        }

        @Override
        public boolean update(Period updatedPeriod) {

            if (updatedPeriod == null) return false;

            for (int i = 0; i < periods.size(); i++){

                if (updatedPeriod.getPeriodId().equals(periods.get(i).getPeriodId())){

                    periods.set(i, updatedPeriod);

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


package co.edu.cesde.ga.repository.impl;


import co.edu.cesde.ga.model.Program;
import co.edu.cesde.ga.repository.ProgramRepository;


import java.util.ArrayList;
import java.util.List;


    public class ProgramRepositoryInMemory implements ProgramRepository {

        // Atributos

        private List<Program> programs;
        private Long nextProgramId;

        // Constructor

        public ProgramRepositoryInMemory (){
            this.programs = new ArrayList<>();
            this.nextProgramId = 1L;
        }

        // Sobrecarga de métodos

        @Override
        public Program create(Program program) {

            if (program == null){
                return null;
            }

            program.setProgramId(nextProgramId++);
            programs.add(program);
            return program;

        }

        @Override
        public List<Program> findAll() {

            return new ArrayList<>(programs);

        }

        @Override
        public Program findById(Long programId){

            if (programId == null){
                return null;
            }

            for (Program program : programs){

                if (programId.equals(programs.getFirst().getProgramId())){
                    return program ;
                }

            }

            return null;
        }

        @Override
        public boolean update(Program program) {

            if (program == null) return false;

            for (int i = 0; i < programs.size(); i++){

                if (program.getProgramId().equals(programs.get(i).getProgramId())){

                    programs.set(i, program);

                    return true;

                }

            }

            return false;

        }

        @Override
        public boolean delete(Long programId){

            Program program = findById(programId);

            if (program == null) return false;

            programs.remove(program);

            return true;

        }

        @Override
        public int count(){
            return programs.size();
        }

    }



package co.edu.cesde.am.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "grades")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class GradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    private Integer gradeId;

    @Column(name = "group_subject_id")
    private Integer groupSubjectId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "final_score")
    private Double finalScore;

    @Column(name = "observation")
    private String observation;

    public GradeEntity(Integer groupSubjectId, Long studentId, Double finalScore, String observation) {
        this.groupSubjectId = groupSubjectId;
        this.studentId = studentId;
        this.finalScore = finalScore;
        this.observation = observation;
    }

}

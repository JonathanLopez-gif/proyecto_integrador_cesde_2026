package co.edu.cesde.am.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "subjects")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "credits")
    private Integer credits;

    @Column(name = "program_id")
    private Long programId;

    public SubjectEntity(String code, String name, Integer credits, Long programId) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.programId = programId;
    }

}

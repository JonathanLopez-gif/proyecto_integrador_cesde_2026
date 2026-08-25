package co.edu.cesde.am.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "group_subjects")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class GroupSubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_subject_id")
    private Integer groupSubjectId;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "teacher_id")
    private Long teacherId;

    public GroupSubjectEntity(Integer groupId, Long subjectId, Long teacherId) {
        this.groupId = groupId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
    }

}

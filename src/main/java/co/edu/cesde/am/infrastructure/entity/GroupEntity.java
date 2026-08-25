package co.edu.cesde.am.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "groups")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class GroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "code")
    private String code;

    @Column(name = "program_id")
    private String programId;

    @Column(name = "period_id")
    private String periodId;

    @Column(name = "shift")
    private String shift;

    public GroupEntity(String code, String programId, String periodId, String shift) {
        this.code = code;
        this.programId = programId;
        this.periodId = periodId;
        this.shift = shift;
    }

}

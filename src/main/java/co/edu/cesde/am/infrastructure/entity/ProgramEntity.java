package co.edu.cesde.am.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "programs")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProgramEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")
    private Long programId;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    public ProgramEntity(String code, String name) {
        this.code = code;
        this.name = name;
    }

}

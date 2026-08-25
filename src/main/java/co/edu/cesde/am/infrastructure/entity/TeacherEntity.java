package co.edu.cesde.am.infrastructure.entity;

import co.edu.cesde.am.domain.model.PersonStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class TeacherEntity {

    @Id
    @Column(name = "teacher_id")
    private Long teacherId;

    @NotBlank(message = "El valor no puede estar vacío ni contener solo espacios")
    @Column(name = "document_type", nullable = false)
    private String documentType;

    @NotBlank(message = "El valor no puede estar vacío ni contener solo espacios")
    @Column(name = "document_number", nullable = false)
    private String documentNumber;

    @NotBlank(message = "El valor no puede estar vacío ni contener solo espacios")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "El valor no puede estar vacío ni contener solo espacios")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank(message = "El valor no puede estar vacío ni contener solo espacios")
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private PersonStatus personStatus;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public TeacherEntity(Long teacherId, String documentType, String documentNumber, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personStatus = PersonStatus.ACTIVE;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}
package co.edu.cesde.am.infrastructure.entity;

import co.edu.cesde.am.domain.model.EnrollmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "enrollments")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EnrollmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "enrollment_id")
    private String enrollmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private GroupEntity group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "period_id")
    private PeriodEntity period;

    @Enumerated(EnumType.STRING)
    @Column(name = "enrollment_status")
    private EnrollmentStatus enrollmentStatus;

    @Column(name = "enrolled_at")
    private LocalDate enrolledAt;

    public EnrollmentEntity(StudentEntity student, GroupEntity group, PeriodEntity period) {
        this.student = student;
        this.group = group;
        this.period = period;
        this.enrollmentStatus = EnrollmentStatus.ACTIVE;
        this.enrolledAt = LocalDate.now();
    }

}
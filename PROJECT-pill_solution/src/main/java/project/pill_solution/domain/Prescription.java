package project.pill_solution.domain;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "prescription")
public class Prescription {

    @Id @Column(name = "prescription_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescriptionId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "symptom_id")
    private Symptom symptom;

    @Column @Getter
    private String prescriptionName;

    @Column @Getter
    private String prescriptionDetail;

    @Column @Getter
    private String imageUrl;

    @Column @Getter
    private String prescriptionNumber;


}

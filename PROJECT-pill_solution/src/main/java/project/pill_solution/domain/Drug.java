package project.pill_solution.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "drug")
public class Drug {

    @Id
    @Column(name = "drug_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drugId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "symptom_id")
    private Symptom symptom;

    @Column @Getter
    private String drugName;

    @Column @Getter
    private String drugDetail;

    @Column @Getter
    private String imageUrl;

    @Column @Getter
    private String drugNumber;

    @Column @Getter
    private String drugEffect;

}

package project.pill_solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.pill_solution.domain.Drug;

public interface DrugRepository extends JpaRepository<Drug, Long> {


}

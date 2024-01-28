package repository;

import dto.BillDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BillDTO,Integer> {
}

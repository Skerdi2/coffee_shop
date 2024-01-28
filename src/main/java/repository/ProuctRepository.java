package repository;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProuctRepository extends JpaRepository<Product,Integer> {
}

package th.ac.ku.restaurant.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.restaurant.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

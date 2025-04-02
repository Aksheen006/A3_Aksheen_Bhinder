package ca.sheridancollege.bhindeak.a3_aksheen_bhinder.repository;

import ca.sheridancollege.bhindeak.a3_aksheen_bhinder.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package react.javaproject.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import react.javaproject.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

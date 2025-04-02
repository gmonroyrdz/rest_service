package mx.uam.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // This interface will automatically provide CRUD operations for the Employee entity
    // No need to implement any methods, Spring Data JPA will handle it for us
}

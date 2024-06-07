

import com.school.exam2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public java.util.List<T> findAll() {
        return employeeRepository.findAll();
    }

    // Other business logic
}
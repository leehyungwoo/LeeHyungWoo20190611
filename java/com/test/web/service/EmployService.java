package com.test.web.service;
import java.util.List;
import com.test.web.domain.EmployDTO;
import org.springframework.stereotype.Component;


/**
 * EmployService
 */
@Component
 public interface EmployService {   
    public void addEmploy(EmployDTO employ);
    public List<EmployDTO> findEmploys();
    public List<EmployDTO> findEmploysByOption(EmployDTO employ);
    public EmployDTO findEmployByemployId(String employ);
    public void updateEmploy(EmployDTO employ);
    public void deleteEmploy(EmployDTO employ);
}

 
package com.test.web.mapper;
import java.util.List;
import com.test.web.domain.EmployDTO;
import org.springframework.stereotype.Repository;

/**
 * EmployMapper
 */
@Repository
public interface EmployMapper {
    public void insertEmploy(EmployDTO employ);
    public List<EmployDTO> selectEmploys();
    public List<EmployDTO> selectEmploysByOption(EmployDTO employ);
    public EmployDTO selectEmployByemployId(String employ);
    public void updateEmploy(EmployDTO employ);
    public void deleteEmploy(EmployDTO employ);    
}
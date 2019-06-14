package com.test.web.serviceImpl;
import java.util.List;
import com.test.web.domain.EmployDTO;
import com.test.web.service.EmployService;
import org.springframework.stereotype.Service;


/**
 * EmployServiceImpl
 */
@Service
public class EmployServiceImpl implements EmployService {

    @Override
    public void addEmploy(EmployDTO employ) {

    }

    @Override
    public List<EmployDTO> findEmploys() {
        return null;
    }

    @Override
    public List<EmployDTO> findEmploysByOption(EmployDTO employ) {
        return null;
    }

    @Override
    public EmployDTO findEmployByemployId(String employ) {
        return null;
    }

    @Override
    public void updateEmploy(EmployDTO employ) {

    }

    @Override
    public void deleteEmploy(EmployDTO employ) {

    }


    
}

 
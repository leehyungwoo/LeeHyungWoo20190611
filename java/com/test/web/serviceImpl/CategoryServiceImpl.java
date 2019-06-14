package com.test.web.serviceImpl;
import java.util.List;
import com.test.web.domain.CategoryDTO;
import com.test.web.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * CategoryServiceImpl
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public void addCategory(CategoryDTO category) {

    }

    @Override
    public void deleteCategory(CategoryDTO category) {

    }

    @Override
    public CategoryDTO findCategoryBycategoryId(String category) {
        return null;
    }

    @Override
    public List<CategoryDTO> findCategorys() {
        return null;
    }

    @Override
    public List<CategoryDTO> findCategorysByOption(CategoryDTO category) {
        return null;
    }

    @Override
    public void updateCategory(CategoryDTO category) {

    }

  
}

 
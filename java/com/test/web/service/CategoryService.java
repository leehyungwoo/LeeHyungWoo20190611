package com.test.web.service;
import java.util.List;
import com.test.web.domain.CategoryDTO;
import org.springframework.stereotype.Component;


/**
 * CategoryService
 */
@Component
 public interface CategoryService {
    public void addCategory(CategoryDTO category);
    public List<CategoryDTO> findCategorys();
    public List<CategoryDTO> findCategorysByOption(CategoryDTO category);
    public CategoryDTO findCategoryBycategoryId(String category);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(CategoryDTO category);
}

 
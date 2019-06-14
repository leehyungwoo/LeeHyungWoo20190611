package com.test.web.mapper;
import java.util.List;
import com.test.web.domain.CategoryDTO;
import org.springframework.stereotype.Repository;

/**
 * CategoryMapper
 */
@Repository
public interface CategoryMapper {
    public void insertCategory(CategoryDTO category);
    public List<CategoryDTO> selectCategorys();
    public List<CategoryDTO> selectCategoriesByOption(CategoryDTO category);
    public CategoryDTO selectCategoryByCategoryId(String category);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(CategoryDTO category);
}
package allegroclone.allegroclone.services;


import allegroclone.allegroclone.entity.Category;
import allegroclone.allegroclone.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    CategoryRepo categoryRepo;

    @Autowired
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public List<Category> findAll(){
        return categoryRepo.findAll();
    }
}

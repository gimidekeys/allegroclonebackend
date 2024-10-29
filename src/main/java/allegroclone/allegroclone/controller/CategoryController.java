package allegroclone.allegroclone.controller;

import allegroclone.allegroclone.entity.Category;
import allegroclone.allegroclone.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category/findAll")
    @CrossOrigin
    public List<Category> findAll(){
        return categoryService.findAll();
    }
}

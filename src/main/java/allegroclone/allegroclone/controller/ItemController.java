package allegroclone.allegroclone.controller;

import allegroclone.allegroclone.entity.Item;
import allegroclone.allegroclone.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {



    ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/findById/{id}")
    @CrossOrigin
    public Item findById(@PathVariable("id") Long id){
        Optional<Item> item = itemService.findById(id);
        return item.get();
    }

    @GetMapping("/findByTitleIgnoreCase/{title}")
    @CrossOrigin
    public List<Item> findByTitleIgnoreCase(@PathVariable("title") String title){
        return  itemService.findByTitleIgnoreCase(title);
    }

    @GetMapping("/findByTitleIgnoreCase/{title}/category/{categoryName}")
    @CrossOrigin
    public List<Item> findByTitleAndCategory(@PathVariable("title") String title, @PathVariable("categoryName") String categoryName){
        return  itemService.findByTitleAndCategory("%"+title+"%", categoryName);
    }
}

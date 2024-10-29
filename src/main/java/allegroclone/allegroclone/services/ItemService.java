package allegroclone.allegroclone.services;

import allegroclone.allegroclone.entity.Item;
import allegroclone.allegroclone.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    ItemRepo itemRepo;

    @Autowired
    public ItemService(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    public List<Item> findByTitleIgnoreCase(String title){
        return itemRepo.findByTitleIgnoreCase(title);
    }

    public Optional<Item> findById(Long id){
        return itemRepo.findById(id);
    }

    public List<Item>findByTitleAndCategory(String title, String categoryName){
        return itemRepo.findItemsByItemsNameAndItemsCategory(title, categoryName);
    }
}

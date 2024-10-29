package allegroclone.allegroclone.repo;

import allegroclone.allegroclone.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepo extends JpaRepository<Item,Long> {

    List<Item> findByTitleIgnoreCase(String title);

    List<Item> findItemsByItemsNameAndItemsCategory(@Param("title") String title, @Param("name") String name);

}

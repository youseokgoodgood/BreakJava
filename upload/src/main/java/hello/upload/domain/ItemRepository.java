package hello.upload.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : hello.upload.domain
 * fileName       : ItemRepositiory
 * author         : sim-yuoseok
 * date           : 2025-08-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-17        sim-yuoseok       최초 생성
 */
@Repository
public class ItemRepository {

    private final Map<Long,Item> store = new HashMap<>();
    private long sequence = 0L;

    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id){
        return store.get(id);
    }


}

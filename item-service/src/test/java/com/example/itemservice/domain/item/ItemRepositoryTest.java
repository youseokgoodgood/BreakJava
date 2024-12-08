package com.example.itemservice.domain.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * author         : SYS
 * date           : 2024-12-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-08        SYS       최초 생성
 */
class ItemRepositoryTest {

    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach() {
        itemRepository.clearStore();
    }

    @Test
    void save(){
        //given
        Item item = new Item("itemA",10000,10);

        //when
        Item saveItem = itemRepository.save(item);

        //than
        Item findItem = itemRepository.findById(saveItem.getId());
        assertThat(findItem).isEqualTo(saveItem);
    }

    @Test
    void findAll(){
        //given
        Item item1 = new Item("itemA",10000,10);
        Item item2 = new Item("itemB",12000,20);

        itemRepository.save(item1);
        itemRepository.save(item2);

        //when
        List<Item> result = itemRepository.findAll();

        //than
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(item1, item2);
    }

    @Test
    void updateItem(){
        //given
        Item item = new Item("itemA",10000,10);
        Item saveItem = itemRepository.save(item);
        Long itemId = saveItem.getId();

        //when
        Item updateParam = new Item("itemB", 12000, 20);
        itemRepository.update(itemId, updateParam);

        //than
        Item findItem = itemRepository.findById(itemId);
        assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
        assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
        assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());
    }

}
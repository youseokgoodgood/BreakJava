package com.example.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

/**
 * author         : SYS
 * date           : 2024-12-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-08        SYS       최초 생성
 */

@Setter
@Getter
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {}

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


}

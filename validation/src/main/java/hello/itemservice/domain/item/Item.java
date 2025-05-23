package hello.itemservice.domain.item;

import lombok.Data;

import org.hibernate.validator.constraints.Range;
//import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000",message = "총합이 10000원 넘게 입력 해주세요.")
public class Item {

   //@NotNull(groups = UpdateCheck.class) //수정 요구사항 추가
    private Long id;

    //@NotBlank
    //@NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    private String itemName;

    //@NotNull
    //@Range(min = 1000, max = 1000000)
    //@NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    //@Range(min = 1000, max = 1000000, groups = {SaveCheck.class, UpdateCheck.class})
    private Integer price;

    //@NotNull
    //@Max(value = 9999)
    //@NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    //@Max(value = 9999, groups = {SaveCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

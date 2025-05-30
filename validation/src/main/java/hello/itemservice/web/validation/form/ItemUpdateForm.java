package hello.itemservice.web.validation.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * packageName    : hello.item service.web.validation.form
 * fileName       : ItemSaveForm
 * author         : wnsgh
 * date           : 2025-05-18
 * description    :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-05-18        wnsgh       최초 생성
 */

@Data
public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 1000000)
    private Integer price;

    //수정 시 수량은 자유롭게 변경 가능
    private Integer quantity;

}

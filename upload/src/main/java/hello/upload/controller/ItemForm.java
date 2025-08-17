package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * packageName    : hello.upload.controller
 * fileName       : ItemForm
 * author         : sim-yuoseok
 * date           : 2025-08-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-17        sim-yuoseok       최초 생성
 */

@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;
}

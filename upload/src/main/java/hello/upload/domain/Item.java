package hello.upload.domain;

import lombok.Data;

import java.util.List;

/**
 * packageName    : hello.upload.domain
 * fileName       : Item
 * author         : sim-yuoseok
 * date           : 2025-08-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-17        sim-yuoseok       최초 생성
 */
@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;


}

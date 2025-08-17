package hello.upload.domain;

import lombok.Data;

/**
 * packageName    : hello.upload.domain
 * fileName       : UploadFile
 * author         : sim-yuoseok
 * date           : 2025-08-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-17        sim-yuoseok       최초 생성
 */
@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }


}

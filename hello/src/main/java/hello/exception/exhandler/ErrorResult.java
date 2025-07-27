package hello.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * packageName    : hello.exception.exhandler
 * fileName       : ErrorResult
 * author         : sim-yuoseok
 * date           : 2025-07-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-07-27        sim-yuoseok       최초 생성
 */
@Data
@AllArgsConstructor
public class ErrorResult {
    private String code;
    private String message;
}

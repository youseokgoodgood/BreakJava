package hello.upload.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collection;

/**
 * packageName    : hello.upload.controller
 * fileName       : ServletUploadController
 * author         : sim-yuoseok
 * date           : 2025-08-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-12        sim-yuoseok       최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/servlet/v1")

public class ServletUploadController {

    @GetMapping("/upload")
    public String newFile() {
        return "upload-form";
    }

    @PostMapping("/upload")
    public String saveFileV1(HttpServletRequest request) throws ServletException, IOException {
        log.info("request:{}", request);

        String itemName = request.getParameter("itemName");
        log.info("itemName:{}", itemName);

        Collection<Part> parts = request.getParts();
        log.info("parts:{}", parts);

        return "upload-form";
    }
}

package hello.typeconveter.controller;

import hello.typeconveter.type.IpPort;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * packageName    : hello.typeconveter.controller
 * fileName       : ConverterController
 * author         : sim-yuoseok
 * date           : 2025-08-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-06        sim-yuoseok       최초 생성
 */
@Controller
public class ConverterController {

    @GetMapping("converter-view")
    public String converterView(Model model) {
        model.addAttribute("number",10000);
        model.addAttribute("ipPort",new IpPort("127.0.0.1",8080));
        return "converter-view";
    }

    @GetMapping("/converter/edit")
    public String converterForm(Model model) {
        IpPort ipPort = new IpPort("127.0.0.1", 8080);
        Form form = new Form(ipPort);
        model.addAttribute("form",form);
        return "converter-form";
    }

    @PostMapping("/converter/edit")
    public String converterEdit(@ModelAttribute("form") Form form, Model model) {
        IpPort ipPort = form.getIpPort();
        model.addAttribute("ipPort",ipPort);
        return "converter-view";
    }


    @Data
    static class Form {
        private IpPort ipPort;

        public Form(IpPort ipPort) {
            this.ipPort = ipPort;
        }
    }
}

package com.kc.filexfr.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/filexfr")
@Slf4j
public class StaticController {
    @GetMapping("/{mode}")
    public String transferMoney(@PathVariable String mode, Model model) {
        model.addAttribute("name", "imagek2122");
        log.info("mode is : " + mode);
        if (mode.equals("upload")) return "upload";
        else if (mode.equals("download")) return "download";
        else return "landing";
    }

    @PostMapping("/linktwo")
    public String listOrBrowse(@RequestParam String otp, Model model) {
        model.addAttribute("name", "imagek2122");
        log.info("otp is : " + otp);
        if (otp.equals("1")) return "upload";
            else return "download";
    }
}

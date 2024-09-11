package com.std.springboot_test1.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
@Controller
public class MainController {
    @GetMapping("/article/main")
    @ResponseBody
    public String showMain(){
        return "테스트";
    }
    @GetMapping("/")
    public String root() {
        return "redirect:/article/list";
    }
}

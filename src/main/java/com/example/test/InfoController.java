package com.example.test;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/info")
public class InfoController {
    
    @GetMapping("/ten")
    public String getTen(){
        return "Tôi là Hoàng Anh";
    }
    @GetMapping("/year")
    public int getYear() {
        return 2005;
    }
    
}

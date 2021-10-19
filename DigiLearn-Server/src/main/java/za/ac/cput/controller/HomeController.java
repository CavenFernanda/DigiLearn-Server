package za.ac.cput.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class  HomeController {

//    @RequestMapping({"/", "/index.xys"})
//    String home() {return "DigiLearn Capstone"; }

    @GetMapping("/")
    public String getAuth(Authentication authentication) {
        return authentication.getName();
    }
}

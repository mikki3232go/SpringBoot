package shop.mtcoding.blogv2.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

///loginForm, /joinForm, /user/updateForm 메서드생성하고 뷰를 연
        //결하시오.
@RequestMapping("/")
@Controller
public class UserController {
    @GetMapping({"/user","/loginForm"})
    public String loginForm(){
        return "user/loginForm";
    }
    @GetMapping("/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }
    @GetMapping("/user/updateForm")
    public String updateForm(){
        return "user/updateForm";
    }
}

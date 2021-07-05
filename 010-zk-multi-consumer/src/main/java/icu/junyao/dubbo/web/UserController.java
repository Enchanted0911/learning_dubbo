package icu.junyao.dubbo.web;

import icu.junyao.dubbo.domain.User;
import icu.junyao.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wu
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserService userService2;
    @RequestMapping("/user")
    public String userDetail(Model model, Integer id) {
        User user = userService.queryUserById(id);
        User user2 = userService2.queryUserById(id);
        model.addAttribute("user", user);
        model.addAttribute("user2", user2);
        return "userDetail";
    }
}

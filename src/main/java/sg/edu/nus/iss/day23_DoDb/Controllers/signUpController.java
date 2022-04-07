package sg.edu.nus.iss.day23_DoDb.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.day23_DoDb.Models.User;
import sg.edu.nus.iss.day23_DoDb.Services.UserInterface;

@Controller
@RequestMapping("/")
public class signUpController {

    @Autowired
    UserInterface uService;


    @GetMapping("/")
    public String setForm(Model model){

        String[] status = {"friend", "foe"};
        List<String> statusList = Arrays.asList(status);
        User user = new User();

        List<User> users = uService.findAllUsers();
        model.addAttribute("users", users);
        model.addAttribute("user", user);
        model.addAttribute("statusList", statusList);

        return "index";

    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user, Model model){


        User newUser = new User(user.getEmail(), user.getName(), user.getPhone(), user.getStatus(), user.getDob(), user.getPassPhrase());
        System.out.println(user);
        uService.saveUser(newUser);

        return "redirect: ";

    }
    
}

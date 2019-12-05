package study.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
//предоставлет атрибуты, используемые для визуализации представлений.
import org.springframework.ui.Model;
import study.spring.form.LoginForm;
import study.spring.form.LoginPasValidator;

import javax.servlet.http.HttpSession;

@Controller
//помещаем объект loginForm в сессию
@SessionAttributes("loginForm")
public class UserController {

    @Autowired
    private LoginPasValidator validator;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showForm() {
        return "index";
    	
//    	LoginForm loginForm = new LoginForm();
//        model.addAttribute("loginForm", loginForm);
//        return "loginform";
    }
    
    @RequestMapping(value = "/loginform", method = RequestMethod.GET)
    public String showForm(Model model) {
    	LoginForm loginForm = new LoginForm();
        model.addAttribute("loginForm", loginForm);
        return "loginform";
    	
//    	LoginForm loginForm = new LoginForm();
//        model.addAttribute("loginForm", loginForm);
//        return "loginform";
    }    

    @RequestMapping(value = "/formdata", method = {RequestMethod.GET, RequestMethod.POST})
        public String processForm(LoginForm loginForm, BindingResult result, HttpSession session) throws Exception {
        validator.validate(loginForm, result);
        if (result.hasErrors()) {
            return "loginform";
        }
//        else if (loginForm.getRole().equalsIgnoreCase("barista")) {
//        	return "loginsuccessbarista";
//        }
//        else if (loginForm.getRole().equalsIgnoreCase("admin")) {
//        	return "loginsuccessadmin";
//        }
        
        return "loginsuccessuser";

    }
}
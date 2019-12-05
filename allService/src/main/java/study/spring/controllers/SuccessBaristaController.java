package study.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import study.spring.repository.*;
import study.spring.entity.User;
import study.spring.form.LoginForm;
import study.spring.form.UpdateForm;

import javax.annotation.Resource;

//@Controller
@SessionAttributes("loginForm")
public class SuccessBaristaController {
//
//    @Resource(name = "visitRepository")
//    private VisitRepository visitRepository;
//    @Resource(name = "userRepository")
//    private UserRepository userRepository;
//
//     
//   
//    @RequestMapping(value = "loginsuccessbarista.html", method = {RequestMethod.GET, RequestMethod.POST})
//    public ModelAndView onSubmit(@RequestParam(required = true) String input,
//                                 LoginForm loginForm) throws IllegalArgumentException {
//        ModelMap modelMap = new ModelMap();
//        switch (input) {
//            case "back":
//                loginForm.setUserName("");
//                loginForm.setPassword("");
//                modelMap.clear();
//                return new ModelAndView("redirect:/");
//            case "add":
//            case "delete":
//                UpdateForm updateForm = new UpdateForm();
//                modelMap.addAttribute("updateForm", updateForm);
//                return new ModelAndView("update", modelMap);
//            case "show":
//                String pass = loginForm.getPassword();
//                User user = userRepository.getRecords("password", pass);
//                modelMap.addAttribute("visitsList", userRepository.getVisits(user));
//                return new ModelAndView("loginsuccess", modelMap);
//            case "showAll":
//                modelMap.addAttribute("visitsList", visitRepository.getAllRecords());
//                return new ModelAndView("loginsuccessbarista", modelMap);
//            default:
//                throw new IllegalArgumentException();
//        }
//    }
}
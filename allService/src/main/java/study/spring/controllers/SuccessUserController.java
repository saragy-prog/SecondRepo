package study.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import study.spring.entity.User;
import study.spring.form.LoginForm;
import study.spring.form.UpdateForm;
import study.spring.repository.UserRepository;
import study.spring.repository.VisitRepository;

import javax.annotation.Resource;

//@Controller
//@SessionAttributes("loginForm")
public class SuccessUserController {
//
//    //@Resource нужен для инжекта бина, описанного в конфигурационном xml-файле
//    @Resource(name = "visitRepository")
//    private VisitRepository visitRepository;
//    @Resource(name = "userRepository")
//    private UserRepository userRepository;
//
//     // Then annotation @RequestParam from the HttpRequest would extract the value
//     // pressed by the user; String input here - the name of the button on jsp-page
//    //используем ModelAndView для динамического вывода списка курсов, добавляя список как 
//    //атрибут в объект ModelMap. Этот объект вместе с атрибутами "прикрепляется" к jsp-страничке
//    //когда создается новый объект ModelAndView("loginsuccessuser", modelMap)
//    @RequestMapping(value = "loginsuccessuser.html", method = {RequestMethod.GET, RequestMethod.POST})
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
//                modelMap.addAttribute("cursesList", userRepository.getVisits(user));
//                return new ModelAndView("loginsuccessuser", modelMap);
//            case "showAll":
//                modelMap.addAttribute("cursesList", visitRepository.getAllRecords());
//                return new ModelAndView("loginsuccessuser", modelMap);
//            default:
//                throw new IllegalArgumentException();
//        }
//    }
}
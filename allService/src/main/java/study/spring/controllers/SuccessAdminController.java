package study.spring.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import study.spring.entity.User;
import study.spring.form.UpdateForm;
import study.spring.service.UserService;
import study.spring.service.VisitService;

//@Controller
@SessionAttributes("user")
public class SuccessAdminController {
//    @Autowired
//    private UserService uService;
//    @Autowired
//    private VisitService vService;
//
//    @RequestMapping(value = "loginsuccessadmin.html", method = {RequestMethod.GET, RequestMethod.POST})
//    public ModelAndView onSubmit(@RequestParam(required = true) String input,
//            User user, HttpSession session) throws IllegalArgumentException {
//        ModelMap modelMap = new ModelMap();
//        switch (input) {
//            case "back":
//                modelMap.clear();
//                if (session != null) {
//                    session.invalidate();
//                }
//                return new ModelAndView("redirect:/");
//            case "add":
//            case "delete":
//                UpdateForm updateForm = new UpdateForm();
//                modelMap.addAttribute("updateForm", updateForm);
//                return new ModelAndView("update", modelMap);
//            case "show":
//                String pass = user.getPassword();
//                modelMap.addAttribute("visits", uService.getUser(pass).getVisits());
//                return new ModelAndView("loginsuccess", modelMap);
//            case "showAll":
//                modelMap.addAttribute("visits", vService.getAllVisits());
//                return new ModelAndView("loginsuccess", modelMap);
//            default:
//                throw new IllegalArgumentException();
//        }
//    }
}

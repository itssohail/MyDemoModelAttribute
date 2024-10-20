package com.springCalculator.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @RequestMapping("/")
//    public String home() {
//        return "index";
//    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber,
                            @RequestParam("operation") String operation, Model model) {

        int result = 0;
        String errorMessage = null;

        switch (operation) {
            case "add":
                result = firstNumber + secondNumber;
                model.addAttribute("result", result);
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                model.addAttribute("result", result);                break;
            case "multiply":
                result = firstNumber * secondNumber;
                model.addAttribute("result", result);                break;
            case "divide":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    model.addAttribute("result", result);
                } else {
                    errorMessage = "Cannot divide by zero";
                }
                break;
            default:
                errorMessage = "Please check the entries and try again";
                break;
        }

        // Set the attributes for display
        if (errorMessage != null) {
            model.addAttribute("errorMessage", errorMessage);
        } else {
            model.addAttribute("errorMessage", errorMessage);// Clear any previous error message
        }

        // Set the result attribute
        model.addAttribute("errorMessage", errorMessage);

        return "index";
    }

    //student details
//
//    @RequestMapping("/")
//    public String addStudent(@RequestParam("sid") int studentId, @RequestParam("sname") String studentName , Model model)
//    {
//        StudentDetails students = new StudentDetails();
//        students.setSid(studentId);
//        students.setSname(studentName);
////        model.addAttribute();
////        model.addAttribute();
//        return "student";

        @RequestMapping("/")
    public String student()
        {
            return "student";
        }
//        @RequestMapping("student")
//    public String addStudent(@RequestParam("sid") int sid, @RequestParam("sname") String sname, Model model) {
//            StudentDetails sd = new StudentDetails();
//            sd.setSname(sname);
//            sd.setSid(sid);
//            model.addAttribute("student",sd);
//            return "student";
//        }

            @RequestMapping("student")
            public String addStudent(@ModelAttribute StudentDetails studentDetails)
            {
                return "student";
            }

            //method level @ModelAttribute
            @ModelAttribute("course")
            public String addCourse()
            {
                return "java";
            }




}

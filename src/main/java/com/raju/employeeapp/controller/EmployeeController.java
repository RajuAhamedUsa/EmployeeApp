package com.raju.employeeapp.controller;

import com.raju.employeeapp.dao.EmployeeDao;
import com.raju.employeeapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/home")
    public String home()
    {
        return "home.jsp";
    }

    @RequestMapping("/addEmployee")
    public ModelAndView addEmployee(Employee employee)
    {

      ModelAndView mv =new ModelAndView("display.jsp");
       mv.addObject("emp",employee);
       return mv;
    }

}

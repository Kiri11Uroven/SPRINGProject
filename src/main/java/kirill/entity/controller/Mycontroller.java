package kirill.entity.controller;

import kirill.entity.Employees;
import kirill.entity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Mycontroller {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employees> list = employeeService.getAllemps();
        model.addAttribute("allEmps", list);
        return "veiw/all-employees.jsp";
    }

    @RequestMapping("/addNewEmp")
    public String addNewEmp(Model model) {
        Employees emps = new Employees();
        model.addAttribute("employee", emps);
        return "veiw/employee-info.jsp";
    }

    @RequestMapping("safeEmp")
    public String safeEmp(@ModelAttribute("employee") Employees emp) {
        employeeService.saveEmp(emp);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateImploee(@RequestParam("empid") int id, Model model) {
        Employees employees = employeeService.getEmployee(id);
        model.addAttribute("employee", employees);
        return "veiw/employee-info.jsp";

    }
    @RequestMapping("/deleteEmp")
    public String removeEmployee(@RequestParam("empid") int id){
        employeeService.removeEmp(id);
        return "redirect:/";
    }
}

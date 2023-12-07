package tn.esprit.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IEmployeService;

import java.util.List;

@RestController
public class EmployeRestControl {
    @Autowired
    IEmployeService employeService;

    @GetMapping("/retrieve-all-employes")
    public List<Employe> retrieveAllUsers() {
        return  employeService.retrieveAllEmployers();
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") String employeId) {

        return employeService.retrieveEmploye(employeId);
    }
    @PostMapping("/add-employe")
    public Employe addemploye(@RequestBody Employe e) {
        Employe employe= employeService.addEmploye(e);
        return employe;
    }
    @DeleteMapping("/remove-user/{user-id}")
    public void removeEmploye(@PathVariable("employr-id") String empolyeId) {

        employeService.deleteEmploye(empolyeId);
    }
}

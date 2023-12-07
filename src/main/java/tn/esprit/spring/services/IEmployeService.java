package tn.esprit.spring.services;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.User;

import java.util.List;

public interface IEmployeService {

    Employe addEmploye(Employe e);
    void deleteEmploye(String id);

    Employe updateEmploye(Employe e);

    Employe retrieveEmploye(String e);

    List<Employe> retrieveAllEmployers();

}

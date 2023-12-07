package tn.esprit.spring.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.EmployeRepository;

import java.util.List;

@Service
public class EmployeServiceImpl implements IEmployeService{

    @Autowired
    EmployeRepository employeRepository;

    private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);

    @Override
    public Employe addEmploye(Employe e) {
        Employe employe = null;

        try {
            // TODO Log à ajouter en début de la méthode
            employe = employeRepository.save(e);
            // TODO Log à ajouter à la fin de la méthode

        } catch (Exception f) {
            // TODO log ici : l....("error in addUser() : " + e);
        }

        return employe;

    }

    @Override
    public void deleteEmploye(String id) {
        try {
            // TODO Log à ajouter en début de la méthode
            employeRepository.deleteById(Long.parseLong(id));
            // TODO Log à ajouter à la fin de la méthode
        } catch (Exception e) {
            // TODO log ici : l....("error in deleteUser() : " + e);
        }
    }

    @Override
    public Employe updateEmploye(Employe e) {
        Employe employeUpdated=null;
        Employe e_saved = null;
        try {
            // TODO Log à ajouter en début de la méthode
            employeUpdated= employeRepository.save(e);
            // TODO Log à ajouter à la fin de la méthode

        } catch (Exception t) {
            // TODO log ici : l....("error in updateUser() : " + e);
        }
        return employeUpdated;     }

    @Override
    public Employe retrieveEmploye(String id) {
        Employe e = null;
        try {
            e= employeRepository.findById(Long.parseLong(id)).get();

        } catch (Exception t) {
        }
        return e;
    }

    @Override
    public List<Employe> retrieveAllEmployers() {
        List<Employe> employes = null;
        try {

            l.info("In Method retrieveAllEmployers :");
             employes = employeRepository.findAll();

            l.info("Out of Method retrieveAllEmployers with Success : " + employes.size());

        }catch (Exception e) {
            l.error("Out of Method retrieveAllEmployers with Errors : ", e);
        }

        return employes;
    }
}

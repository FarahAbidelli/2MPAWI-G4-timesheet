package tn.esprit.spring.services;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeServiceImplTest {

    @Autowired
    IEmployeService em;


    @Test
    @Order(1)
    public void testAddEmploye() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = dateFormat.parse("2015-03-23");
        Employe e = new Employe(3L,"Mayssa1", "Mayssa1", "email","pwd",true, Role.INGENIEUR);
        Employe employeAdded = em.addEmploye(e);
        Assertions.assertEquals(e.getNom(), employeAdded.getNom());
    }
}

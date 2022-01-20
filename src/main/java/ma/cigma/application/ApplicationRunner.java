package ma.cigma.application;

import ma.cigma.models.Facture;
import ma.cigma.presentation.FactureController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;


public class ApplicationRunner {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        FactureController ctrl = (FactureController) context.getBean("idCtrl");

        /* Save des nouvelles factures */

        ctrl.save(new Facture(new Date("16/01/2022"), 1711.53));
        ctrl.save(new Facture(new Date("16/01/2022"), 3467.21));
        ctrl.save(new Facture(new Date("16/01/2022"), 3601.57));


        List<Facture> factures = ctrl.finAll();
        factures.forEach(f -> System.out.println("\n" + f));


    }

}

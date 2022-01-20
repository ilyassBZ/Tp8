package ma.cigma.dao;

import ma.cigma.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class FactureDaoImpl implements IFactureDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em = emf.createEntityManager();

    @Override
    public boolean save(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Facture update(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class, f.getId());
        currentFacture.setDate_facture(f.getDate_facture());
        currentFacture.setAmount(f.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return f;
    }

    @Override
    public boolean deleteById(long idFacture) {
        em.getTransaction().begin();
        Facture factureInDataBase = em.find(Facture.class, idFacture);
        if (factureInDataBase != null) em.remove(factureInDataBase);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Facture findById(long idFacture) {
        return em.find(Facture.class, idFacture);
    }


    @Override
    public List<Facture> findAll() {
        List<Facture> clients = em.createQuery("Select f From Facture f", Facture.class).getResultList();
        return clients;
    }
}

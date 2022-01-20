package ma.cigma.services;

import ma.cigma.dao.IFactureDao;
import ma.cigma.models.Facture;

import java.util.List;

public class FactureServiceImpl implements IFactureService {

    IFactureDao dao;

    public FactureServiceImpl() {
        System.out.println("FactureServiceImpl");
    }

    public IFactureDao getDao() {
        return dao;
    }

    public void setDao(IFactureDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Facture c) {
        System.out.println("Level");
        return dao.save(c);
    }

    @Override
    public Facture modify(Facture c) {
        return dao.update(c);
    }

    @Override
    public boolean deleteById(long id) {
        return dao.deleteById(id);
    }

    @Override
    public Facture getById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Facture> findAll() {
        return dao.findAll();
    }

}

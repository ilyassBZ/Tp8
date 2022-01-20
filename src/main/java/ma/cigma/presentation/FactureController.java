package ma.cigma.presentation;

import ma.cigma.models.Facture;
import ma.cigma.services.IFactureService;

import java.util.List;

public class FactureController {

    IFactureService service;

    public FactureController() {
        System.out.println("controller");
    }

    public IFactureService getService() {
        return service;
    }

    public void setService(IFactureService service) {
        this.service = service;
    }

    public void save(Facture c) {
        System.out.println("Level");
        service.save(c);
    }

    public void modify(Facture c) {
        service.modify(c);
    }

    public boolean deleteById(long id) {
        return service.deleteById(id);
    }

    public Facture getById(long id) {
        return service.getById(id);
    }

    public List<Facture> finAll() {
        return service.findAll();
    }

}

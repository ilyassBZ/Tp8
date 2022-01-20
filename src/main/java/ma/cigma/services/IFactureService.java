package ma.cigma.services;

import ma.cigma.models.Facture;

import java.util.List;

public interface IFactureService {

    boolean save(Facture c);

    Facture modify(Facture c);

    boolean deleteById(long id);

    Facture getById(long id);

    List<Facture> findAll();

}



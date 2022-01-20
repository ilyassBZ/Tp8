package ma.cigma.dao;

import ma.cigma.models.Facture;

import java.util.List;

public interface IFactureDao {
    boolean save(Facture c);

    Facture update(Facture c);

    boolean deleteById(long idFacture);

    Facture findById(long idFacture);

    List<Facture> findAll();
}

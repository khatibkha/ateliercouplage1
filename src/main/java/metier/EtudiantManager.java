package metier;

import dao.Etudiant;
import dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {
    private EtudiantDAO etudiantDAO;

    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public EtudiantManager(presentation.EtudiantDAODictionary etudiantDAO) {
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}

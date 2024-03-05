package presentation;

import dao.Etudiant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary {
    private List<Etudiant> etudiants = new ArrayList<Etudiant>();

    public Etudiant addEtudiant(Etudiant etudiant) {

        etudiants.add(etudiant);
        return etudiant;
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
}

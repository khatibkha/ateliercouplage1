package presentation;

import dao.Etudiant;
import dao.EtudiantDAO;
import metier.EtudiantManager;

import java.util.List;

public class Presentation {
    public static void main(String[] args) {
    EtudiantDAO etudiantDAO;
        etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

    etudiantManager.addEtudiant(new Etudiant(2,"khalid","khatib","khalid@gmail"));
    etudiantManager.addEtudiant(new Etudiant(3,"moulzitoun","fariid","fariid@gmail"));
    etudiantManager.addEtudiant(new Etudiant(4,"hamza","talouni","talouni@gmail"));
    etudiantManager.addEtudiant(new Etudiant(5,"karim","wafiik","karim@gmail"));

    List<Etudiant> etudiants = etudiantManager.getAllEtudiants();
    for (Etudiant etudiant : etudiants) {
        System.out.println("ID: " + etudiant.getId() + ", Nom: " + etudiant.getNom() +
                ", Prénom: " + etudiant.getPrenom() + ", Email: " + etudiant.getEmail());
    }
}

}

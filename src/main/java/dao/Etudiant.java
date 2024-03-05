package dao;
public class Etudiant {
        private int id;
        private String nom;
        private String prenom;
        private String email;

        public int getId() {
                return id;
        }

        public String getNom() {
                return nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public String getEmail() {
                return email;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Etudiant() {
                this.id = id;
                this.nom = nom;
                this.prenom = prenom;
                this.email = email;
        }

        @Override
        public String toString() {
                return "Etudiant{" +
                        "id=" + id +
                        ", nom='" + nom + '\'' +
                        ", prenom='" + prenom + '\'' +
                        ", email='" + email + '\'' +
                        '}';
        }

        public Etudiant(int id, String nom, String prenom, String email) {
                this.id = id;
                this.nom = nom;
                this.prenom = prenom;
                this.email = email;
        }
}



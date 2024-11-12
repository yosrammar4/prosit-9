import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> employes;


    public SocieteArrayList() {
        employes = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }


    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }


    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }


    @Override
    public void trierEmployeParId() {
        employes.sort((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
    }


    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNom)
                .thenComparing(Employe::getDepartement)
                .thenComparingInt(Employe::getGrade));
    }
}

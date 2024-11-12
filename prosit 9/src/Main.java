public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();


        Employe emp1 = new Employe(1, "Smith", "John", "Finance", 5);
        Employe emp2 = new Employe(2, "Johnson", "Jane", "HR", 4);
        Employe emp3 = new Employe(3, "Williams", "Jim", "IT", 3);


        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);


        System.out.println("All employees:");
        societe.displayEmploye();


        System.out.println("\nSearching for 'Smith': " + societe.rechercherEmploye("Smith"));
        System.out.println("Searching for 'Doe': " + societe.rechercherEmploye("Doe"));


        societe.supprimerEmploye(emp2);


        System.out.println("\nAfter removal:");
        societe.displayEmploye();


        societe.trierEmployeParId();
        System.out.println("\nSorted by ID:");
        societe.displayEmploye();


        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("\nSorted by Name, Department, and Grade:");
        societe.displayEmploye();
    }
}

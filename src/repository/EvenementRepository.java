package repository;

import model.Evenement;

import java.util.ArrayList;
import java.util.List;

public class EvenementRepository {
    private List<Evenement> evenements = new ArrayList<>();
    private int compteur = 1;

    /**
     * Crée un nouvel événement, lui attribue un ID unique et l'ajoute à la liste.
     *
     * @param evenement l'événement à ajouter
     */
    public void creerEvenement(Evenement evenement) {
        evenement.setId(compteur++);
        evenements.add(evenement);
    }

    /**
     * Modifie un événement existant.
     *
     * @param id l'identifiant de l'événement à modifier
     * @param evenement l'événement avec les nouvelles données
     */
    public void modifierEvenement(int id, Evenement evenement) {
        for (int i = 0; i < evenements.size(); i++) {
            if (evenements.get(i).getId() == id) {
                evenement.setId(id); // Conserver l'ID existant
                evenements.set(i, evenement);
                break;
            }
        }
    }

    /**
     * Supprime un événement de la liste.
     *
     * @param id l'identifiant de l'événement à supprimer
     */
    public void supprimerEvenement(int id) {
        evenements.removeIf(evenement -> evenement.getId() == id);
    }

    /**
     * Trouve un événement par son identifiant.
     *
     * @param id l'identifiant de l'événement
     * @return l'événement correspondant ou null si non trouvé
     */
    public Evenement trouverParId(int id) {
        for (Evenement evenement : evenements) {
            if (evenement.getId() == id) {
                return evenement;
            }
        }
        return null;
    }

    /**
     * Retourne tous les événements.
     *
     * @return la liste de tous les événements
     */
    public List<Evenement> trouverTous() {
        return evenements;
    }

    /**
     * Retourne la liste des événements.
     *
     * @return la liste des événements
     */
    public List<Evenement> getEvenements() {
        return evenements;
    }

    /**
     * Définit la liste des événements.
     *
     * @param evenements la nouvelle liste des événements
     */
    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }

    public static void main(String[] args) {
        EvenementRepository repository = new EvenementRepository();

        // Création d'événements
        Evenement evenement1 = new Evenement();
        evenement1.setTitre("Conférence Java");
        evenement1.setDescriptif("Conférence sur les nouveautés de Java");
        evenement1.setLieu("Paris");

        Evenement evenement2 = new Evenement();
        evenement2.setTitre("Hackathon");
        evenement2.setDescriptif("Compétition de codage de 48h");
        evenement2.setLieu("Lyon");

        // Ajout des événements
        repository.creerEvenement(evenement1);
        repository.creerEvenement(evenement2);

        // Affichage de tous les événements
        System.out.println("Liste des événements :");
        for (Evenement e : repository.trouverTous()) {
            System.out.println(e.getId() + " - " + e.getTitre() + " : " + e.getDescriptif() + " (" + e.getLieu() + ")");
        }

        // Modification d'un événement
        evenement1.setDescriptif("Conférence mise à jour sur Java");
        repository.modifierEvenement(evenement1.getId(), evenement1);

        // Affichage après modification
        System.out.println("\nListe des événements après modification :");
        for (Evenement e : repository.trouverTous()) {
            System.out.println(e.getId() + " - " + e.getTitre() + " : " + e.getDescriptif() + " (" + e.getLieu() + ")");
        }

        // Suppression d'un événement
        repository.supprimerEvenement(evenement2.getId());

        // Affichage après suppression
        System.out.println("\nListe des événements après suppression :");
        for (Evenement e : repository.trouverTous()) {
            System.out.println(e.getId() + " - " + e.getTitre() + " : " + e.getDescriptif() + " (" + e.getLieu() + ")");
        }

        // Recherche d'un événement par ID
        int idRecherche = evenement1.getId();
        Evenement evenementTrouve = repository.trouverParId(idRecherche);
        if (evenementTrouve != null) {
            System.out.println("\nÉvénement trouvé : " + evenementTrouve.getId() + " - " + evenementTrouve.getTitre());
        } else {
            System.out.println("\nÉvénement avec l'ID " + idRecherche + " non trouvé.");
        }
    }
}

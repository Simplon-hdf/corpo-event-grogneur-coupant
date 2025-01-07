package repository;

import model.Collaborateur;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CollaborateurRepository {
    private List<Collaborateur> collaborateurs = new ArrayList<>();
    private int compteur = 0;

    /**
     * Crée un nouveau collaborateur et l'ajoute à la liste.
     *
     * @param collaborateur le collaborateur à ajouter
     */
    public void creerCollaborateur(Collaborateur collaborateur) {
        collaborateurs.add(collaborateur);
        compteur++;
    }

    /**
     * Modifie un collaborateur existant.
     *
     * @param id l'identifiant du collaborateur à modifier
     * @param collaborateur le collaborateur avec les nouvelles données
     */
    public void modifierCollaborateur(UUID id, Collaborateur collaborateur) {
        for (int i = 0; i < collaborateurs.size(); i++) {
            if (collaborateurs.get(i).getUuid().equals(id)) {
                collaborateurs.set(i, collaborateur);
                break;
            }
        }
    }

    /**
     * Supprime un collaborateur de la liste.
     *
     * @param id l'identifiant du collaborateur à supprimer
     */
    public void supprimerCollaborateur(UUID id) {
        collaborateurs.removeIf(collaborateur -> collaborateur.getUuid().equals(id));
    }

    /**
     * Trouve un collaborateur par son identifiant.
     *
     * @param id l'identifiant du collaborateur
     * @return le collaborateur correspondant ou null si non trouvé
     */
    public Collaborateur trouverParId(UUID id) {
        for (Collaborateur collaborateur : collaborateurs) {
            if (collaborateur.getUuid().equals(id)) {
                return collaborateur;
            }
        }
        return null;
    }

    /**
     * Retourne tous les collaborateurs.
     *
     * @return la liste de tous les collaborateurs
     */
    public List<Collaborateur> trouverTous() {
        return collaborateurs;
    }

    /**
     * Retourne la liste des collaborateurs.
     *
     * @return la liste des collaborateurs
     */
    public List<Collaborateur> getCollaborateurs() {
        return collaborateurs;
    }

    /**
     * Définit la liste des collaborateurs.
     *
     * @param collaborateurs la nouvelle liste de collaborateurs
     */
    public void setCollaborateurs(List<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }
}

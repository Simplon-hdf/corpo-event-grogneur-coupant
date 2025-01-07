package repository;

import java.util.*;
import model.*;
import main.*;

public class CommentaireRepository {
	private int id = 0;
	private List<Commentaire> commentaires = new ArrayList<Commentaire>();
	
	public void creerCommentaire(String contenu, Evenement evenement) {
		var commentaire = new Commentaire();
		commentaire.setId(id);
		commentaire.setAuteur(Main.utilisateurConnecte);
		commentaire.setContenu(contenu);
		commentaire.setEvenement(evenement);
		commentaires.add(commentaire);
		id++;
	}
	
	public void modifierCommentaire(Commentaire commentaire) {
		var scanner = new Scanner(System.in);
		System.out.print("Entrez le nouveau contenu du commentaire : ");
		commentaire.setContenu(scanner.next());
	}
	
	public void supprimerCommentaire(Commentaire commentaire) {
		
	}
}

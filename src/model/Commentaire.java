package model;

import java.util.*;

public class Commentaire {
	private int id;
	private String contenu;
	private Collaborateur auteur;
	private Evenement evenement;
	
	/**
	 * Retourne l'identifiant du commentaire
	 * @return l'identifiant du commentaire
	 */
	public int getId() {
		return id;
	}
	/**
	 * Définit l'identifiant du commentaire
	 * @param id l'identifiant du commentaire
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Retourne le contenu du commentaire.
	 * @return le contenu du commentaire
	 */
	public String getContenu() {
		
		return contenu;
	}
	/**
	 * Définit le contenu du commentaire.
	 * @param contenu le contenu du commentaire
	 */
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	/**
	 * Retourne l'auteur du commentaire
	 * @return l'auteur du commentaire
	 */
	public Collaborateur getAuteur() {
		return auteur;
	}
	/**
	 * Définit l'auteur du commentaire.
	 * @param auteur l'auteur du commentaire
	 */
	public void setAuteur(Collaborateur auteur) {
		this.auteur = auteur;
	}
	/**
	 * Retourne l'evenement auquel est associé le commentaire
	 * @return l'evenement auquel est associé le commentaire
	 */
	public Evenement getEvenement() {
		return evenement;
	}
	/**
	 * Définit l'evenement auquel est associé le commentaire
	 * @param evenement l'evenement auquel est associé le commentaire
	 */
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
	
}
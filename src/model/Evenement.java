package model;

import java.util.Date;

public class Evenement {
    private int id;
    private String title;
    private String descriptif;
    private Date dateDébut;
    private Date dateFin;
    private String lieu;
    private Collaborateur auteur;


    /**
     * Returns the ID of the event.
     *
     * @return the ID of the event
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the event.
     *
     * @param id the ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the title of the event.
     *
     * @return the title of the event
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the event.
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the description of the event.
     *
     * @return the description of the event
     */
    public String getDescriptif() {
        return descriptif;
    }

    /**
     * Sets the description of the event.
     *
     * @param descriptif the description to set
     */
    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    /**
     * Returns the start date of the event.
     *
     * @return the start date of the event
     */
    public Date getDateDébut() {
        return dateDébut;
    }

    /**
     * Sets the start date of the event.
     *
     * @param dateDébut the start date to set
     */
    public void setDateDébut(Date dateDébut) {
        this.dateDébut = dateDébut;
    }

    /**
     * Returns the end date of the event.
     *
     * @return the end date of the event
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * Sets the end date of the event.
     *
     * @param dateFin the end date to set
     */
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Returns the location of the event.
     *
     * @return the location of the event
     */
    public String getLieu() {
        return lieu;
    }

    /**
     * Sets the location of the event.
     *
     * @param lieu the location to set
     */
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    /**
     * Returns the author of the event.
     *
     * @return the author of the event
     */
    public Collaborateur getAuteur() {
        return auteur;
    }

    /**
     * Sets the author of the event.
     *
     * @param auteur the author to set
     */
    public void setAuteur(Collaborateur auteur) {
        this.auteur = auteur;
    }
}

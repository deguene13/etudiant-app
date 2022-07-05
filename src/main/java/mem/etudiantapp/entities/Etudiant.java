package mem.etudiantapp.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Etudiant implements Serializable{
	@Id
	private String numeroEtud;
	private String prenomNom;
	private String niveau;
	private String departement;
	private String ufr;
	private Date dateNais;
	private String telephone;
	private String email;
	private Date dateLet  ;
	private String nomEntrep  ;
	
	

	public Etudiant() {
		super();
	}
	
	public Etudiant(String numeroEtud, String prenomNom, String niveau, String departement, String ufr, Date dateNais,
			String telephone, String email,Date dateLet, String nomEntrep) {
		super();
		this.numeroEtud = numeroEtud;
		this.prenomNom = prenomNom;
		this.niveau = niveau;
		this.departement = departement;
		this.ufr = ufr;
		this.dateNais = dateNais;
		this.telephone = telephone;
		this.email = email;
		this.dateLet = dateLet;
		this.nomEntrep = nomEntrep;
		
	}
	public String getNumeroEtud() {
		return numeroEtud;
	}
	
	public void setNumeroEtud(String numeroEtud) {
		this.numeroEtud = numeroEtud;
	}
	public String getPrenomNom() {
		return prenomNom;
	}
	public void setPrenomNom(String prenomNom) {
		this.prenomNom = prenomNom;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getUfr() {
		return ufr;
	}
	public void setUfr(String ufr) {
		this.ufr = ufr;
	}
	public Date getDateNais() {
		return dateNais;
	}
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateLet() {
		return dateLet;
	}

	public void setDateLet(Date dateLet) {
		this.dateLet = dateLet;
	}

	public String getNomEntrep() {
		return nomEntrep;
	}

	public void setNomEntrep(String nomEntrep) {
		this.nomEntrep = nomEntrep;
	}

	@Override
	public String toString() {
		return "Etudiant [ numeroEtud=" + numeroEtud + ", prenomNom=" + prenomNom + ", niveau="
				+ niveau + ", departement=" + departement + ", ufr=" + ufr + ", dateNais=" + dateNais + ", telephone="
				+ telephone + ", email=" + email + ",dateLet=" + dateLet +" ,nomEntrep=" + nomEntrep +"]";
	}

	
	
}

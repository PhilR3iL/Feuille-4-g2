package exo2;

public class Personne{
	private String nom, prenom, securiteSociale;

	public Personne(String nom, String prenom, String securiteSociale) {
		super();
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.securiteSociale = securiteSociale;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getSecuriteSociale() {
		return securiteSociale;
	}

	@Override
	public String toString() {
		return nom + " " + prenom + " : " + securiteSociale;
	}
	
	public boolean estHomme() {
		return securiteSociale.charAt(0) == '1';
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((securiteSociale == null) ? 0 : securiteSociale.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Personne)
			return false;
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (securiteSociale == null) {
			if (other.securiteSociale != null)
				return false;
		} else if (!securiteSociale.equals(other.securiteSociale))
			return false;
		return true;
	}
}
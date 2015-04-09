package oc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({ @NamedQuery(name = "findAllBeispiele", query = "FROM Beispiel b") })
@Entity
public class Beispiel implements Serializable {

	private static final long serialVersionUID = 6496595700495165542L;

	@Id
	private Integer id;
	private String inhalt;

	public Beispiel() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String beispiel) {
		this.inhalt = beispiel;
	}
}

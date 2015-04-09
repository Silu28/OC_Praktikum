package oc.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import oc.model.Beispiel;

@ManagedBean
@ViewScoped
public class MainController implements Serializable {

	private static final long serialVersionUID = 3973801993975443027L;

	private String name;
	private String primeName;
	private String richName;
	private List<Beispiel> list;

	@PersistenceContext(name = "beispielPU")
	private EntityManager em;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimeName() {
		return primeName;
	}

	public void setPrimeName(String primeName) {
		this.primeName = primeName;
	}

	public String getRichName() {
		return richName;
	}

	public void setRichName(String richName) {
		this.richName = richName;
	}

	public MainController() {

	}

	public List<Beispiel> getList() {
		if (list != null)
			return list;
		Query query = em.createNamedQuery("findAllBeispiele");
		list = query.getResultList();
		return list;
	}
}
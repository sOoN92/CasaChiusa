package casa.chiusa.godo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name="Cliente", schema="bordello")
public class Cliente {
	
	@Id
	@GeneratedValue
	private int id;
	private String nomeCompleto;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Mignotta> listaMignotte = new ArrayList<>();
	
	public Cliente(){
		super();
	};
	
	public Cliente(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public List<Mignotta> getListaMignotte() {
		return listaMignotte;
	}
	public void setListaMignotte(List<Mignotta> listaMignotte) {
		this.listaMignotte = listaMignotte;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomeCompleto=" + nomeCompleto + "]";
	}
		
	
}

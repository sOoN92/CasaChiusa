package casa.chiusa.godo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mignotta", schema="bordello")
public class Mignotta {
	@Id
	@GeneratedValue
	private int id;
	private String nomeCompleto;
	private String nazione;
	
	private int prezzoFiga;
	private int prezzoCulo;
	private int prezzoBocca;
	private int allHour;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

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

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getPrezzoFiga() {
		return prezzoFiga;
	}

	public void setPrezzoFiga(int prezzoFiga) {
		this.prezzoFiga = prezzoFiga;
	}

	public int getPrezzoCulo() {
		return prezzoCulo;
	}

	public void setPrezzoCulo(int prezzoCulo) {
		this.prezzoCulo = prezzoCulo;
	}

	public int getPrezzoBocca() {
		return prezzoBocca;
	}

	public void setPrezzoBocca(int prezzoBocca) {
		this.prezzoBocca = prezzoBocca;
	}

	public int getAllHour() {
		return allHour;
	}

	public void setAllHour(int allHour) {
		this.allHour = allHour;
	}

	@Override
	public String toString() {
		return "Mignotta [id=" + id + ", nomeCompleto=" + nomeCompleto + ", nazione=" + nazione + ", prezzoFiga="
				+ prezzoFiga + ", prezzoCulo=" + prezzoCulo + ", prezzoBocca=" + prezzoBocca + ", allHour=" + allHour
				+ ", cliente=" + cliente + "]";
	}
	
}

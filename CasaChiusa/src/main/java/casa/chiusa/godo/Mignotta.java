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
	private Prezzi prezzi;
	
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

	public Prezzi getPrezzi() {
		return prezzi;
	}

	public void setPrezzi(Prezzi prezzi) {
		this.prezzi = prezzi;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Mignotta [id=" + id + ", nomeCompleto=" + nomeCompleto + ", nazione=" + nazione + ", prezzi=" + prezzi
				+ ", cliente=" + cliente + "]";
	}
	
	
}

package casa.chiusa.godo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mignotta", schema="bordello")
public class Mignotta {
	@Id
	@GeneratedValue
	private int id;
	private String nomeCompleto;
	private String nazione;
	static private int prezzoFiga = 30;
	static private int prezzoCulo = 40;
	static private int prezzoBocca = 15;
	static private int tuttoPerUnOra = 100;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	public Mignotta(){
		super();
	}
	
	public Mignotta(String nomeCompleto, String nazione){
		this.nomeCompleto = nomeCompleto;
		this.nazione = nazione;
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

	public static int getPrezzoFiga() {
		return prezzoFiga;
	}

	public static void setPrezzoFiga(int prezzoFiga) {
		Mignotta.prezzoFiga = prezzoFiga;
	}

	public static int getPrezzoCulo() {
		return prezzoCulo;
	}

	public static void setPrezzoCulo(int prezzoCulo) {
		Mignotta.prezzoCulo = prezzoCulo;
	}

	public static int getPrezzoBocca() {
		return prezzoBocca;
	}

	public static void setPrezzoBocca(int prezzoBocca) {
		Mignotta.prezzoBocca = prezzoBocca;
	}

	public static int getTuttoPerUnOra() {
		return tuttoPerUnOra;
	}

	public static void setTuttoPerUnOra(int tuttoPerUnOra) {
		Mignotta.tuttoPerUnOra = tuttoPerUnOra;
	}

	@Override
	public String toString() {
		return "Mignotta [id=" + id + ", nomeCompleto=" + nomeCompleto + ", nazione=" + nazione + ", cliente=" + cliente
				+ "]";
	}
}

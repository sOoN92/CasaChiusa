package casa.chiusa.godo;

public class Prezzi {
	
	private int fica;
	private int bocca;
	private int culo;
	private int allHour;

	public Prezzi(int fica, int bocca, int culo, int allHour){
		this.fica = fica;
		this.culo = culo;
		this.bocca = bocca;
		this.allHour = allHour;
	}

	public int getFica() {
		return fica;
	}

	public void setFica(int fica) {
		this.fica = fica;
	}

	public int getBocca() {
		return bocca;
	}

	public void setBocca(int bocca) {
		this.bocca = bocca;
	}

	public int getCulo() {
		return culo;
	}

	public void setCulo(int culo) {
		this.culo = culo;
	}

	public int getAllHour() {
		return allHour;
	}

	public void setAllHour(int allHour) {
		this.allHour = allHour;
	}

	@Override
	public String toString() {
		return "Prezzi [fica=" + fica + ", bocca=" + bocca + ", culo=" + culo + ", allHour=" + allHour + "]";
	}
}

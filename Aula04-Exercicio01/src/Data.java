
public class Data {
	private int dia;
	private int mes;
	private int ano;
	public Data() {
		this(1, 1, 1940);
	}
	public Data(int dd, int mm, int aa) {
		this.dia = dd;
		this.mes = mm;
		this.ano = aa;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	
	public String mostraData() {
		return this.dia+"/"+ this.mes+"/"+ this.ano;
	}

}

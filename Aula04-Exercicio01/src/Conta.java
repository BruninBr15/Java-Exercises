
public class Conta {
	public static int seq = 0;
	private int numero;
	private Pessoa titular;
	private Data abertura;
	public double saldo;
	public Conta() {
		this(new Pessoa(), new Data());
	}
	public Conta(Pessoa p, Data a) {
		this.numero = ++seq;
		this.titular = p;
		this.abertura = a;
		this.saldo = 0;
	}
	public Conta(int num, String n, String c, Data dnasc, Data dab) {
		this(new Pessoa(n, c, dnasc), dab);
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	public Data getAbertura() {
		return abertura;
	}
	public void setAbertura(Data abertura) {
		this.abertura = abertura;
	}
	public int getNum() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public String mostraConta() {
		String saida = "";
		saida += "Número: "+ this.numero;
		saida += "\nTitular\n"+ this.titular.mostraPessoa();
		saida += "\nData da Abertura: "+ this.abertura.mostraData();
		saida += "\nSaldo: "+ this.saldo;
		return saida;
	}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	public void depJuros() {
		this.saldo += this.saldo/100;
	}
	public void depJuros(double taxa) {
		this.saldo += (this.saldo/100) * taxa;
	}

}


public class Pessoa {
	private String nome;
	private String cpf;
	public Data nasc;
	public Pessoa() {
		this("João Doe", "00000000000", new Data());
	}
	public Pessoa(String n, String c, Data d) {
		this.nome = n;
		this.cpf = c;
		this.nasc = d;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Data getNasc() {
		return nasc;
	}
	public void setNasc(Data nasc) {
		this.nasc = nasc;
	}
	public String mostraPessoa() {
		String saida = "";
		saida += "Nome: "+ this.nome;
		saida += "\nCPF: "+ this.cpf;
		saida += "\nNascimento: "+ this.nasc.mostraData();
		return saida;
	}

}

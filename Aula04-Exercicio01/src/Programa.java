
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data hoje = new Data(13, 3, 2024);
		Data d1 = new Data();
		System.out.println("Hoje: "+hoje.mostraData()+
		"\nD1: "+d1.mostraData());
		int difAno = hoje.getAno() - d1.getAno();
		System.out.println("Diferença de anos: "+difAno);
		d1.setDia(10);
		System.out.println("D1: "+d1.mostraData());
		Pessoa p1 = new Pessoa("Cândido", "11199189101", d1);
		System.out.println("P1\n"+ p1.mostraPessoa());
		p1.setNome("Antônio Cândido");
		p1.setCpf("333444555-67");
		System.out.println("P1\n"+ p1.mostraPessoa());
		p1.getNasc().setMes(4);
		System.out.println("P1\n"+ p1.mostraPessoa());
		/*setNasc() não retorna nenhum valor, por isso usa o getNasc(), ele sim retorna a data para poder alterá-la.*/
		Conta c1 = new Conta(p1, hoje);
		c1.depositar(15000);
		c1.sacar(5000);
		System.out.println("C1\n"+ c1.mostraConta());
		Conta c3 = new Conta();
		Conta c4 = new Conta(new Pessoa("Firmino", "11111122211", new Data(13, 8, 2002)), hoje);
		Conta c5 = new Conta(new Pessoa("Deodoro", "11111122213", new Data(31,12,2024)), new Data(5,3,2023));
		System.out.println("C3\n" + c3.mostraConta() + 
		"\nC4\n"+ c4.mostraConta() + 
		"\nC5\n" + c5.mostraConta());
		c4.getTitular().setNome("Alfonso Firmino");
		c5.getTitular().getNasc().setAno(2000);
		c5.getAbertura().setAno(2024);
		c4.depositar(10000);
		System.out.println("C1\n"+ c1.mostraConta() + 
		"\nC3\n" + c3.mostraConta() + 
		"\nC4\n"+ c4.mostraConta() + 
		"\nC5\n" + c5.mostraConta());

	}

}

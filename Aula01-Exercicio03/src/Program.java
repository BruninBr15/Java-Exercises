
public class Program {
	public static String mostraCarro(Carro c) {
		String saida;
		saida = "Carro de "+c.dono+
				"\nMarca: "+c.marca+
				"\nModelo: "+c.modelo+
				"\nCor: "+c.cor+
				"\nPortas: "+c.portas+
				"\nFabricação: "+c.fabric.dia+"/"+c.fabric.mes+"/"+c.fabric.ano+
				"\nMotor:  "+c.motor.id+
				"\n\tCilindros: "+c.motor.cilindros+
				"\n\tCC: "+c.motor.cc+	
				"\n\tTurbo: "+c.motor.turbo+
				"\n\tData de Fabricação: "+c.motor.dataFabric.dia+"/"+c.motor.dataFabric.mes+"/"+c.motor.dataFabric.ano;
		return saida;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor m1 = new Motor();
		m1.id = "AP1.6";
		m1.cilindros = 4;
		m1.cc = 1.6;
		m1.turbo = false;
		m1.dataFabric = new Data();
		m1.dataFabric.dia = 12;
		m1.dataFabric.mes = 12;
		m1.dataFabric.ano = 2020;
		Motor m2 = new Motor();
		m2.id = "VWmil";
		m2.cilindros = 3;
		m2.cc = 1;
		m2.turbo = true;
		m2.dataFabric = new Data();
		m2.dataFabric.dia = 11;
		m2.dataFabric.mes = 11;
		m2.dataFabric.ano = 2017;
		Carro deManuel = new Carro();
		deManuel.dono = "Manuel";
		deManuel.marca = "VW";
		deManuel.modelo = "Voyage";
		deManuel.cor = "prata";
		deManuel.portas = 4;
		deManuel.motor = m1;
		deManuel.fabric = new Data();
		deManuel.fabric.dia = 1;
		deManuel.fabric.mes = 2;
		deManuel.fabric.ano = 2022;
		Carro deNuno = new Carro();
		deNuno.dono = "Nuno";
		deNuno.marca = "VW";
		deNuno.modelo = "Up";
		deNuno.cor = "verde";
		deNuno.portas = 2;
		deNuno.motor = m2;
		deNuno.fabric = new Data();
		deNuno.fabric.dia = 1;
		deNuno.fabric.mes = 3;
		deNuno.fabric.ano = 2022;
		Carro deAfonso = new Carro();
		deAfonso.dono = "Afonso";
		deAfonso.marca = "Hyundai";
		deAfonso.modelo = "Veloster";
		deAfonso.cor = "vermelho";
		deAfonso.portas = 3;
		deAfonso.motor = m2;
		deAfonso.fabric = new Data();
		deAfonso.fabric.dia = 30;
		deAfonso.fabric.mes = 9;
		deAfonso.fabric.ano = 2018;
		deAfonso.motor.id = "Hy14";
		deAfonso.motor.cilindros = 4;
		deAfonso.motor.cc = 1.4;
		deAfonso.motor.turbo = true;
		deAfonso.motor.dataFabric.dia = 20;
		deAfonso.motor.dataFabric.dia = 7;
		deAfonso.motor.dataFabric.dia = 2013;
		System.out.println(mostraCarro(deManuel));
		System.out.println("\n"+mostraCarro(deNuno));
		System.out.println("\n"+mostraCarro(deAfonso));
		
	}

}

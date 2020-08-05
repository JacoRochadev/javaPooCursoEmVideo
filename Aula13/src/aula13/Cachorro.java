package aula13;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("au au au");
	}
	
	public void reagir(String frase) {
		if (frase == "toma comida" || frase.equals("ola")) {
			System.out.println("abanar o rabo");
		}else {
			System.out.println("rosnar");
		}
	}
	public void reagir(int hora, int min) {
		if(hora<12) {
			System.out.println("abanar o rabo");
		}else if (hora>=18) {
			System.out.println("ignorado");
		}else {
			System.out.println("rosnar");
		}
	}
	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("abanar");
		}else {
			System.out.println("rosnar");
		}
	}
	public void reagir(int idade, float peso) {
		if (idade<5) {
			if(peso < 10) {
			System.out.println("abanar");
			}else {
				System.out.println(" latir");
			}
		} else {
			if (peso<10) {
				System.out.println("rosnar");
			}else {
				System.out.println("ignorar");
			}
		}
	}

}

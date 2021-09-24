package fundamentos;

public class DesafioLogicos {
 public static void main(String[] args) {
	
	 // Trabalho na terça (v ou f)
	 // Trabalho na quinta (v ou f)
	 
	 boolean trabalho1 = false;
	 boolean trabalho2 = false;
	 
	 boolean comprouTV50PL = trabalho1 && trabalho2;
	 boolean comprouTV32PL = trabalho1 ^ trabalho2;
	 boolean comprouSorvete = trabalho1 || trabalho2;
	 
	 
	 // Operador unário
	 boolean maisSaudavel = !comprouSorvete;
	 
	 System.out.println("Comprou TV 50PL\"? " + comprouTV50PL);
	 System.out.println("Comprou TV 32PL\"? " + comprouTV32PL);
	 System.out.println("Comprou Sorvete ? " + comprouSorvete);
	 System.out.println("Mais saudavel ? " + maisSaudavel);
	 
	 
}
}

package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
         //informações do funcionário
		 
		 // Tipos númericos inteiro
		 byte anosDeEmpresa = 28;
		 short numeroDeVoos = 542;
		 int id = 53789;
		 long pontosAcumulados = 34845223L;
		 
		 
		 // Tipos númericos flutuante
		 float salario = 11445.44F;
		 double VendasAcumuladas = 2991797103.01;
		 
		 
		 // Tipos booleano
		 boolean estaDeFerias = true;
		 
		 
		 // Tipo caracter
		 char sexo = 'M';
		 
		 // Dias de empresa
		 System.out.println(anosDeEmpresa * 365);
		 
		 // Numero de viagens
		 System.out.println(numeroDeVoos / 2);
		 
		 // Pontos por real
		 System.out.println(pontosAcumulados / VendasAcumuladas);
		 
		 // Salário
		 System.out.println(id + "Ganha: " + salario);
		 System.out.println("Férias? " + estaDeFerias);
		 System.out.println(sexo);
		 
		 
		 
	}
}

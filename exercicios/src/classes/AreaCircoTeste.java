package classes;

public class AreaCircoTeste {

	public static void main(String[] args) {
		
           AreaCirco areaCirco = new AreaCirco(10.6);
           
           //PI � statico ent�o chamo diretamente da classe e pode ser modificado se n�o estiver como final
           AreaCirco.pi = 3.14;
           
           System.out.println(areaCirco.area());
	}

}

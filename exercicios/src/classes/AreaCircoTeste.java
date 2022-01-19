package classes;

public class AreaCircoTeste {

	public static void main(String[] args) {
		
           AreaCirco areaCirco = new AreaCirco(10.6);
           
           //PI é statico então chamo diretamente da classe e pode ser modificado se não estiver como final
           AreaCirco.pi = 3.14;
           
           System.out.println(areaCirco.area());
	}

}

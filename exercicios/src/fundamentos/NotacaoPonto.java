package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
	String s = "Bom dia X";
	s = s.toUpperCase();
	System.out.println(s);
	
	s = s.replace("X", "Senhora").concat("!!!!");
	s = s.toUpperCase();
	System.out.println(s);

	}
}

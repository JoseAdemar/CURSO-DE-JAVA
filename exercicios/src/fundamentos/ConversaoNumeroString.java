package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {

		// Convertendo número em String

		Integer num1 = 10000; // Convertendo um Integer em String
		System.out.println(num1.toString().length());

		int num2 = 100000; // Convertendo um int em String
		System.out.println(Integer.toString(num2).length());

	}
}

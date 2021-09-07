package fundamentos;

import java.util.Locale;

public class AreaCircunferencia {
	public static void main(String[] args) {
         
		Locale.setDefault(Locale.US);
		
		double raio = 3.4;
		final double PI = 3.14159;

		double area = PI * raio * raio;

		System.out.printf("Area = %.2f m²", area);
	}
}

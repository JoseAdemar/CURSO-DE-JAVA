package classes;

public class AreaCirco {

	double raio;
	static double pi = 3.14;

	public AreaCirco(double raio) {
		this.raio = raio;
	}

	public double area() {
		int exponencial = 2;
		return pi * Math.pow(raio, exponencial);
	}
}

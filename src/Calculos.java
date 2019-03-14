
public class Calculos extends Thread {

	public int valores = 1000000;
	public double pi = 3.14;
	public double resultado = 0.0;
	public int identificadorParImpar;
	
	public Calculos(int identificadorParImpar) {
		this.identificadorParImpar = identificadorParImpar;
	}
	
	public void run() {		
		for (int i=1; i < valores; i += identificadorParImpar) {
			resultado = (4*(i % 2 == 0 ? 1 : -1)/(2*i)+1) * pi;
		}
	}
}

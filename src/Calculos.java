
public class Calculos extends Thread {

	public double resultadoThread;
	int valorInicio = 0;
	int valorFinal = 0;
	
	public Calculos(int valorInicio, int valorFinal) {
		this.valorInicio = valorInicio;
		this.valorFinal = valorFinal;
		resultadoThread = 0.0;
	}	
	public double getResultadoThread() {
		return this.resultadoThread;
	}
	public void setResultadoThread(double resultadoThread) {
		this.resultadoThread = resultadoThread;
	}
	public void run() {		
		for (int i=valorInicio; i <= valorFinal; i++) {
			resultadoThread += (i % 2 == 0 ? 1.0 : -1.0)/((2*i)+1);
		}
	}
}

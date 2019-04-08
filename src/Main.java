
public class Main {

	public static void main(String[] args) throws InterruptedException {
		int numeroThreads = 2;
		int valoresMaximo = 1000000000;
		int valorInicio = 0;
		int valoresPorThreads = valoresMaximo / numeroThreads;
		int valorFinal = valoresPorThreads;
		double resultado = 0.0;
		
		long inicioTempo = System.nanoTime();
		
		Calculos[] threads = new Calculos[numeroThreads];
		
		for (int i=1;i<=threads.length;i++) {
			if (i >= 2) {
				valorInicio = valorFinal + 1; 
				valorFinal = valoresPorThreads * i;
			}
			threads[i-1] = new Calculos(valorInicio, valorFinal);
			threads[i-1].start();
		} 
		for (int i=1;i<=threads.length;i++) {
			threads[i-1].join();
			resultado += threads[i-1].getResultadoThread();
		}
		resultado *= 4.0;
		
		long fimTempo = System.nanoTime();
		
		System.out.println("Resultado: "+ resultado);
		System.out.println("Tempo de execução : " + (inicioTempo - fimTempo));
	}

}

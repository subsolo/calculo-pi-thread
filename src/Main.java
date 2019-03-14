
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Calculos threadPares = new Calculos(2);
		threadPares.start();
		
		Calculos threadImpares = new Calculos(1);
		threadImpares.start();
		
		threadPares.join();
		threadImpares.join();
		
		double resultado = threadPares.resultado + threadImpares.resultado;
		System.out.println("Thread Pares: "+threadPares.resultado);
		System.out.println("Thread Impares: "+threadImpares.resultado);
		
		System.out.println("Resultado: "+ resultado);

	}

}

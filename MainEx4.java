public class MainEx4 {

	public static void main(String[] args) {

		Ex4 joao = new Ex4(
				"João da Silva",
				"123.456.789-00",
				"PR",
				40000.0
				);
		
 double imposto = joao.calcularImposto();
		
 String msg = String.format("Imposto calculado do joão : %.2f", imposto);
 
 System.out.println(msg);
 
	}
}

public class MainEx4 {

	public static void main(String[] args) {

		Ex4 joao = new Ex4(
				"João da Silva",
				"123.456.789-00",
				"PR",
				40000.0
				);

		double imposto = joao.calcularImposto();

		System.out.println("Nome: " + joao.getNome());
		System.out.println("CPF: " + joao.getCpf());
		System.out.println("UF: " + joao.getUf());
		System.out.printf("Renda Anual: R$ %.2f%n", joao.getRendaAnual());
		System.out.printf("Imposto: R$ %.2f%n", imposto);

	}
}
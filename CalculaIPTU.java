import java.util.*;

public class Atividade01 {
	static double valorTotal = 0;

	public static void calculaResidencial(double valor) {
		double iptu = 0;
		if (valor >= 0 && valor <= 95450) {
			iptu = valor * 0.006;
			valorTotal += iptu;
		}
		if (valor >= 95450.01 && valor <= 238626) {
			iptu = valor * 0.007;
			valorTotal += iptu;
		}
		if (valor >= 238626.01 && valor <= 417596) {
			iptu = valor * 0.0075;
			valorTotal += iptu;
		}
		if (valor >= 417596.01 && valor <= 715879) {
			iptu = valor * 0.008;
			valorTotal += iptu;
		}
		if (valor >= 715879.01 && valor <= 954505) {
			iptu = valor * 0.0085;
			valorTotal += iptu;
		}
		if (valor >= 954505.01 && valor <= 1193131) {
			iptu = valor * 0.009;
			valorTotal += iptu;
		}
		if (valor >= 1193131.01) {
			iptu = valor * 0.01;
			valorTotal += iptu;
		}
	}

	public static void calculaNResidencial(double valor) {
		double iptu = 0;
		if (valor >= 0 && valor <= 35793) {
			iptu = valor * 0.012;
			valorTotal += iptu;
		}
		if (valor >= 35793.01 && valor <= 119313) {
			iptu = valor * 0.013;
			valorTotal += iptu;
		}
		if (valor >= 119313.01 && valor <= 596565) {
			iptu = valor * 0.014;
			valorTotal += iptu;
		}
		if (valor >= 596565.01 && valor <= 1193131) {
			iptu = valor * 0.015;
			valorTotal += iptu;
		}
		if (valor >= 1193131.01) {
			iptu = valor * 0.016;
			valorTotal += iptu;
		}
	}

	public static void calculaTerritorial(double valor) {
		double iptu = 0;
		if (valor >= 0 && valor <= 47724) {
			iptu = valor * 0.01;
			valorTotal += iptu;
		}
		if (valor >= 47724.01 && valor <= 357939) {
			iptu = valor * 0.016;
			valorTotal += iptu;
		}
		if (valor >= 357939.01 && valor <= 715879) {
			iptu = valor * 0.02;
			valorTotal += iptu;
		}
		if (valor >= 715879.01 && valor <= 1193131) {
			iptu = valor * 0.025;
			valorTotal += iptu;
		}
		if (valor >= 1193131.01) {
			iptu = valor * 0.03;
			valorTotal += iptu;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("-----Calcula IPTU----");
		System.out.println("(1)Residencial");
		System.out.println("(2)Não Residencial");
		System.out.println("(3)Territorial");
		System.out.println("---------------------");
		int op = s.nextInt();
		int qtdFaixa = 0;
		double valor = 0;
		switch (op) {
		case 1:
			System.out.println("Digite a Quantidade de Faixas");
			qtdFaixa = s.nextInt();
			for (i = 0; i < qtdFaixa; i++) {
				int j = i + 1;
				System.out.println("Digite o " + j + "º valor");
				valor = s.nextDouble();
				calculaResidencial(valor);
			}
			System.out.println("O valor total é de : " + valorTotal);
			break;
		case 2:
			System.out.println("Digite a Quantidade de Faixas");
			qtdFaixa = s.nextInt();
			for (i = 0; i < qtdFaixa; i++) {
				int j = i + 1;
				System.out.println("Digite o " + j + "º valor");
				valor = s.nextDouble();
				calculaNResidencial(valor);
			}
			System.out.println("O valor total é de : " + valorTotal);
			break;
		case 3:
			System.out.println("Digite a Quantidade de Faixas");
			qtdFaixa = s.nextInt();
			for (i = 0; i < qtdFaixa; i++) {
				int j = i + 1;
				System.out.println("Digite o " + j + "º valor");
				valor = s.nextDouble();
				calculaTerritorial(valor);
			}
			System.out.println("O valor total é de : " + valorTotal);
			break;
		}
	}
}

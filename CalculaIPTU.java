import java.util.*;

public class Atividade01 {

	public static double calculaResidencial(double valor) {
		double iptu = 0;
		if (valor <= 95450) {
			iptu = valor * 0.006;
		} else if (valor <= 238626) {
			iptu = 95450 * 0.006;
			iptu += (valor - 95450) * 0.007;
		} else if (valor <= 417596) {
			iptu = 95450 * 0.006;
			iptu += 143176 * 0.007;
			iptu += (valor - 238626) * 0.0075;
		} else if (valor <= 715879) {
			iptu = 95450 * 0.006;
			iptu += 143176 * 0.007;
			iptu += 178970 * 0.0075;
			iptu += (valor - 417596) * 0.008;
		} else if (valor <= 954505) {
			iptu = 95450 * 0.006;
			iptu += 143176 * 0.007;
			iptu += 178970 * 0.0075;
			iptu += 298283 * 0.008;
			iptu += (valor - 715879) * 0.0085;
		} else if (valor <= 1193131) {
			iptu = 95450 * 0.006;
			iptu += 143176 * 0.007;
			iptu += 178970 * 0.0075;
			iptu += 298283 * 0.008;
			iptu += 238626 * 0.0085;
			iptu += (valor - 954505) * 0.009;
		} else {
			iptu = 95450 * 0.006;
			iptu += 143176 * 0.007;
			iptu += 178970 * 0.0075;
			iptu += 298283 * 0.008;
			iptu += 238626 * 0.0085;
			iptu += 238626 * 0.009;
			iptu += (valor - 1193131) * 0.01;
		}
		return iptu;
	}

	public static double calculaNResidencial(double valor) {
		double iptu = 0;
		if (valor <= 35793) {
			iptu = valor * 0.012;
		}
		else if (valor <= 119313) {
			iptu = 35793 * 0.012;
			iptu += (valor-35793) * 0.013;
		}
		else if (valor <= 596565) {
			iptu = 35793 * 0.012;
			iptu += 83520 * 0.013;
			iptu += (valor-119313) * 0.014;
		}
		else if (valor <= 1193131) {
			iptu = 35793 * 0.012;
			iptu += 83520 * 0.013;
			iptu += 477252 * 0.014;
			iptu += (valor-596565) * 0.015;
		}
		else{
			iptu = 35793 * 0.012;
			iptu += 83520 * 0.013;
			iptu += 477252 * 0.014;
			iptu += 596566 * 0.015;
			iptu += (valor-1193131) * 0.016;
		}
		return iptu;
	}

	public static double calculaTerritorial(double valor) {
		double iptu = 0;
		if (valor <= 47724) {
			iptu = valor * 0.01;
		} else if (valor <= 357939) {
			iptu = 47724 * 0.01;
			iptu += (valor - 47724) * 0.016;

		} else if (valor <= 715879) {
			iptu = 47724 * 0.01;
			iptu += 310215 * 0.016;
			iptu += (valor - 357939) * 0.02;
		} else if (valor <= 1193131) {
			iptu = 47724 * 0.01;
			iptu += 310215 * 0.016;
			iptu += 357940 * 0.02;
			iptu += (valor - 715879) * 0.025;
		} else {
			iptu = 47724 * 0.01;
			iptu += 310215 * 0.016;
			iptu += 357940 * 0.02;
			iptu += (valor - 477252) * 0.025;
			iptu += (valor - 1193131) * 0.03;
		}
		return iptu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("-----Calcula IPTU----");
		System.out.println("(1)Residencial");
		System.out.println("(2)Não Residencial");
		System.out.println("(3)Territorial");
		System.out.println("---------------------");
		int op = s.nextInt();
		double valor = 0;
		switch (op) {
		case 1:
			System.out.println("Digite o Valor");
				valor = s.nextDouble();
				
			System.out.println("O valor total é de : " + calculaResidencial(valor));
			break;
		case 2:
			System.out.println("Digite o Valor");
				valor = s.nextDouble();
				
			System.out.println("O valor total é de : " + calculaNResidencial(valor));
			break;
		case 3:
			System.out.println("Digite o Valor");
				valor = s.nextDouble();
				
			System.out.println("O valor total é de : " + calculaTerritorial(valor));
			break;
		}
	}
}

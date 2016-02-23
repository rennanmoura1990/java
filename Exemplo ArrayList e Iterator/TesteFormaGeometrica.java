import java.util.ArrayList;

public class TesteFormaGeometrica {
	public static void main(String args[]){
		ArrayList<FormaGeometrica>formasPSC = new ArrayList<FormaGeometrica>();
		ColecaoFormas cf = new ColecaoFormas();
		Quadrado q1 = new Quadrado();
		formasPSC.add(q1);
		Quadrado q2 = new Quadrado(8);
		formasPSC.add(q2);
		Retangulo r1 = new Retangulo();
		formasPSC.add(r1);
		Retangulo r2 = new Retangulo(4,9);
		formasPSC.add(r2);
		Retangulo r3 = new Retangulo(3);
		formasPSC.add(r3);
		System.out.println("Total das Áreas : "+cf.retornarAreaTotal(formasPSC)+"M²");
		System.out.println("Total dos Perímetros : "+cf.retornarPerimetroTotal(formasPSC)+"M");
		System.out.println("Quantidade de Quadrados : "+cf.obterQuantidadeQuadrados(formasPSC)+"");
		for(FormaGeometrica fg : formasPSC){
			System.out.println(fg);
		}
	}
	
}

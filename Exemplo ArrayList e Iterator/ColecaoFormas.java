import java.util.ArrayList;
import java.util.Iterator;

public class ColecaoFormas {
	public ArrayList<FormaGeometrica> formas;

	public ColecaoFormas() {
		formas = new ArrayList<FormaGeometrica>();
	}
	public int retornarAreaTotal(ArrayList<FormaGeometrica> formas) {
		int areaTotal = 0;
		/*
		 * for (Iterator<FormaGeometrica> iterator = formas.iterator();iterator.hasNext()); outra forma
		 */
		Iterator<FormaGeometrica> i = formas.iterator();
		while (i.hasNext()) {
			Retangulo r = (Retangulo) i.next();
			int comprimento = r.getComprimento();
			int altura = r.getAltura();
			areaTotal = areaTotal + r.calcularArea(comprimento, altura);
		}
		return areaTotal;
	}

	public int retornarPerimetroTotal(ArrayList<FormaGeometrica> formas) {
		int perimetroTotal = 0;
		Iterator<FormaGeometrica> i = formas.iterator();
		while (i.hasNext()) {
			Retangulo r = (Retangulo) i.next();
			int perimetro = (r.getAltura() * 2) + (r.getComprimento() * 2);
			perimetroTotal += perimetro;
		}
		return perimetroTotal;
	}

	public int obterQuantidadeQuadrados(ArrayList<FormaGeometrica> formas) {
		int qtdquadrados = 0;
		Iterator<FormaGeometrica> i = formas.iterator();
		while (i.hasNext()) {
			Retangulo r = (Retangulo) i.next();
			if (r.ehQuadrato(r.getComprimento(),r.getAltura()) == true) {
				qtdquadrados++;
			}
		}
		return qtdquadrados;
	}

	public ArrayList<FormaGeometrica> obterColecaoRetangulos() {
		ArrayList<FormaGeometrica> retangulos = new ArrayList<FormaGeometrica>();
		Retangulo r = new Retangulo();
		for (FormaGeometrica fg : formas) {
			if (fg.equals(r)) {
				retangulos.add(fg);
			}
		}
		return retangulos;

	}
}

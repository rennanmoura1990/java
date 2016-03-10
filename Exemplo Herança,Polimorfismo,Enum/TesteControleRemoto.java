
public class TesteControleRemoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleRemotoUniversal cru = new ControleRemotoUniversal();
		AparelhodeSom as = new AparelhodeSom();
		cru.ligar(as);
		Televisao t = new Televisao();
		cru.ligar(t);
		BluRayPlayer brp = new BluRayPlayer();
		cru.ligar(brp);
		System.out.println("Aparelho de Som : "+as+"");
		System.out.println("Televisão : "+t+"");
		System.out.println("BluRayPlayer : "+brp+"");
	}

}

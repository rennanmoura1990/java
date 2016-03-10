import java.util.ArrayList;

public class Teste {
	
	static ArrayList<Musica> musicas = new ArrayList<Musica>();
	public static void main(String args[]){
		AparelhodeSom as = new AparelhodeSom();
		as.setMarca("Sony");
		as.setModelo("XYZ");
		as.setPotencia(60);
		as.ligar(); //ligou
		System.out.println(as);
		for(int i = 0;i<5;i++){
			as.aumetaVolume();
		}
		System.out.println("Volume : "+as.getVolume()+"");
		int op = AparelhodeSom.ControladorFuncao.CD.getNumerofuncao();
		//System.out.println(op);
		as.setPlayer(as.AlteraFuncao(op));
		CDPlayer cd = (CDPlayer) as.getPlayer();
		System.out.println(as.ExibirMensagem(op));
		cd.setNomeartista("Los Hermanos");
		cd.setNomealbum("Bloco do eu sozinho");
		cd.setAno(2001);
		System.out.println(cd.colocarCD(cd)); //CD inserido
		Musica m1 = new Musica();
		m1.setNomemusica("Todo carnaval tem seu fim");
		m1.setNomeartista("Los Hermanos");
		m1.setCompositor("Marcelo Camelo");
		m1.setTempo(252);
		musicas.add(m1);
		Musica m2 = new Musica();
		m2.setNomemusica("A flor");
		m2.setNomeartista("Los Hermanos");
		m2.setCompositor("Rodrigo Amarante");
		m2.setTempo(210);
		musicas.add(m2);
		Musica m3 = new Musica();
		m3.setNomemusica("Retrato Pra Iaiá");
		m3.setNomeartista("Los Hermanos");
		m3.setCompositor("Marcelo Camelo");
		m3.setTempo(282);
		musicas.add(m3);
		Musica m4 = new Musica();
		m4.setNomemusica("Assim será");
		m4.setNomeartista("Los Hermanos");
		m4.setCompositor("Marcelo Camelo");
		m4.setTempo(194);
		musicas.add(m4);
		Musica m5 = new Musica();
		m5.setNomemusica("Casa pré-fabricada");
		m5.setNomeartista("Los Hermanos");
		m5.setCompositor("Marcelo Camelo");
		m5.setTempo(245);
		musicas.add(m5);
		cd.setMusicas(musicas);
		System.out.println(cd.play(musicas));
		System.out.println(cd.avancarMusica(musicas,2));
		//System.out.println(cd.recuarMusica(musicas,3));
		System.out.println(cd.stop());
		System.out.println(cd.tirarCD(cd));
		op = AparelhodeSom.ControladorFuncao.Radio.getNumerofuncao();
		as.setPlayer(as.AlteraFuncao(op));
		System.out.println(as.ExibirMensagem(op));
		System.out.println(as.getPlayer());
		for(int i = 0;i<2;i++){
			as.diminuiVolume();
		}
		System.out.println("Volume : "+as.getVolume()+"");
		musicas.removeAll(musicas);
		op = AparelhodeSom.ControladorFuncao.USB.getNumerofuncao();
		//System.out.println(musicas.size());
		as.setPlayer(as.AlteraFuncao(op));
		USBPlayer usb = (USBPlayer)as.getPlayer();
		System.out.println(as.ExibirMensagem(op));
		Musica usb1 = new Musica();
		usb1.setNomemusica("Pais e filhos");
		usb1.setCompositor("Renato Russo");
		usb1.setNomeartista("Legião Urbana");
		usb1.setTempo(330);
		musicas.add(usb1);
		Musica usb2 = new Musica();
		usb2.setNomemusica("All you need is love");
		usb2.setCompositor("John Lennon");
		usb2.setNomeartista("The Beatles");
		usb2.setTempo(212);
		musicas.add(usb2);
		Musica usb3 = new Musica();
		usb3.setNomemusica("A flor");
		usb3.setCompositor("Rodrigo Amarante");
		usb3.setNomeartista("Los Hermanos");
		usb3.setTempo(210);
		musicas.add(usb3);
		Musica usb4 = new Musica();
		usb4.setNomemusica("Construção");
		usb4.setCompositor("Chico Buarque");
		usb4.setNomeartista("Chico Buarque");
		usb4.setTempo(280);
		musicas.add(usb4);
		System.out.println(usb.play(musicas));
		System.out.println(usb.avancarMusica(musicas,2));
		for(int i = 0;i<30;i++){
			as.aumetaVolume();
		}
		System.out.println("Volume : "+as.getVolume()+"");
		System.out.println(usb.avancarMusica(musicas,12));
		as.desligar();
		System.out.println(as);
	}
}

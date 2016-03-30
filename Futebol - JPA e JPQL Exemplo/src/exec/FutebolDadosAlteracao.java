package exec;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import futebol.Jogador;
import futebol.Jogo;
import futebol.Tecnico;
import futebol.Time;

public class FutebolDadosAlteracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FutebolPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		// --Alterar jogo São Paulo e Flamengo--
		// Alterando Placar
		et.begin();
		Jogo jg1 = em.find(Jogo.class, 4);
		jg1.setPlacar1(3);
		jg1.setPlacar2(2);
		et.commit();
		// Alterar pontos de São Paulo
		et.begin();
		Time t1 = em.find(Time.class, 1);
		t1.setPontos(18);
		et.commit();

		// --Alterar Jogador Ilsinho--
		et.begin();
		Jogador jil = em.find(Jogador.class, 6);
		jil.setNome("Ilsinho Cavalcanti");
		BigDecimal sil = BigDecimal.valueOf(89000);
		jil.setSalario(sil);
		jil.setCartaoamarelo(true);
		et.commit();

		// --Alterar Jogador Alex Silva--
		et.begin();
		Jogador jas = em.find(Jogador.class, 2);
		Time t2 = em.find(Time.class, 2);
		jas.setTime(t2);
		et.commit();

		// --Excluir Rogério Ceni
		et.begin();
		Jogador jrc = em.find(Jogador.class, 1);
		em.remove(jrc);
		et.commit();

		// --Cruzeiro Faliu
		// Deletando Jogadores
		et.begin();
		Jogador jas1 = em.find(Jogador.class, 2);
		em.remove(jas1);
		et.commit();
		et.begin();
		Jogador jb = em.find(Jogador.class, 3);
		em.remove(jb);
		et.commit();
		et.begin();
		Jogador jec = em.find(Jogador.class, 4);
		em.remove(jec);
		et.commit();
		// Deletado Time
		et.begin();
		Jogo jgs1 = em.find(Jogo.class,1);
		jgs1.setTimecasa(null);
		jgs1.setTimevisitante(null);
		et.commit();
		et.begin();
		Jogo jgs2 = em.find(Jogo.class,2);
		jgs2.setTimecasa(null);
		jgs2.setTimevisitante(null);
		et.commit();
		et.begin();
		Jogo jgs3 = em.find(Jogo.class,3);
		jgs3.setTimecasa(null);
		jgs3.setTimevisitante(null);
		et.commit();
		et.begin();
		Time t3 = em.find(Time.class, 2);
		em.remove(t3);
		et.commit();
		// Deletando Tecnico
		et.begin();
		Tecnico tec = em.find(Tecnico.class, 3);
		em.remove(tec);
		et.commit();
		// --The End--
		em.close();
		emf.close();

	}

}

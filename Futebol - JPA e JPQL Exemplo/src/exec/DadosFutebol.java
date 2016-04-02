package exec;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import futebol.Campeonato;
import futebol.CampeonatoTime;
import futebol.CampeonatoTimePK;
import futebol.Jogador;
import futebol.Jogo;
import futebol.Juiz;
import futebol.Tecnico;
import futebol.Time;

public class DadosFutebol {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FutebolPersistence"); //
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		// --TECNICOS--
		// Paulo Autuori
		et.begin();
		Tecnico t1 = new Tecnico();
		t1.setNome("Paulo Autuori");
		Calendar tpa = Calendar.getInstance();
		tpa.set(1958, Calendar.MARCH, 10);
		t1.setDtnasc(tpa);
		BigDecimal spa = BigDecimal.valueOf(102000);
		t1.setSalario(spa);
		em.persist(t1);
		et.commit();
		// Mano Menezes
		et.begin();
		Tecnico t2 = new Tecnico();
		t2.setNome("Mano Menezes");
		Calendar tmm = Calendar.getInstance();
		tmm.set(1957, Calendar.APRIL, 21);
		t2.setDtnasc(tmm);
		BigDecimal smm = BigDecimal.valueOf(90000);
		t2.setSalario(smm);
		em.persist(t2);
		et.commit();
		// Marcelo Oliveira
		et.begin();
		Tecnico t3 = new Tecnico();
		t3.setNome("Marcelo Oliveira");
		Calendar tmo = Calendar.getInstance();
		tmo.set(1958, Calendar.MARCH, 10);
		t3.setDtnasc(tmo);
		BigDecimal smo = BigDecimal.valueOf(82500);
		t3.setSalario(smo);
		em.persist(t3);
		et.commit();
		// -----------------------------------------------------

		// Times
		// São Paulo
		et.begin();
		Time time1 = new Time();
		time1.setNome("São Paulo");
		time1.setEstado("SP");
		time1.setPontos(15);
		time1.setTecnico(t1);
		em.persist(time1);
		et.commit();
		// Cruzeiro
		et.begin();
		Time time2 = new Time();
		time2.setNome("Cruzeiro");
		time2.setEstado("MG");
		time2.setPontos(32);
		time2.setTecnico(t3);
		em.persist(time2);
		et.commit();
		// Flamengo
		et.begin();
		Time time3 = new Time();
		time3.setNome("Flamengo");
		time3.setEstado("RJ");
		time3.setPontos(30);
		time3.setTecnico(t2);
		em.persist(time3);
		et.commit();
		// ------------------------------------------

		// Jogadores
		// Rogério Ceni
		et.begin();
		Jogador j1 = new Jogador();
		j1.setNome("Rogério Ceni");
		j1.setTime(time1);
		Calendar jrc = Calendar.getInstance();
		jrc.set(1979, Calendar.OCTOBER, 28);
		j1.setDtnasc(jrc);
		BigDecimal src = BigDecimal.valueOf(88000);
		j1.setSalario(src);
		j1.setNcamisa(01);
		j1.setEmcampo(true);
		j1.setCartaoamarelo(false);
		j1.setQtd_amarelos(2);
		j1.setQtd_vermelhos(1);
		em.persist(j1);
		et.commit();
		// Alex Silva
		et.begin();
		Jogador j2 = new Jogador();
		j2.setNome("Alex Silva");
		j2.setTime(time1);
		Calendar jas = Calendar.getInstance();
		jas.set(1983, Calendar.JANUARY, 04);
		j2.setDtnasc(jas);
		BigDecimal sas = BigDecimal.valueOf(45000);
		j2.setSalario(sas);
		j2.setNcamisa(02);
		j2.setEmcampo(true);
		j2.setCartaoamarelo(false);
		j2.setQtd_amarelos(2);
		j2.setQtd_vermelhos(1);
		em.persist(j2);
		et.commit();
		// Fabão
		et.begin();
		Jogador j3 = new Jogador();
		j3.setNome("Fabão");
		j3.setTime(time2);
		Calendar jfa = Calendar.getInstance();
		jfa.set(1982, Calendar.NOVEMBER, 22);
		j3.setDtnasc(jfa);
		BigDecimal sfa = BigDecimal.valueOf(52500);
		j3.setSalario(sfa);
		j3.setNcamisa(03);
		j3.setEmcampo(true);
		j3.setCartaoamarelo(false);
		j3.setQtd_amarelos(3);
		j3.setQtd_vermelhos(0);
		em.persist(j3);
		et.commit();
		// Edcarlos
		et.begin();
		Jogador j4 = new Jogador();
		j4.setNome("Edcarlos");
		j4.setTime(time2);
		Calendar jec = Calendar.getInstance();
		jec.set(1984, Calendar.MAY, 16);
		j4.setDtnasc(jec);
		BigDecimal sec = BigDecimal.valueOf(70000);
		j4.setSalario(sec);
		j4.setNcamisa(04);
		j4.setEmcampo(false);
		j4.setCartaoamarelo(false);
		j4.setQtd_amarelos(1);
		j4.setQtd_vermelhos(0);
		em.persist(j4);
		et.commit();
		// Souza
		et.begin();
		Jogador j5 = new Jogador();
		j5.setNome("Souza");
		j5.setTime(time1);
		Calendar jso = Calendar.getInstance();
		jso.set(1980, Calendar.SEPTEMBER, 27);
		j5.setDtnasc(jso);
		BigDecimal sso = BigDecimal.valueOf(65000);
		j5.setSalario(sso);
		j5.setNcamisa(15);
		j5.setEmcampo(true);
		j5.setCartaoamarelo(true);
		j5.setQtd_amarelos(1);
		j5.setQtd_vermelhos(1);
		em.persist(j5);
		et.commit();
		// Ilsinho
		et.begin();
		Jogador j6 = new Jogador();
		j6.setNome("Ilsinho");
		j6.setTime(time1);
		Calendar jil = Calendar.getInstance();
		jil.set(1984, Calendar.NOVEMBER, 25);
		j6.setDtnasc(jil);
		BigDecimal sil = BigDecimal.valueOf(43860.90);
		j6.setSalario(sil);
		j6.setNcamisa(06);
		j6.setEmcampo(false);
		j6.setCartaoamarelo(false);
		j6.setQtd_amarelos(2);
		j6.setQtd_vermelhos(0);
		em.persist(j6);
		et.commit();
		// ------------------------------------------------

		// Juizes
		// Armando Marques
		et.begin();
		Juiz jz1 = new Juiz();
		jz1.setNome("Armando Marques");
		Calendar cjz1 = Calendar.getInstance();
		cjz1.set(1930, Calendar.FEBRUARY, 06);
		jz1.setDtnasc(cjz1);
		BigDecimal sjz1 = BigDecimal.valueOf(24000);
		jz1.setSalario(sjz1);
		em.persist(jz1);
		et.commit();
		// Paulo Cesar de Oliveira
		et.begin();
		Juiz jz2 = new Juiz();
		jz2.setNome("Paulo Cesar de Oliveira");
		Calendar cjz2 = Calendar.getInstance();
		cjz2.set(1973, Calendar.DECEMBER, 16);
		jz2.setDtnasc(cjz2);
		BigDecimal sjz2 = BigDecimal.valueOf(35000);
		jz2.setSalario(sjz2);
		em.persist(jz2);
		et.commit();
		//------------------------------------------------------
		
		// Jogos
		// Jogo 1
		et.begin();
		Jogo jg1 = new Jogo();
		jg1.setTimecasa(time1);
		jg1.setTimevisitante(time2);
		jg1.setPlacar1(2);
		jg1.setPlacar2(1);
		Calendar cjg1 = Calendar.getInstance();
		cjg1.set(2013, Calendar.JULY, 13);
		jg1.setDatajogo(cjg1);
		jg1.setJuiz(jz2);
		jg1.setNomecampo("Pacaembu");
		em.persist(jg1);
		et.commit();
		// Jogo 2
		et.begin();
		Jogo jg2 = new Jogo();
		jg2.setTimecasa(time2);
		jg2.setTimevisitante(time1);
		jg2.setPlacar1(0);
		jg2.setPlacar2(0);
		Calendar cjg2 = Calendar.getInstance();
		cjg2.set(2013, Calendar.OCTOBER, 10);
		jg2.setDatajogo(cjg2);
		jg2.setJuiz(jz1);
		jg2.setNomecampo("Mineirão");
		em.persist(jg2);
		et.commit();
		// Jogo 3
		et.begin();
		Jogo jg3 = new Jogo();
		jg3.setTimecasa(time3);
		jg3.setTimevisitante(time2);
		jg3.setPlacar1(1);
		jg3.setPlacar2(1);
		Calendar cjg3 = Calendar.getInstance();
		cjg3.set(2013, Calendar.AUGUST, 14);
		jg3.setDatajogo(cjg3);
		jg3.setJuiz(jz2);
		jg3.setNomecampo("Maracanã");
		em.persist(jg3);
		et.commit();
		// Jogo 4
		et.begin();
		Jogo jg4 = new Jogo();
		jg4.setTimecasa(time1);
		jg4.setTimevisitante(time3);
		jg4.setPlacar1(0);
		jg4.setPlacar2(0);
		Calendar cjg4 = Calendar.getInstance();
		cjg4.set(2013, Calendar.SEPTEMBER, 19);
		jg4.setDatajogo(cjg4);
		jg4.setJuiz(jz1);
		jg4.setNomecampo("Pacaembu");
		em.persist(jg4);
		et.commit();
		
		//--Campeonatos--
		//-Campeonato Brasileiro-
		et.begin();
		Campeonato cb = new Campeonato();
		cb.setNome_campeonato("Campeonato Brasileiro");
		Calendar dicb1 = Calendar.getInstance();
		dicb1.set(2013,Calendar.JUNE, 10);
		cb.setDtinicio(dicb1);
		Calendar dfcb1 = Calendar.getInstance();
		dfcb1.set(2013,Calendar.DECEMBER,02);
		cb.setDtfim(dfcb1);
		em.persist(cb);
		et.commit();
		//-Taça Glória do Goitá-
		et.begin();
		Campeonato ctgg = new Campeonato();
		ctgg.setNome_campeonato("Taça Glória do Goitá");
		Calendar dicb2 = Calendar.getInstance();
		dicb2.set(2013,Calendar.MARCH, 02);
		ctgg.setDtinicio(dicb2);
		Calendar dfcb2 = Calendar.getInstance();
		dfcb2.set(2013,Calendar.MAY,01);
		ctgg.setDtfim(dfcb2);
		em.persist(ctgg);
		et.commit();
		
		//--Times do Campeonato--
		//-São Paulo
		et.begin();
		CampeonatoTimePK c1t1 = new CampeonatoTimePK();
		c1t1.setCampeonato(cb);
		c1t1.setTime(time1);
		CampeonatoTime ct1 = new CampeonatoTime();
		ct1.setChaves(c1t1);
		ct1.setPosicao(1);
		em.persist(ct1);
		et.commit();
		//-Cruzeiro-
		et.begin();
		CampeonatoTimePK c2t2 = new CampeonatoTimePK();
		c2t2.setCampeonato(ctgg);
		c2t2.setTime(time2);
		CampeonatoTime ct2 = new CampeonatoTime();
		ct2.setChaves(c2t2);
		ct2.setPosicao(1);
		em.persist(ct2);
		et.commit();
		//--Flamengo--
		et.begin();
		CampeonatoTimePK c1t3 = new CampeonatoTimePK();
		c1t3.setCampeonato(cb);
		c1t3.setTime(time3);
		CampeonatoTime ct31 = new CampeonatoTime();
		ct31.setChaves(c1t3);
		ct31.setPosicao(2);
		em.persist(ct31);
		et.commit();
		
		et.begin();
		CampeonatoTimePK c2t3 = new CampeonatoTimePK();
		c2t3.setCampeonato(ctgg);
		c2t3.setTime(time3);
		CampeonatoTime ct32 = new CampeonatoTime();
		ct32.setChaves(c2t3);
		ct32.setPosicao(2);
		em.persist(ct32);
		et.commit();
		// Fecha a Conexão
		em.close();
		emf.close();
	}
}

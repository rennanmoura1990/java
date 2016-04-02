package exec;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import futebol.Jogador;

public class QueryResults {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FutebolPersistence");
		EntityManager em = emf.createEntityManager();
		DAOJPQL dao = new DAOJPQL();
		//Pesquisa Jogador de um determinado time
		System.out.println(dao.pesquisarJogador(em, 3,2));
		//Jogadores com mais de 1 cartão amarelo de um determinado time
		ArrayList<Jogador> jogadores = (ArrayList<Jogador>) dao.pesquisaTitular(em,1);
		for(int i=0;i<jogadores.size();i++){
			System.out.println("-----------------");
			System.out.println(jogadores.get(i));
		}
		//Retornar a quantidade de jogadores dos times de uma determinada unidade federativa e cujo nome do time comece com ‘A’.
		System.out.println("Quantidade : "+dao.QtdJogadores(em,"SP"));
		}
	}



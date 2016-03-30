package exec;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import futebol.Jogador;

public class DAOJPQL {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("FutebolPersistence");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//Pesquisa 1 => a) Pesquisar jogador pelo número da camisa de um determinado time
	public Jogador pesquisarJogador(EntityManager em,int ncamisa,int id){
		Query query = em.createQuery("SELECT j FROM Jogador j WHERE ncamisa = :ncamisa AND id_time= :id",Jogador.class);
		query.setParameter("ncamisa",ncamisa);
		query.setParameter("id",id);
		return (Jogador) query.getSingleResult();
	}
	//Pesquisa 2=> b)Pesquisar jogadores titulares com mais de um cartão amarelo de um determinado time
	@SuppressWarnings("unchecked")
	public List<Jogador> pesquisaTitular(EntityManager em,int time){
		Query query = em.createQuery("SELECT j FROM Jogador j WHERE id_time=:id AND qtd_amarelos > 1",Jogador.class);
		query.setParameter("id",time);
		return (List<Jogador>)query.getResultList();
		
	}
	//Pesquisa 3=>Retornar a quantidade de jogadores dos times de uma determinada unidade federativa e cujo nome do time comece com ‘A’.
	public long QtdJogadores(EntityManager em,String uf){
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
		Root jogador = criteriaQuery.from(Jogador.class);
		criteriaQuery.select(criteriaBuilder.count(jogador));
		Join time = jogador.join("time");
		criteriaQuery.where(criteriaBuilder.equal(time.get("estado"),uf),criteriaBuilder.like(time.get("nome"),"A%"));
		Query query = em.createQuery(criteriaQuery);
		return (long) query.getSingleResult();
	}
}

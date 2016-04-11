package Exec;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.DAOPessoa;
import basicas.Cliente;
import basicas.Pessoa;

/**
 * Monta Tabela e Insere 1 cliente de exemplo
 * @author Rennan
 *
 */
public class TestPersistencia {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestauranteRennan"); //
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		DAOPessoa dc = new DAOPessoa();
		Cliente c = new Cliente();
		c.setNome("João");
		c.setEmail("joaodez@gmail.com");
		Calendar dtnasc = Calendar.getInstance();
		dtnasc.set(1990,Calendar.NOVEMBER,24);
		c.setDtnasc(dtnasc);
		c.setPag_facebook("facebook.com/joao_carlos");
		c.setUser_twitter("@joaocarlos");
		dc.inserir(c);
		et.commit();
		String busca = dc.buscarId(1,Pessoa.class).toString();
		System.out.println(busca);
		List<Pessoa> pessoas = dc.ListaTudo(Pessoa.class);
		for(Pessoa p:pessoas){
			int i = 0;
			p = pessoas.get(i);
			System.out.println(p);
			i++;
		}
		em.close();
		emf.close();
	}
	
}

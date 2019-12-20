package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCurso_Nome(String nomeCurso);

	//caso nao queira que o metodo seja o gerado automaricamente, por ex por causa do nome, é necessario os comando abaixo
	//@Query("SELECT T FROM TOPICO T WHERE T.CURSO.NOME = :nomeCurso")
	//List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}

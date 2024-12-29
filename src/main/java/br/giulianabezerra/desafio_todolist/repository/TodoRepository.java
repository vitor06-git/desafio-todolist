package br.giulianabezerra.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.giulianabezerra.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}

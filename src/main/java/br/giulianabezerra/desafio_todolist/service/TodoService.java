package br.giulianabezerra.desafio_todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.giulianabezerra.desafio_todolist.entity.Todo;
import br.giulianabezerra.desafio_todolist.repository.TodoRepository;

@Service
public class TodoService {
	
	public final TodoRepository todoRepository;
	
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public Todo create(Todo todo){
		return todoRepository.save(todo);
	}
	
	public List<Todo> list(){
		Sort sort = Sort.by("prioridade").ascending().and(
				Sort.by("name").ascending());
		return todoRepository.findAll(sort);
		
	}
	
	public List<Todo> update(Todo todo){
		todoRepository.save(todo);
		return list();
		
	}
	
	public List<Todo> delete(Long id){
		todoRepository.deleteById(id);
		return list();
		
	}

}

package com.allogica.ToDoApp.models.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.allogica.ToDoApp.models.entities.ToDo;

@Service
public class ToDoService {

	private List<ToDo> toDos = new ArrayList<ToDo>();

	public void addToDo(ToDo toDo) {
		toDos.add(toDo);
	}

	public ToDo getToDo(int id) {
		return toDos.get(id);
	}
	
	public List<ToDo> getToDoList() {
		return toDos;
	}

	public void delete(int id) {

		if (id >= 0 && id < getToDoList().size()) {
			toDos.remove(id);
		}
	}
	
	public void update(ToDo toDo, int id) {

		if (id >= 0 && id < getToDoList().size()) {
			toDos.set(id, toDo);
		}
	}

}

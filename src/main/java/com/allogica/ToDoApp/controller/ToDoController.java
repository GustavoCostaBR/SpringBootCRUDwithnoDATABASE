package com.allogica.ToDoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.allogica.ToDoApp.models.entities.ToDo;
import com.allogica.ToDoApp.models.services.ToDoService;

import jakarta.validation.Valid;

@Controller
public class ToDoController {

	@Autowired
	private ToDoService service;
	
	@GetMapping(value = "/create")
	public String openCreatePage() {
		
		return "create_todo";
	}
	
	@PostMapping(value = "/create")
	public String createNewToDo(@Valid @ModelAttribute ToDo toDo) {
		
		service.addToDo(toDo);
		return "create_todo";
	}
	
	@ResponseBody
	@GetMapping(value = "/view")
	public List<ToDo> getToDoList() {
		return service.getToDoList();
	}
	
	@GetMapping(value = "/viewtodolist")
	public String getViewTodoList(Model model) {
		
		model.addAttribute("toDos", service.getToDoList());
		return "view_todo_list";
	}
	
	@GetMapping(value = "/delete")
	public String delete(@RequestParam int id, Model model) {
		
		service.delete(id);
		model.addAttribute("toDos", service.getToDoList());
		return "view_todo_list";
	}
	
	@GetMapping(value = "/update")
	public String update(@RequestParam int id, Model model) {
		ToDo toDo = service.getToDo(id);
//		System.out.println(toDo);
		model.addAttribute("id", id);
		model.addAttribute("toDo", toDo);
		return "update_todo";
	}
	
	@PostMapping(value = "/update")
	public String updatePost(@Valid @ModelAttribute ToDo toDo, @RequestParam int id, Model model) {
		service.update(toDo, id);
		model.addAttribute("toDos", service.getToDoList());
		return "redirect:/viewtodolist";
	}
	
}

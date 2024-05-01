package com.allogica.ToDoApp.models.entities;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ToDo {
	@NotNull
	@NotEmpty
	private String title;
	
	@NotBlank
	private String description;
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	private LocalDateTime scheduledDate;
	
	public ToDo(String title, String description, LocalDateTime scheduledDate) {
		this.title = title;
		this.description = description;
		this.scheduledDate = scheduledDate;
	}
	public ToDo() {
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(LocalDateTime scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	@Override
	public String toString() {
		return "ToDo [title=" + title + ", description=" + description + ", scheduledDate=" + scheduledDate + "]";
	}
	

}

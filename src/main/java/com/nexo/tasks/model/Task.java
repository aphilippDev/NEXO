package com.nexo.tasks.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Task {
    private UUID id;
    private String title;
    private String description;
    private Recurrence recurrence;
    private LocalDateTime createdAt;
    private LocalDate dueDate;

    public Task(UUID id, String title, String description, Recurrence recurrence, LocalDateTime createdAt, LocalDate dueDate){
        this.id = id;
        this.title = title;
        this.description = description;
        this.recurrence = recurrence;
        this.createdAt = createdAt;
        this.dueDate = dueDate;
    }

    //Getters
    public UUID getId(){ return id; }
    public String getTitle(){return title;}
    public String getDescription(){return description;}
    public Recurrence getRecurrence(){return recurrence;}
    public LocalDateTime getCreatedAt(){return createdAt;}
    public LocalDate getDueDate(){return dueDate;}

    //Setters
    public void setId(UUID id){ this.id=id;}
    public void setTitle(String titleTask){ this.title=titleTask;}
    public void setDescription(String description){ this.description=description;}
    public void setRecurrence(Recurrence recurrence){ this.recurrence=recurrence;}
    public void setCreatedAt(LocalDateTime createdAt){ this.createdAt=createdAt;}
    public void setDueDate(LocalDate dueDate){ this.dueDate= dueDate;}

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task other)) return false;
        return Objects.equals(id, other.id);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //toString
    @Override
    public String toString(){
        return "Task{Id= "+id+", Title= "+title+", Description= "+description+",\nFrequency= "+recurrence+", Creation Date= " +createdAt+", Due Date= "+dueDate+"}";
    }
}

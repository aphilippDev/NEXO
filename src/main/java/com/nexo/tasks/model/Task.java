package com.nexo.tasks.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Task {
    private final UUID id;
    private String title;
    private String description;
    private Recurrence recurrence;
    private final LocalDateTime createdAt;
    private LocalDate dueDate;

    public Task(UUID id, String title, String description, Recurrence recurrence, LocalDateTime createdAt, LocalDate dueDate){
        this.id = Objects.requireNonNull(id, "El id no puede ser null");
        this.title = validateTitle(title);
        this.description = Objects.requireNonNull(description, "La descripción no puede ser null");
        this.recurrence =  Objects.requireNonNull(recurrence, "La recurrencia no puede ser nula");
        this.createdAt = Objects.requireNonNull(createdAt, "La fecha de creación no puede ser nula");
        this.dueDate = validateDueDate(dueDate, createdAt);
    }

    //Getters
    public UUID getId(){ return id; }
    public String getTitle(){return title;}
    public String getDescription(){return description;}
    public Recurrence getRecurrence(){return recurrence;}
    public LocalDateTime getCreatedAt(){return createdAt;}
    public LocalDate getDueDate(){return dueDate;}

    //validates
    private static  String validateTitle(String nombre){
        Objects.requireNonNull(nombre, "El título no puede ser null");
        if(nombre.isBlank()){
            throw new IllegalArgumentException("El título no puede estar vacío");
        }
        return nombre.strip();
    }
    private static  LocalDate validateDueDate(LocalDate dueDate, LocalDateTime createdAt){
        Objects.requireNonNull(dueDate, "La fecha de vencimiento no puede ser null");
        if(dueDate.isBefore(createdAt.toLocalDate())){
            throw new IllegalArgumentException("La fecha de vencimiento no puede ser anterior a la fecha de creación");
        }
        return dueDate;
    }

    //Setters
    public void setTitle(String title){this.title=validateTitle(title);}
    public void setDescription(String description){ this.description= Objects.requireNonNull(description, "La descripción no puede ser null");}
    public void setRecurrence(Recurrence recurrence){ this.recurrence=Objects.requireNonNull(recurrence, "La recurrencia no puede ser nula");}
    public void setDueDate(LocalDate dueDate){ this.dueDate=validateDueDate(dueDate, createdAt);}

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
        return "Task{Id= "+id+", Title= "+title+", Description= "+description+", Recurrence= "+recurrence+", Creation Date= " +createdAt+", Due Date= "+dueDate+"}";
    }
}

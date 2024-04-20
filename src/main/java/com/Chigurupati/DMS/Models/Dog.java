package com.Chigurupati.DMS.Models;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
/*
 * @Author Manikanta Chigurupati
 */
@Entity
public class Dog {
@Id
 private int id;
 private String name;
 private String breed;
 @Autowired
 @ManyToOne
 private Trainer trainer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public Trainer getTrainer() {
	return trainer;
}
public void setTrainer(Trainer trainer) {
	this.trainer = trainer;
}
@Override
public String toString() {
	return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", trainer=" + trainer + "]";
}

}
package com.Chigurupati.DMS.repository;
/*
 * @Author Manikanta Chigurupati
 */
import org.springframework.data.repository.CrudRepository;

import com.Chigurupati.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>{
}
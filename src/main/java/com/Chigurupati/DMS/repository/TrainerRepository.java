package com.Chigurupati.DMS.repository;
/*
 * @Author Manikanta Chigurupati
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Chigurupati.DMS.Models.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer,Integer> {

}

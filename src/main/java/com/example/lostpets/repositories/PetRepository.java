package com.example.lostpets.repositories;

import com.example.lostpets.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

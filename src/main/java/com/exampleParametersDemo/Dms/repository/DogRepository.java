package com.exampleParametersDemo.Dms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.exampleParametersDemo.Dms.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>{
      List<Dog> findByName(String name);
}


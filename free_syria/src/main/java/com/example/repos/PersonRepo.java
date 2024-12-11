package com.example.repos;

import com.example.entytis.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonRepo extends JpaRepository <Person, Long>

{









}

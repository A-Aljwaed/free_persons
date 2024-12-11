package com.example.services;

import com.example.entytis.Person;
import com.example.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class PersonService {






    @Autowired
    private PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo pesonRepo) {

        super();
        this.personRepo=pesonRepo;
    }




    public List<Person> getAllPerson() {
        return personRepo.findAll();
    }





    public Person savePerson(Person member) {
        return personRepo.save(member);
    }


    public Person getPersonID(Long id) {
        return personRepo.findById(id).get();
    }


    public Person updatePerson(Person person) {
        return personRepo.save(person);
    }


    public Person deletePerson(Long id) {
        Person perosn = personRepo.findById(id).get();
        personRepo.delete(perosn);

        return null;
    }
}



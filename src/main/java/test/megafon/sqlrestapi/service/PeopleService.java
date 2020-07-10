package test.megafon.sqlrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.megafon.sqlrestapi.dao.PeopleRepository;
import test.megafon.sqlrestapi.model.People;

import java.util.List;

@Service
public class PeopleService {
    PeopleRepository pRepository;
    @Autowired
    public PeopleService(PeopleRepository pRepository){
        this.pRepository = pRepository;
    }
    public List<People> getAllPeople(){
        return pRepository.findAll();
    }
}

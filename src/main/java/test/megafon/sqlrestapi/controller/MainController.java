package test.megafon.sqlrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.megafon.sqlrestapi.model.People;
import test.megafon.sqlrestapi.service.PeopleService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MainController {

    PeopleService pService;
    @Autowired
    public MainController(PeopleService pService){
        this.pService = pService;
    }
    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public List<People> getAll(){
        return pService.getAllPeople();
    }
    @RequestMapping(value = "/people/{id}", method = RequestMethod.GET)
    public People getOne(@PathVariable int id){
        try{
            return pService.getOnePeople(id);
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}

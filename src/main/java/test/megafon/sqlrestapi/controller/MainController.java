package test.megafon.sqlrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.megafon.sqlrestapi.model.People;
import test.megafon.sqlrestapi.service.PeopleService;

import java.util.List;

@RestController
public class MainController {

    PeopleService pService;
    @Autowired
    public MainController(PeopleService pService){
        this.pService = pService;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<People> getAll(){
        return pService.getAllPeople();
    }
}

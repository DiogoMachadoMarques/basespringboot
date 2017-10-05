package com.springboot.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/base")
public class ControllerBase {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<String> getBase(@PathVariable("id") int id){
        ArrayList<String> lista = new ArrayList<String>();
        for(int i = id; i <= 10; i++){
            lista.add("item " + i);
        }
        return lista;
    }
}

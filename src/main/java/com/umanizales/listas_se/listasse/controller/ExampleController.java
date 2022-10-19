package com.umanizales.listas_se.listasse.controller;

import com.umanizales.listas_se.listasse.model.Kid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "example")
public class ExampleController {
    @GetMapping
    public String getMessage()
    {
        return "que hubo desde murillo Campeones";
    }

    @GetMapping(path = "/message2")
    public String getMessage2()
    {
        return "Estos locos estan como desjuiciados, va a tocar apretarlos";
    }

    @GetMapping(path = "concatmessage/{word1}/{word2}")
    public String getMessage3(@PathVariable String word1,
                              @PathVariable String word2)
    {
        return "hola "+word1 +" "+word2;
    }

    @GetMapping(path = "add/{num1}/{num2}")
    public int add(@PathVariable int num1,
                   @PathVariable int num2)
    {
        return num1 + num2;
    }

    @GetMapping(path = "kid")
    public Kid getKid()
    {
        Kid murillo = new Kid("1002654940","Jeronimo Murillo",(byte)19,'M');
        murillo.setAge((byte) 24);

        return murillo;
    }

}


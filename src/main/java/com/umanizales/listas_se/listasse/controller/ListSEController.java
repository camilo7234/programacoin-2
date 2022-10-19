package com.umanizales.listas_se.listasse.controller;

import com.umanizales.listas_se.listasse.model.Kid;
import com.umanizales.listas_se.listasse.model.Node;
import com.umanizales.listas_se.listasse.service.KidByPositionDTO;
import com.umanizales.listas_se.listasse.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ListSEController {
    @Autowired
    private ListSEService listSEService;

    @GetMapping(path = "getlist")
    public Node getList() {
        return listSEService.getList().getHead();
    }

    @PostMapping(path = "addkid")
    public String addKId(@RequestBody Kid kid) {
        return listSEService.add(kid);
    }

    @PostMapping(path = "addfirst")
    public String addFirst(@RequestBody Kid kid){return listSEService.addFirst(kid);}
    @PostMapping(path = "addend")
    public String addEnd(@RequestBody Kid kid){return listSEService.AddEnd(kid);}
    @GetMapping(path = "girlfirst")
    public  String girlFirst(@RequestBody Kid kid)

    {return listSEService.girlFirst(kid);}
    @GetMapping (path = "invert")
    public String invert(@RequestBody Kid kid){return  listSEService.invert(kid);}
    @PostMapping(path = "deleteposition")
    public String deletePosition(@RequestBody Kid kid){return  listSEService.deletePosition(kid);}
    @GetMapping(path = "count")
    public String count(@RequestBody Kid kid){return  listSEService.count(kid);}
    @GetMapping(path = "/mixbygender") // se genera la ruta url con path
    public String mixByGender() // se llama a la clase
    {
        return listSEService.mixByGender(); // se retorna como tipo string de la lista se del servicio
    }
    @PostMapping(path="/byposition")
    public String addByPosition2(@RequestBody KidByPositionDTO kidByPositionDTO)
    {
        return listSEService.addNotify(kidByPositionDTO);
    }


}

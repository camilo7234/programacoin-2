package com.umanizales.listas_se.listasse.service;
import com.umanizales.listas_se.listasse.model.Kid;
import com.umanizales.listas_se.listasse.model.ListSE;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE list;

    public ListSEService() {
        list = new ListSE();
        list.add(new Kid("1002654940", "Jeronimo Murillo", (byte) 19, 'M'));
        list.add(new Kid("34344343", "Pedro Pérez", (byte) 16, 'M'));

    }
    public String add(Kid kid){
        list.add(kid);
        return "kid adicionado correctamente";
    }
    public String addFirst(Kid kid)
    { list.addFirst(kid);
        return "el niño se añadio al incio";}
    public String AddEnd(Kid kid){
        list.addEnd(kid);
        return "el niño se añadio al final";

    }
    public  String girlFirst(Kid kid){
        list.girlFirst();
        return "se añadieron las niñas al inicio";
    }
    public String invert(Kid kid){
        list.invert();
        return "lista invertida";
    }
    public  String deletePosition(Kid kid){
        list.invert();
        return "posicion eliminada";}
    public  String count(Kid kid){
        list.invert();
        return "lista recorrida";}
    public String mixByGender(Kid kid)
    {
        list.mixbygender();
        return "Se ha mezclado"; //se retorna el mensaje
    }
    public String addPosition(KidByPositionDTO kidByPositionDTO){
        if(kidByPositionDTO.getPosition()>0
                && kidByPositionDTO.getPosition() <= (list.getSize()+1))
        {
            list.Notify(kidByPositionDTO.getPosition(),
                    kidByPositionDTO.getKid());
            return "Adicionado exitosamente";
        }
        else {
            return "Posición no permitida";
        }
}
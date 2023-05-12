package ru.manager;

import ru.plase.Plase;
import ru.plase.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    Map <String , Plase> plaseRest = new HashMap<>();

    public void addPlase (Plase plase){
        plaseRest.put(plase.getName() , plase);
    }

    public void dellPlase (String plase){
        plaseRest.remove(plase);
    }

    public List<Plase> getPlaseType (String type){
        List<Plase> list = new ArrayList<>();
        boolean controlTupe = Type.BAR.toString() == type || Type.CLUB.toString() == type || Type.CAFE.toString() == type
                || Type.RESTAURANT.toString() == type;
        if (plaseRest.size() == 0){
            System.out.println("Empty List Plases");
            return null;
        }
        if (controlTupe){

            for(String typePlase : plaseRest.keySet()){
                if (plaseRest.get(typePlase).getType().toString() == type){
                    list.add(plaseRest.get(typePlase));
                }
            }
        }
        return list;
    }


}

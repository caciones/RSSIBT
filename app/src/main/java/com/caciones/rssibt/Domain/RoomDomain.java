package com.caciones.rssibt.Domain;

import com.orm.SugarRecord;

/**
 * Created by Lenovo on 27/02/2015.
 */
public class RoomDomain extends SugarRecord<RoomDomain>{


    String name;
    double wight;
    double length;
    String nameBT;

    public RoomDomain(){
    }

    public RoomDomain(String name, double wight, double length, String nameBT){

        this.name = name;
        this.wight = wight;
        this.length = length;
        this.nameBT = nameBT;


    }
}

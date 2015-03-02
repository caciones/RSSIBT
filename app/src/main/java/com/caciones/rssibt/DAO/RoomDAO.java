package com.caciones.rssibt.DAO;

import com.caciones.rssibt.Domain.RoomDomain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lenovo on 27/02/2015.
 */
public class RoomDAO {

    public List<RoomDomain> getAllRoom(){

        Iterator<RoomDomain> rooms = RoomDomain.findAll(RoomDomain.class);
        List<RoomDomain> roomsList = Lists.newArrayList(rooms);
        for(RoomDomain room : rooms ){
            roomsList.add(room);
        }
        return rooms;
    }

    public SaveRoom(RoomDomain saveRoom){
        RoomDomain room = new RoomDomain(name, wight,length, nameBT);
        room.save();
    }
}

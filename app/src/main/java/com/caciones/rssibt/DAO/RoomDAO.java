package com.caciones.rssibt.DAO;

import com.caciones.rssibt.Domain.RoomDomain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lenovo on 27/02/2015.
 */
public class RoomDAO {

    public Iterator<RoomDomain> getAllRoom(){

        return  RoomDomain.findAll(RoomDomain.class);
    }

    public void SaveRoom(RoomDomain saveRoom){
        RoomDomain room = new RoomDomain();


    }
    public void deleteRoom(RoomDomain room){
        room.delete();
    }

    public List<RoomDomain> findRoomByName( String name ){
        return RoomDomain.find(RoomDomain.class, "name = ?", name);
    }
    public static RoomDomain load(long id){
        return RoomDomain.findById(RoomDomain.class, id);
    }

}

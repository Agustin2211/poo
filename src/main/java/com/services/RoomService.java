package com.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entities.Room;
import com.repositories.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;

	public List<Room> retrieveAvailableRooms(Date from, Date to,String occupancy) {
		return roomRepository.retrieveAvailableRooms(from, to, occupancy);
	}



	public Room findById(String id) {
		return roomRepository.findByIdRoom(id);
	}
	
}

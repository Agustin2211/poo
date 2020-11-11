package com.example.demo.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private User guest;
    private Date checkIn;
    private Date checkOut;
    private Date createdAt;
    private Room room;
    private boolean breakfastIncluded;
    private boolean parking;
    private boolean freeCancelation;
    private float cost;

    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public User getGuest(){
        return guest;
    }

    public void setGuest(User guest){
        this.guest = guest;
    }

    public Date getCheckIn(){
        return checkIn;
    }

    public void setCheckIn(Date checkIn){
        this.checkIn = checkIn;
    }

    public Date getCheckOut(){
        return checkOut;
    }

    public void setCheckOut(Date checkOut){
        this.checkOut = checkOut;
    }

    public Date getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Room getRoom(){
        return room;
    }

    public void setRoom(Room room){
        this.room = room;
    }

    public boolean getBreakFastIncluded(){
        return breakfastIncluded;
    }

    public void setBreakFastInclude (boolean breakfastIncluded){
        this.breakfastIncluded = breakfastIncluded;
    }

    public boolean getParking(){
        return parking;
    }

    public void setParking(Boolean parking){
        this.parking = parking;
    }

    public boolean getFreeCancelation(){
        return freeCancelation;
    }

    public void setFreeCancelation(Boolean freeCancelation){
        this.freeCancelation = freeCancelation;
    }

    public float getCost(){
        return cost;
    }

    public void setCost (float cost){
        this.cost = cost;
    }
}


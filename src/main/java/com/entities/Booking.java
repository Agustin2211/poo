package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name = "id", updatable = false, nullable = false)
    private User guest;

    @Column(name = "checkIn", nullable = false)
    private Date checkIn;

    @Column(name = "checkOut", nullable = false)
    private Date checkOut;

    @Column(name = "createdAt", nullable = false)
    private Date createdAt;

    //solo puede reservar una habitacion?
   
    @OneToOne
    @JoinColumn(name = "id", updatable = false, nullable = false)
    private Room room;
    
    //si se puede reservar mas de una habitacion
   /* @OneToMany(mappedBy="Booking" )
    private List<Room> listRoom;*/

    @Column(name = "breakfastIncluded", nullable = false)
    private boolean breakfastIncluded;

    @Column(name = "parking", nullable = false)
    private boolean parking;

    @Column(name = "freeCancelation", nullable = false)
    private boolean freeCancelation;

    @Column(name = "cost", nullable = true)
    private float cost;

    public Booking(){
            super();
          //  listRoom=new ArrayList<Room>();
          }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getGuest() {
        return guest;
    }

    public void setGuest(User guest) {
        this.guest = guest;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public void setBreakfastIncluded(boolean breackfastIncluded) {
        this.breakfastIncluded = breackfastIncluded;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isFreeCancelation() {
        return freeCancelation;
    }

    public void setFreeCancelation(boolean freeCancelation) {
        this.freeCancelation = freeCancelation;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
	public String toString() {
		return "User [id=" + id + ", guest=" + guest + ", checkIn=" + checkIn + ", checkOut=" +
         checkOut + ", createdAt=" + createdAt + ", room=" + room.getName() + ", breackfastIncluded=" + breakfastIncluded + 
         ", parking=" + parking + ", freeCancelation=" + freeCancelation + ", cost=" + cost +"]";
	}  
    
}

package com.example.demo.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date createdAt;
    private Booking booking;
    private String card;
    private String cardNumber;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Date getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Booking getBooking(){
        return booking;
    }

    public void setBooking(Booking booking){
        this.booking = booking;
    }

    public String getCard(){
        return card;
    }

    public void setCard(String card){
        this.card = card;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
}

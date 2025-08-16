package com.oop.groupfive.summer25_section1.Bandhan.Visitor;

import com.oop.groupfive.summer25_section1.User;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

public class Visitor extends User implements Serializable {
    private int status; // status == 2 pending; 1 == accepted; 0 == rejected
    private String emergencyContact;


    public Visitor( String name, String phoneNo, String email, String address,String gender , String password, LocalDate dob,  String emergencyContact) {
        super( name, phoneNo, email, address, gender,password);
        this.setId(this.generateID());
        this.status = 2;
        this.emergencyContact = emergencyContact;
    }
    public int getStatus() {return status;}
    @Override
    public String toString(){
        return
                super.toString() + '\n'+ "EmergencyContact=" + emergencyContact + '\n' + "Status =" + status;
    }

    public void setStatus(int status) {this.status = status;}

    public String getEmergencyContact() {return emergencyContact;}

    public void setEmergencyContact(String emergencyContact) {this.emergencyContact = emergencyContact;}

    @Override
    public String generateID() {
        String id = " ";

        Random random = new Random();
        id  = Integer.toString(random.nextInt(1000000, 9999999));

        return id;

    }



}

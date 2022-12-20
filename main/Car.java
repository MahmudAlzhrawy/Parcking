/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Mahmud Alzhrawy
 */
class Car extends kinds {

    public Car(int wid, int id) {
        super(wid, id);
    }

   public void setWid(int wid) {
        this.wid = wid;
    }

    public int getWid() {
        return wid;
    }

    public int  getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    @Override
    public void calc(int hour){
      System.out.println("the  cost of your parking is "+hour*10);
   }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author Mahmud Alzhrawy
 */
public class Main {

    public static void main(String[] args) {
        
        int s=100;
        int c1=0,c2=0,c3=0,c4=0;
      Truck p1=new Truck(7,124665);
      Bus p2=new Bus(10,55134);
    Car p3=new Car(5,23546);
    Moto p4=new Moto(2,34565);
    while(true){
        System.out.println("\t \t\tChoose Choise please  \n");
        System.out.println("=====================================================");
        System.out.println("\t 1->>Parcking vichel ");
        System.out.println("\t 2->>parcking Staitus ");
        System.out.println("\t 3->>leaving vichel");
        System.out.println("=====================================================");
        Scanner in=new Scanner(System.in);
        System.out.println("What is your choise sir?!! ");
        int x=in.nextInt();
        if(x==1){
        
            System.out.println("Enter your vichel width please! ");
              int n=in.nextInt();
             if(s<n){
                    System.out.println("No place is Free Sorry sir!!!"); 
                }
             else{
            System.out.println("Enter the id please ");
              int d=in.nextInt();
            if(n==7){
                
                System.out.println("Enter the num of hour please! ");
                  int h=in.nextInt();
                p1.calc(h);
                p1.setWid(n);
               s-=p1.getWid();
                 p1.setId(d);
                c1++;
            
            }
            else if(n==10){
             System.out.println("Enter the num of hour please! ");
                  int h=in.nextInt();
                p2.calc(h);
                p2.setWid(n);
               s-=p2.getWid();
                 p2.setid(d);
                c2++;
            }
            else if(n==5){ System.out.println("Enter the num of hour please! ");
                  int h=in.nextInt();
                p3.calc(h);
                p3.setWid(n);
               s-=p3.getWid();
                 p3.setid(d);
                c3++;}
            else if(n==2){ System.out.println("Enter the num of hour please! ");
                  int h=in.nextInt();
                p4.calc(h);
                p4.setWid(n);
               s-=p4.getWid();
                 p4.setId(d);
                c4++;}
             }
        }
        else if(x==2){ 
        if(s<2){
            System.out.println("The parking is occupied ");
        }
        else{
            System.out.println("It find free space is "+s);   
        }
            System.out.println("\tthe number of exist vichel is -->>");
        if(c1>0){
            System.out.print("it find in parking "+c1+" Trucks\tand");
        }
         if(c2>0){
            System.out.print("it find in parking "+c2+" Buies\tand");
        }
          if(c3>0){
            System.out.print("it find in parking "+c3+" cars\tand");
        }
           if(c4>0){
            System.out.print("it find in parking "+c4+" Motocycile\tand");
        }
        }
        else if(x==3){
            System.out.println("Enter the width of your Vichel leaved ");
            int n=in.nextInt();
            s+=n;
            System.out.println("the spacse is new free space is "+s);
        }
        else {System.out.println("Your choise is not true  Try another choise!! ");}
    }
    }
}

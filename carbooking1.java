/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_11;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        booking c=new booking();
        System.out.println("Enter the car name:");
        String carname=obj.next();
        carbook cb=new carbook(carname,c);
        
    }
}
class booking {
    synchronized void check(String carname) {
        ArrayList<String> list=new ArrayList<>();
        list.add("nano");
        list.add("swift");
        if(list.contains(carname)) {
            System.out.println("OOPS!\nAlready booked!");
        }
        else
        {
            list.add(carname);
            System.out.println("Booked successfully!");
        }
    }
}

class carbook extends Thread {
    String carname;
    booking c;
    carbook(String carname,booking c) {
        this.carname=carname;
        this.c=c;
        new Thread(this).start();
    }
    public void run() {
        c.check(carname);
    }
    
}
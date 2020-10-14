package newpackage;
import newpackage.capacityneed1;
import newpackage.carbooking1;

/**
 *
 * @author User
 */
public class capacity{
    public static void main(String args[]){
        capacityneed1 capacityneed=new capacityneed1();;
        carbooking1 cb1=new carbooking1(capacityneed,"david","nano",2);
        carbooking1 cb2=new carbooking1(capacityneed,"daniel","duster",6);
        carbooking1 cb3=new carbooking1(capacityneed,"daisy","swift",4);
        carbooking1 cb4=new carbooking1(capacityneed,"dans","duster",6);
        cb1.start();
        cb2.start();
        cb3.start();
    }
    
    
}
 */
package newpackage;


/**
 *
 * @author User
 */
public class carbooking1 extends Thread {
    capacityneed1 capacityneed;
        String personname;
        String brandname;
        int noofseats;
        public carbooking1(capacityneed1 capacityneed,String personname,String brandname,int noofseats){
            this.capacityneed=capacityneed;
            this.personname=personname;
            this.brandname=brandname;
            this.noofseats=noofseats;
        }
        public synchronized void run()
        {
            capacityneed. bookcar(personname,brandname,noofseats);
            
        }
        
    }
    
package newpackage;

/**
 *
 * @author User
 */
public class  capacityneed1 {
    int seat1=2,seat2=4,seat3=6;
    String brand1="nano",brand2="swift",brand3="duster";
    public synchronized void bookcar(String name,String brand,int seats){
        if((seats==seat1||seats==seat2||seats==seat3)&&(brand==brand1||brand==brand2||brand==brand3))
        {
            System.out.println(name+"your"+brand+"with  seating capacity"+seats+"is booked sucessfully");
            System.out.println("ENJOY YOUR RIDE");
        }
        else
        {
            System.out.println("not booked");
            System.out.println("THANK YOU");
        }
    }
    
}
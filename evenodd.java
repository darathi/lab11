package multithreading;
import java.util.*;

/**
 *
 * @author User
 */
public class evenodd {
    public static void main(String args[]){
       new random().start();   
    }   
}
class random extends Thread
{
   int num;
   Random num1=new Random();
   @Override
   public void run(){
       num=num1.nextInt(20);
       System.out.println("the number is"+num);
       if(num%2==0)
       {
           new even(num).start();
       }
       if(num%2!=0)
       {
           new odd(num).start();
       }
       try
       {
           this.sleep(50);
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
   }

}
class even extends Thread
{
    int s;
    even(int a)
    {
        s=a;}
    public void run()
    {
        int b;
        b=s*s;
        System.out.println("even -square number"+b);
    }
     
}
class odd extends Thread{
    int s1;
    odd(int a)
    {
        s1=a;
    }
    public void run()
    {
        int c;
        c=s1*s1;
        System.out.println("odd-cubil number"+c);
    }
}
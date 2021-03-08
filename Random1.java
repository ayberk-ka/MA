import java.util.Random;
public class Random1
{
   public static void main(String[] args) {
       
       Random num = new Random ();
       
       int x = num.nextInt(20)+1;
    
       System.out.println(x);
    
    }
}

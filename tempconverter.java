import java.util.*;
public class tempconverter 
    {
        public static void main(String[] args)
        {
          Scanner sc =new Scanner(System.in);
          System.out.println("             TEMPERATURE CONVERTER           ");
          System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius ");
          int choice =sc.nextInt();
      
          switch(choice)
          {
              case 1:
              System.out.println("Enter the temperature in Celsius:");
              double cel=sc.nextDouble();
              double temp1=(cel*9/5);
              double result=temp1+32;
              System.out.println("Temperature in Celsius="+cel+",in Fahrenheit="+result);
              break;
      
              case 2:
              System.out.println("Enter the temperature in Fahrenheit:");
              double far=sc.nextDouble();
              double temp2=(far-32)*5/9;
              System.out.println("Temperature  in Fahrenheit ="+far+",in Celsius="+temp2);
              break;
      
              default:
             System.out.println("Invalid input");
      
      
          }
          sc.close();
        }  
      }
      


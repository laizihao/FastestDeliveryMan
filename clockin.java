/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class clockin {
    
    public static void main(String[] args) { 
       scan();
}
    public static void scan(){
        
    Scanner input = new Scanner (System.in);
        System.out.println("ID: ");
        String wID = input.nextLine();
        if(wID.equals("DM1"))
        {
           status(wID);
        }
        else if (wID.equals("DM2"))
            status(wID);
        else
        System.out.println("Card is Invalid.");
    }
    public static void status(String wID){

        Calendar calendar = new GregorianCalendar();  
        int hour = calendar.get( Calendar.HOUR );   
        int minute = calendar.get( Calendar.MINUTE );   
        int second = calendar.get(Calendar.SECOND);

    status DM1 = new status ("Boss How", "DM1");
    status DM2 = new status ("Bosco Chu", "DM2");
    
    ArrayList<status> obj = new ArrayList<status>();
      obj.add(DM1);
      obj.add(DM2);
           
    for(int i = 0; i < obj.size(); i++)
     {
//         if(obj.get(i).id.equals(wID)&&hour>=10)
//         {
//         System.out.println(obj.get(i).id + " " + obj.get(i).name + " " + hour + ":" + minute + ":" + second );
//         System.out.println( "Status : Late" );   
//           
//        }else if(obj.get(i).id.equals(wID)&&hour<10){
//         System.out.println(obj.get(i).id + " " + obj.get(i).name + " " + hour + ":" + minute + ":" + second );
//         System.out.println( "Status : Punctual" ); 
//        }
        if(obj.get(i).id.equals(wID)&&hour==0)
         {
         
         System.out.println("System check : Card has been clock in?(y/n)");
            Scanner input2 = new Scanner(System.in);
            char wCon = input2.next().charAt(0);
            if (wCon == 'y') {
                System.out.println(obj.get(i).id + " " + obj.get(i).name + " " + hour + ":" + minute + ":" + second );

            } else if (wCon == 'n') {
                System.exit(0);
            } 
           
        }else if(obj.get(i).id.equals(wID)&&hour>=10){
         System.out.println(obj.get(i).id + " " + obj.get(i).name + " " + hour + ":" + minute + ":" + second );
         System.out.println( "Status : Late" ); 
        }
         }
                  
     }
}

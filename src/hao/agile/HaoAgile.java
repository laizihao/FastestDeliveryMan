/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hao.agile;

import java.util.Scanner;
/**
 *
 * @author ZiHao
 */
public class HaoAgile {

    
     public static void CusDetail(User[] user){
      int count =0;
     
     do{
     
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Customer phone number: ");
        
        String phoneNum = input.nextLine();
        
        for (int i=0; i<user.length; i++)
        {
           if(user[i].phone.equals(phoneNum))
           {
               count =1;
               System.out.println(user[i].name);
               System.out.println(user[i].address);
               System.out.println(user[i].phone);
               
           }
           
        }
        if (phoneNum.equals(""))
           {
              System.out.println("Please input customer phone number.");
              count=1;
                     
           }
        else if(count==0)
       {
           System.out.println("Wrong Number");
       }
       else if (count==1)
       {
           count=0;
       }
       else
       {
           count=2;
       }
     }while(count==0 || count ==1);
    }
    
    public static void main(String[] args) {
      User[] user = new User[4];
      user[0] = new User("Jason", "016123456", "10,Jalan Long.");
      user[1] = new User("Jack", "016456789", "32,Jalan Short");
      user[2] = new User("Hollow", "016789123456", "Highland");
      user[3] = new User("WeeHaa", "016123789", "Address");
      CusDetail(user);
    }
    
}

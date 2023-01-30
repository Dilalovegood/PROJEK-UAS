
package projek_uas;

import java.util.Scanner;

public class HalamanLogin {
   public static void Login(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Id Pustakawan : ");
        String id_pustakawan = sc.nextLine();
        
        System.out.print("Password : ");
        String pw = sc.nextLine();
        System.out.println();
        
        try{
            if(pw.equals(DatabaseManipulation.getPassword(id_pustakawan))){
                DaftarMenu.menuForm();
            }
            else{
                System.out.println("Id Pustakawan Atau Password Salah");
                System.out.println("");
                Login();
            }
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    } 
}

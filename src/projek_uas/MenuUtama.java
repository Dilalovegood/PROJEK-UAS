package projek_uas;

import java.util.Scanner;
import projek_uas.DaftarPustakawan;
import projek_uas.HalamanLogin;


public class MenuUtama {
    public static void main(String[] args) {
        try{
            menuForm();
        }
        catch(Exception e){
            System.out.println("Ada Sebuah Kesalahan");
            System.out.println("Error Message : " +e.getMessage());
            e.printStackTrace();
        }
    }
    
    static void menuForm() throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             MENU UTAMA             ");
        System.out.println("=====================================");
        System.out.println("1. Login sebagai Pustakawan");
        System.out.println("2. Daftar sebagai Pustakawan");
        System.out.println("3. Logout");
        System.out.println();
            
        System.out.print("Pilihan [1/2/3] = ");
        int pilih = sc.nextInt();
            
        if(pilih == 1){
            HalamanLogin.Login();
        }
        else if(pilih == 2){
            DaftarPustakawan.Pustakawan();
        }
        else if(pilih == 3){
            System.exit(0);
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
        }
    }
}
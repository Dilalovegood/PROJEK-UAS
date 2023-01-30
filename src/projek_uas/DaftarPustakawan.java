
package projek_uas;

import java.util.Scanner;


public class DaftarPustakawan {
    public static void Pustakawan(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DAFTAR AKUN PUSTAKAWAN             ");
        System.out.println("=============================================");
        
        System.out.print("Masukan Id Pustakawan : ");
        String id_pustakawan = sc.nextLine();
        System.out.print("Nama Lengkap Pustakawan : ");
        String nama = sc.nextLine();
        System.out.print("Jenis Kelamin (Lelaki/Perempuan) : ");
        String jenis_kelamin = sc.nextLine();
        System.out.print("Alamat : ");
        String alamat = sc.nextLine();
        System.out.print("Password : ");
        String pw = sc.nextLine();
        
        try{
            DatabaseManipulation.insertAkun(id_pustakawan, nama, jenis_kelamin, alamat, pw);
            System.out.println("Please Remember Your ID Librarian");
            System.out.println("ID Pustakawan anda " + id_pustakawan);
            HalamanLogin.Login();
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    }
}


package projek_uas;

import java.util.Scanner;


public class InputDataAnggota {
    public static void inputData(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             INPUT DATA ANGGOTA             ");
        System.out.println("==============================================");
        
        System.out.print("ID Anggota : ");
        String id_anggota = sc.nextLine();
        System.out.print("Nama Anggota : ");
        String nama_anggota = sc.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        String jenis_kelamin = sc.nextLine();
        System.out.print("Alamat : ");
        String alamat = sc.nextLine();
        System.out.print("Id Pustakawan : ");
        String id_pustakawan = sc.nextLine();
        
        try{
            DatabaseManipulation.DataAnggota(id_anggota, nama_anggota, jenis_kelamin, alamat, id_pustakawan);
            DaftarMenu.menuForm();
        }
        
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    }
}


package projek_uas;

import java.util.Scanner;


public class InputDataBuku {
    public static void InputData(){
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("             INPUT DATA BUKU             ");
        System.out.println("==========================================");
        
        System.out.print("Kode Buku : ");
        String kode_buku = sc.nextLine();
        System.out.print("Judul buku : ");
        String judul_buku = sc.nextLine();
        System.out.print("Pengarang : ");
        String pengarang = sc.nextLine();
        System.out.print("Kategori Buku : ");
        String kategori = sc.nextLine();
        System.out.print("Penerbit : ");
        String penerbit = sc.nextLine();
        System.out.print("Tahun Terbit : ");
        String tahun_terbit = sc.nextLine();
        System.out.print("Stok Buku : ");
        int stok_buku= sc.nextInt();
        sc.nextLine();
        
        
        try{
            DatabaseManipulation.DataBuku(kode_buku, judul_buku, pengarang, kategori, penerbit, tahun_terbit, stok_buku);
            DaftarMenu.menuForm();
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    }
}

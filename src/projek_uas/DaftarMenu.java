
package projek_uas;

import java.util.Scanner;

public class DaftarMenu {
    static void menuForm(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DAFTAR MENU UTAMA             ");
        System.out.println("===========================================");
        System.out.println("1. Data Anggota");
        System.out.println("2. Data Buku");
        System.out.println("3. Peminjaman Buku");
        System.out.println("4. Keluar");
        System.out.println();
            
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = sc.nextInt();
        System.out.println();
            
        if(pilih == 1){
            menuAnggota();
        }
        else if(pilih == 2){
            menuBuku();
        }
        else if(pilih == 3){
            menuPeminjaman();
        }
        else if(pilih == 4){
            System.exit(0);
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
        }
        
        try{
            menuForm();
        }
        catch(Exception e){
            System.out.println("Ada Sebuah Kesalahan");
            System.out.println("Error Message : " +e.getMessage());
            e.printStackTrace();
        }        
    }
    
        public static void menuAnggota(){
            System.out.println("             MANIPULASI DATA ANGGOTA             ");
            System.out.println("=================================================");
            System.out.println("1. Input Anggota Baru");
            System.out.println("2. Update Anggota");
            System.out.println("3. Delete Anggota");
            System.out.println("4. Lihat Anggota");
            System.out.println("5. Keluar"); 
            System.out.println();
            
            System.out.print("Pilihan [1/2/3/4/5] = ");
            Scanner sc = new Scanner(System.in);
            int pilih = sc.nextInt();
            System.out.println();
            
            if(pilih == 1){
                InputDataAnggota.inputData();
            }
            else if(pilih == 2){
                UpdateData.updateAnggota();
            }
            else if(pilih == 3){
                DeleteData.deleteAnggota();
            }
            else if(pilih == 4){
                ShowData.showDataAnggota();
            }
            else if(pilih == 5){
                menuForm();
            }
            else{
                System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
            }  
            
        } 
        
        public static void menuBuku(){
            System.out.println("             MANIPULASI DATA BUKU             ");
            System.out.println("===============================================");
            System.out.println("1. Input Anggota Buku");
            System.out.println("2. Update Buku");
            System.out.println("3. Delete Buku");
            System.out.println("4. Lihat Buku");
            System.out.println("5. Keluar");
            System.out.println();
            
            System.out.print("Pilihan [1/2/3/4/5] = ");
            Scanner sc = new Scanner(System.in);
            int pilih = sc.nextInt();
            System.out.println();
            
            if(pilih == 1){
                InputDataBuku.InputData();
            }
            else if(pilih == 2){
                UpdateData.updateBuku();
            }
            else if(pilih == 3){
                DeleteData.deleteBuku();
            }
            else if(pilih == 4){
                ShowData.showDataBuku();
            }
            else if(pilih == 5){
                menuForm();
            }
            else{
                System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
            }            
        }
        
        public static void menuPeminjaman(){
            System.out.println("             MENU PEMINJAMAN             ");
            System.out.println("==========================================");
            System.out.println("1. Input Peminjaman Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Keluar");
            System.out.println();
            
            System.out.print("Pilihan [1/2/3] = ");
            Scanner sc = new Scanner(System.in);
            int pilih = sc.nextInt();
            
            if(pilih == 1){
                InputDataPeminjaman.peminjaman();
            }
            else if(pilih == 2){
                ShowData.showDataPeminjaman();
            }
            else if(pilih == 3){
                menuForm();
            }
            else{
                System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
            }            
        }
}

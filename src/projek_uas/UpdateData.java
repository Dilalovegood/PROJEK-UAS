
package projek_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class UpdateData {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/perpustakaan";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    public static void updateAnggota(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             UPDATE DATA ANGGOTA             ");
        System.out.println("===============================================");
        
        System.out.print("masukan id yang ingin di update \t\t: ");
        String id_anggota = sc.nextLine();
        System.out.print("Nama Anggota \t\t: ");
        String nama_anggota = sc.nextLine();
        System.out.print("Jenis Kelamin \t\t: ");
        String jenis_kelamin = sc.nextLine();
        System.out.print("Alamat \t\t: ");
        String alamat = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update tabel_anggota set nama_anggota=?, jenis_kelamin=?, alamat=? WHERE id_anggota=?";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, nama_anggota);
            ps.setString(2, jenis_kelamin);
            ps.setString(3, alamat);
            ps.setString(4, id_anggota);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
                System.out.println();
                DaftarMenu.menuAnggota();
            }
            else{
                System.out.println("Proses Update Gagal");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static void updateBuku(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             UPDATE DATA BUKU             ");
        System.out.println("===============================================");
        
        System.out.print("masukan kode buku yang ingin di update \t\t: ");
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
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update tabel_buku set judul_buku=?, pengarang=?, kategori=?, penerbit=?, tahun_terbit=?, stok_buku=? WHERE kode_buku=?";
            
            ps = con.prepareStatement(query);
            
        
            ps.setString(1, judul_buku);
            ps.setString(2, pengarang);
            ps.setString(3, kategori);
            ps.setString(4, penerbit);
            ps.setString(5, tahun_terbit);
            ps.setInt(6, stok_buku);
            ps.setString(7, kode_buku);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
                System.out.println();
                DaftarMenu.menuBuku();
            }
            else{
                System.out.println("Proses Update Gagal");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

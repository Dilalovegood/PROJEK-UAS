
package projek_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteData {
   static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/perpustakaan";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static ResultSet state;
    static PreparedStatement ps;
    
    public static void deleteAnggota(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DELETE DATA ANGGOTA             ");
        System.out.println("===============================================");
        
        System.out.print("ID Anggota : ");
        String id_anggota = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
            String query = "delete FROM tabel_anggota WHERE id_anggota=?";
            ps = con.prepareStatement(query);
            ps.setString(1, id_anggota);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Proses Delete Anggota Berhasil");
            }
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    } 
    
    public static void deleteBuku(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DELETE DATA BUKU             ");
        System.out.println("===============================================");
        
        System.out.print("Kode Buku : ");
        String kode_buku = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
            String query = "delete FROM tabel_buku WHERE kode_buku=?";
            ps = con.prepareStatement(query);
            ps.setString(1, kode_buku);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Proses Delete Buku Berhasil");
            }
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
}

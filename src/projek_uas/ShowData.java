
package projek_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowData {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/perpustakaan";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    static Statement state;
    
    public static void showDataAnggota(){
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM tabel_anggota";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID Anggota      : " + rs.getString("id_anggota"));
                System.out.println("Nama Anggota    : " + rs.getString("nama_anggota"));
                System.out.println("Jenis Kelamin   : " + rs.getString("jenis_kelamin"));
                System.out.println("Alamat          : " + rs.getString("alamat"));
                System.out.println("-------------------------------------------------------");
            } 
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public static void showDataBuku(){
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM tabel_buku";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next()){
                System.out.println("Kode Buku\t: " + rs.getString("kode_buku"));
                System.out.println("Judul buku\t: " + rs.getString("judul_buku"));
                System.out.println("Pengarang : " + rs.getString("pengarang"));
                System.out.println("Kategori Buku : " + rs.getString("kategori"));
                System.out.println("Penerbit : " + rs.getString("penerbit"));
                System.out.println("Tahun Terbit : " + rs.getString("tahun_terbit"));
                System.out.println("Stok Buku : " + rs.getInt("stok_buku"));
                System.out.println("-------------------------------------------------------");
            } 
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public static void showDataPeminjaman(){
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM peminjaman_buku";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID Peminjaman\t: " + rs.getString("id_peminjaman"));
                System.out.println("Nama Anggota\t: " + rs.getString("id_anggota"));
                System.out.println("Jenis Kelamin\t: " + rs.getString("kode_buku"));
                System.out.println("-------------------------------------------------------");
            } 
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }
}

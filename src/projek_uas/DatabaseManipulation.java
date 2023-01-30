
package projek_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseManipulation {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/perpustakaan";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    static Statement state;
    
    public static String getPassword(String id_pustakawan) throws Exception{
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);
        
        String query = "SELECT pw FROM pustakawan WHERE id_pustakawan = (?)";
        ps = con.prepareStatement(query);
        ps.setString(1, id_pustakawan);
        rs = ps.executeQuery();
        
        if(!rs.next()){
            return null;
        }
        else{
            return rs.getString(1).toString();
        }
    }
    
    public static void insertAkun(String id_pustakawan, String nama, String jenis_kelamin, String alamat, String pw) throws Exception{
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);
        
        String query = "INSERT INTO pustakawan VALUES (?,?,?,?,?)";
        ps = con.prepareStatement(query);
        
        ps.setString(1, id_pustakawan);
        ps.setString(2, nama);
        ps.setString(3, jenis_kelamin);
        ps.setString(4, alamat);
        ps.setString(5, pw);
        
        if(ps.executeUpdate() > 0){
            System.out.println();
            System.out.println("Akun berhasil didaftarkan");
        }
        else{
            System.out.println("Akun gagal didaftarkan");
        }
    }
    
    public static void DataAnggota(String id_anggota, String nama_anggota, String jenis_kelamin, String alamat, String id_pustakawan) throws Exception{
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);
        
        String query = "INSERT INTO tabel_anggota VALUES (?,?,?,?,?)";
        ps = con.prepareStatement(query);
        
        ps.setString(1, id_anggota);
        ps.setString(2, nama_anggota);
        ps.setString(3, jenis_kelamin);
        ps.setString(4, alamat);
        ps.setString(5, id_pustakawan);
        
        if(ps.executeUpdate() > 0){            
            System.out.println();
            System.out.println("Data Anggota Berhasil Diinput");
            System.out.println();
            DaftarMenu.menuAnggota();
        }
        else{
            System.out.println("Data Gagal Diinput");
        }
    }
    
    public static void DataBuku(String kode_buku, String judul_buku, String pengarang, String kategori, String penerbit, String tahun_terbit, int stok_buku) throws Exception{
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);
        
        String query = "INSERT INTO tabel_buku VALUES (?,?,?,?,?,?,?)";
        ps = con.prepareStatement(query);
        
        ps.setString(1, kode_buku);
        ps.setString(2, judul_buku);
        ps.setString(3, pengarang);
        ps.setString(4, kategori);
        ps.setString(5, penerbit);
        ps.setString(6, tahun_terbit);
        ps.setInt(7, stok_buku);
      
        
        if(ps.executeUpdate() > 0){
            System.out.println();
            System.out.println("Data Berhasil Diinput");
            System.out.println();
            DaftarMenu.menuBuku();
        }
        else{
            System.out.println("Data Gagal Diinput");
        }
    }
}

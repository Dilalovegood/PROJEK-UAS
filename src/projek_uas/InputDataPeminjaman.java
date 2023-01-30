
package projek_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class InputDataPeminjaman {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/perpustakaan";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    public static void peminjaman(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             INPUT DATA PEMINJAMAN BUKU             ");
        System.out.println("===============================================");
        
        System.out.print("ID Peminjaman : ");
        String id_peminjaman = sc.nextLine();
        System.out.print("ID Anggota  : ");
        String id_anggota = sc.nextLine();
        System.out.print("Kode Buku : ");
        String kode_buku = sc.nextLine();
        System.out.print("Jumlah Buku : ");
        int jumlah_buku = sc.nextInt();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO peminjaman_buku (id_peminjaman, id_anggota,kode_buku,jumlah_buku,tgl_pengembalian) VALUES (?,?,?,?,date_add(now(),interval 7 day))";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, id_peminjaman);
            ps.setString(2, id_anggota);
            ps.setString(3, kode_buku);
            ps.setInt(4, jumlah_buku);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Peminjaman Buku Berhasil!");
                DaftarMenu.menuForm();            }
            else{
                System.out.println("Proses Update Gagal");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

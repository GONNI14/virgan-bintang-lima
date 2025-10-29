package kasir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        try {
            // kalau null atau sudah ditutup → buat koneksi baru
            if (conn == null || conn.isClosed()) {
                String url = "jdbc:postgresql://localhost:5432/restoran"; 
                String user = "postgres";
                String password = "1234";

                conn = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Koneksi PostgreSQL berhasil!");
            }
        } catch (SQLException e) {
            System.err.println("❌ Koneksi gagal: " + e.getMessage());
            throw e;
        }
        return conn;
    }
}
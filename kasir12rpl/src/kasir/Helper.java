/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasir;

/**
 *
 * @author user
 */
public class Helper {
    private static String username;
    private static String namaPegawai;
    private static String role; // tambahkan ini

    public static void setSession(String username, String namaPegawai, String role) {
        Helper.username = username;
        Helper.namaPegawai = namaPegawai;
        Helper.role = role; // set role
    }

    public static String getUsername() {
        return username;
    }

    public static String getNamaPegawai() {
        return namaPegawai;
    }

    public static String getRole() {
        return role; // ambil role
    }

    public static void clearSession() {
        username = null;
        namaPegawai = null;
        role = null; // clear role juga
    }
}

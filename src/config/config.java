/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author zerefweismann
 * instagram -> zeref.weismann
 * facebook -> Ammar Annajih Pasifiky
 * Telp/WA -> 085713444859
 * EMail -> ammar.fiky@gmail.com
 * Github ->tejojr/zeref.weismann
 * Website -> onodasakamichi.blogspot.com, zerefdragneel.com, zerefdragneel.890m.com, codemendoan.blogspot.com, rekayasaternaklele.ml
 */
public class config {
public static  Connection con;
    public static Connection Con(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tutor_login","root","dfjklap");
//            JOptionPane.showMessageDialog(null, "Koneksi Sukses");//Komentari baris ini setelah koneksi sukses
          
        } catch (Exception e) {
            System.out.println(e);
//            JOptionPane.showMessageDialog(null, "Koneksi gagal");//komentari baris ini setelah koneksi sukses
        }
        
        return con;
    
    
    }
    public static void main(String[] args) {
        System.out.println(Con());
    }
    
}

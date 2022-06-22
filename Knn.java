/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
class jarak1{
    public void jarak1(){
    int jk = 0, pend = 1;
    double bobot = 0.5, bobot1 = 1;
    double jarak = (jk*bobot)+(pend*bobot1);
    double bobot2 = bobot+bobot1;
    
    System.out.println("--------------------");
    System.out.println("Metode KNN");
    System.out.println("Jarak 1: ");
    System.out.println(""+jarak);
    System.out.println(""+bobot2);
    System.out.println(""+jarak/bobot2);
    }
}
class jarak2 extends jarak1{
    public void jarak1(){
    int jk = 1, pend = 0;
    double bobot = 0.5, bobot1 = 1;
    double jarak = (jk*bobot)+(pend*bobot1);
    double bobot2 = bobot+bobot1;
    
    System.out.println("--------------------");
    System.out.println("Jarak 2: ");
    System.out.println(""+jarak);
    System.out.println(""+bobot2);
    System.out.println(""+jarak/bobot2);
    }
}
class jarak3 extends jarak1{
    public void jarak1(){
    int jk = 0, pend = 0;
    double bobot = 0.5, bobot1 = 1;
    double jarak = (jk*bobot)+(pend*bobot1);
    double bobot2 = bobot+bobot1;
    
    System.out.println("--------------------");
    System.out.println("Jarak 3: ");
    System.out.println(""+jarak);
    System.out.println(""+bobot2);
    System.out.println(""+jarak/bobot2);
    }
}
public class Knn {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jarak1 s = new jarak1();
        jarak2 t = new jarak2();
        jarak3 u = new jarak3();
        
        s.jarak1();
        t.jarak1();
        u.jarak1();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author win10
 */
public class Tugas {

    static String uname;
    private void setUname (String Ambar){
        uname = Ambar ;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tugas tgs = new Tugas ();
        tgs.setUname ("Tugas");
        System.out.println(uname);
        // TODO code application logic here
    }
    
}

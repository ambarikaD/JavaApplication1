package Praktikum2;

import javax.swing.JOptionPane;

public class Studi_kelas {
    public static void main(String[] args) {
        String nama = " ", nim = " ";
        nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        nim = JOptionPane.showInputDialog("Masukkan NIM : ");
        
        String nilai1= " ",nilai2= " ", nilai3 = " ";
        nilai1 = JOptionPane.showInputDialog("Masukkan Nilai PBO : ");
        nilai2 = JOptionPane.showInputDialog("Masukkan Nilai Desweb : ");
        nilai3 = JOptionPane.showInputDialog("Masukkan Nilai Basis Data : ");
        int a = Integer.parseInt(nilai1);
        int b = Integer.parseInt(nilai2);
        int c = Integer.parseInt(nilai3);
        
        String ket = " ";
        double nilai = (a+b+c)/3;
        if (nilai >95){
            ket = "Nilai Anda Sangat Baik";
        }
        else if((nilai >=90)&&(nilai <95)){
            ket = "Nilai Anda Baik";
        }
        else if((nilai >85)&&(nilai <90)){
            ket = "Nilai Anda Cukup";
        }
        else if((nilai >70)&&(nilai <85)){
            ket = "Nilai Anda Kurang";
        }
        else if((nilai >50)&&(nilai <70)){
            ket = "Nilai Anda Sangat Kurang";
        }
        
        String hasil = ("Nama : "+nama+"\nNIM : "+nim+"\nPBO : "+nilai1+"\nDesweb : "+nilai2+"\nBasis Data : "+nilai3+"\nTotal : "+nilai+"\n"+ket);
        System.out.println(hasil);
    }
}
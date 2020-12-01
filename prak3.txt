import java.util.Scanner;

public class Switch_case {
    static int fib(int g){
        if(g == 0||g == 1){
            return g;
        }
        else{
            return(fib(g-1)+fib(g-2));
        }
    }
    public static void main(String[]dasri){
        Scanner das = new Scanner(System.in);
        int pilihan;
        String menu;
        System.out.print("Menu Pilihan : ");
        System.out.print("\n1. Perhitungan Faktorial");
        System.out.print("\n2. Perhitungan Nilai Genap");
        System.out.print("\n3. Perhitungan Nilai Ganjil");
        System.out.print("\n4. Deret Bilangan Prima");
        System.out.print("\n5. Deret Fibonacci");
        System.out.print("\n\nMasukkan Pilihan : ");
        pilihan = das.nextInt();
        
        switch(pilihan){
            case 1:
                long nilai = 1;
                System.out.print("Masukkan Nilai : ");
                int a = das.nextInt();
                
                for(int b = 1; b <= a;b++){
                    nilai = b*nilai;
                }
                System.out.println("\nFaktorial dari "+a+" adalah : "+nilai);
                System.out.println("\nDasri Ambarika(19104410032)");
                break;
            case 2:
                int c;
                System.out.print("Masukkan sebuah nilai : ");
                c = das.nextInt();
                
                if(c%2 == 0){
                    System.out.print("Bilangan "+c+" adalah Genap");
                }
                else{
                    System.out.print("Input anda salah");
                }
                System.out.println("\nDasri Ambarika(19104410032)");
                break;
            case 3:
                int d;
                System.out.print("Masukkan sebuah nilai : ");
                d = das.nextInt();
                
                if(d%1 == 0){
                    System.out.print("Bilangan "+d+" adalah Genap");
                }
                else{
                    System.out.print("Input anda salah");
                }
                System.out.println("\nDasri Ambarika(19104410032)");
                break;
            case 4:
                System.out.print("Masukkan nilai akhir bilangan prima : ");
                int angka = das.nextInt();
                for(int e=2;e<=angka;e++){
                    int mod = 1;
                    for(int f=2;f<e;f++){
                        if(e%f==0){
                            mod = 0;
                        }
                    }
                    if(mod == 1){
                        System.out.print(e+" ");
                    }
                }
                System.out.println("\nDasri Ambarika(19104410032)");
                break;
            case 5:
                int h,i = 0;
                System.out.print("\nMasukkan jumlah deret bilangan fibonacci : ");
                int g = das.nextInt();
                
                System.out.print("Hasil bilangan Fibonacci : ");
                for(h=0;h<g;h++){
                    System.out.print(fib(i)+", ");
                    i++;
                }
                System.out.println("\nDasri Ambarika(19104410032)");
                break;
            default:
                System.out.println("Input anda Salah !");
        }
        
        
    }
}

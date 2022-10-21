 import java.util.Scanner;
public class Quiz 
{

    public static void main(String[] args) {
        float gaji_pokok = 3000000;
        float total_gaji;
        float masa_kerja;
        float tunj_anak;
        float tunj_istri;
        float istri;
        float anak;     
        float ken_gaji = 0;
        
        System.out.println(" NAMA   : Rizqi Dwi Amelia ");
        System.out.println(" NPM    : 202043502545 ");
        System.out.println("===================================");
        
        System.out.print ("Masukan Masa kerja (Thn) : ");
        Scanner sc = new Scanner(System.in);
        masa_kerja = sc.nextFloat();
        System.out.print ("Masukan jumlah istri : ");
        Scanner sc1 = new Scanner(System.in);
        istri = sc1.nextFloat();
        System.out.print ("Masukan jumlah anak : ");
        Scanner sc2 = new Scanner(System.in);
        anak = sc2.nextFloat();
        
        tunj_istri = (float)(gaji_pokok * 0.10) * istri; 
        tunj_anak = (float)(gaji_pokok * 0.20) * anak;
        
        if (masa_kerja <= 7)
        {
            gaji_pokok = (float)gaji_pokok;
        }
        else if (masa_kerja <= 14)
        {
             ken_gaji = (float)(gaji_pokok * 0.25); 
        } 
        else if (masa_kerja <= 21)
        {
            ken_gaji = (float)(gaji_pokok * 0.50);
        }
        else if (masa_kerja <= 25)
        {
            ken_gaji = (float)(gaji_pokok * 0.75); 
        }
        else if (masa_kerja <= 28)
        {
            ken_gaji = (float)(gaji_pokok * 1);
        }
        
        total_gaji = gaji_pokok + ken_gaji + tunj_istri + tunj_anak;  
        
         System.err.println ("\nGaji Pokok      : " +gaji_pokok); 
        System.err.println ("Kenaikan Gaji   : " +ken_gaji); 
        System.err.println ("Tunjangan Istri : " +tunj_istri); 
        System.err.println ("Tunjangan Anak  : " +tunj_anak);  
        System.err.println ("================================ +");  
        System.err.println ("Total gaji      : " +total_gaji);  
    }
    
}
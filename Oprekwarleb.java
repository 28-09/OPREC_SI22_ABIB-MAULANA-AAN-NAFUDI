/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oprekwarleb;
import java.util.Scanner;

/**
 *
 * @author den lana agatta
 */
public class Oprekwarleb {

    /**
     * @param args the command line arguments
     */
    private double hargaBiasa;
    private double hargaDauble;
    private double hargaSpesial;
    private boolean tambahNasi;
    
    public void sethargaBiasa(){
        this.hargaBiasa=hargaBiasa;
        System.out.println("harga menu rp 5000"+hargaBiasa);
    }
    public void sethargaDauble(){
        this.hargaDauble=hargaDauble;
        System.out.println("harga menu dauble rp 7000"+hargaDauble);
    }
    public void sethargaSpesial(){
        this.hargaSpesial=hargaSpesial;
        System.out.println("harga spesial rp 9000"+hargaSpesial);
    }
    public void tambahNasi(){
    this.tambahNasi=tambahNasi;
        System.out.println("setiap tambah porsi untuk nasi rp3000"+tambahNasi);
    }
  
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        System.out.println("welcome geprek kamal ");
        System.out.println("pilihan menu :\n");
        System.out.println("1.menu biasa :");
        System.out.println("2. menu Dauble :");
        System.out.println("3. menu");
        System.out.println("5.tambah pesanan ?");
        
        int pilhan.nextprinInt();
        
        do(pilihan){
        switch:
                case 1:
                    System.out.println("apakah anda ingin memesan "+hargaBiasa);
                    System.out.println("apakah anda ingin tambah nasi? y/n");
                    if { y ==true,
                    hargaBiasa+hargaNasi;
                    }
                    break;
                    
                case 2 ;
                    System.out.println("apakah anda ingin memesan "+hargaDauble);
                    System.out.println("apakah anda ingin tambah nasi? y/n");
                    if { y ==true,
                    hargaDauble+hargaNasi;
                    }
                    break;
    }
       while(pilihan 0==!)
    }
    
}

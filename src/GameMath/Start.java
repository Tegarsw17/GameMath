/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMath;

import java.util.Scanner;

/**
 *
 * @author TEGAR SATRIYA WIGUNA
 */
public class Start {
    
    String name;
    int select;
    
    // Main Interface , Input name
    void start(){
        System.out.println("*******************");
        System.out.println("Game Math");
        System.out.println("*******************");
        System.out.println("Masukan Nama Anda: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    
    // Interface for selecting menu
    void menu(){
        
        Addition a = new Addition(name);
        Subtraction s = new Subtraction(name);
        
        while(true){
            System.out.println("*******************");
            System.out.println("Game Math");
            System.out.println("*******************");
            System.out.println("Menu: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.println("Pilih no menu: ");
            Scanner sc = new Scanner(System.in);
            select = sc.nextInt();

            //choose the menu
            if(select==1){
                a.addition();
            }
            else if(select==2){
                s.subtraction();
            }
            else if(select==3){
                break;
            }
        }
    }
}

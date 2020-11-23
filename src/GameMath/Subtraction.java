/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMath;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author TEGAR SATRIYA WIGUNA
 */
public class Subtraction {
    int numbers1;
    int numbers2;
    int result;
    int answer;
    int lives;
    int score;
    int level;
    String name;
    
    // pick name from Start class
    public Subtraction(String name){
        this.name = name;
    }
    
    // process addition
    void subtraction(){
        // First status for the game
        lives = 3;
        score = 0;
        level = 1;
        
        System.out.println("*******************");
        System.out.println("Game Math - Pengurangan");
        System.out.println("*******************");
        Scanner sc = new Scanner(System.in);
        
        // determine if the answer is true or false
        while(true){
            // game in level 1 with max score is 100
            if (level==1){
                do{
                numbers1 = ThreadLocalRandom.current().nextInt(1, 10);
                numbers2 = ThreadLocalRandom.current().nextInt(1, 10);
                }while(numbers1<numbers2);
                result = numbers1 - numbers2;
                System.out.println("Berapakah hasil dari " + numbers1 + " - " + numbers2 + "?");
                System.out.println("Jawab: ");
                answer = sc.nextInt();
                if(result == answer){
                    score += 50;
                    System.out.println("Selamat " + name + " Anda benar Skor: " + score + " Lives: " + lives + " Level: " + level);
                    
                }else{
                    score -= 2;
                    lives -=1;
                    System.out.println("Wah, salah deh Skor: " + score + " Lives: " + lives + " Level: " + level);
                    
                }
                
                if (score >= 100){
                    level += 1;
                }
                
                if (lives == 0){
                    System.out.println("Hai " + name + ", Jangan menyerah ya untuk mencoba lagi.");
                    break;
                }
            }
            // game in level 2 with max score is 200
            else if (level == 2){
                numbers1 = ThreadLocalRandom.current().nextInt(-10, -1);
                numbers2 = ThreadLocalRandom.current().nextInt(-10, -1);
                result = numbers1 - numbers2;
                System.out.println("Berapakah hasil dari (" + numbers1 + ") - (" + numbers2 + ") ?");
                System.out.println("Jawab: ");
                answer = sc.nextInt();
                
                if(result == answer){
                    score += 50;
                    System.out.println("Selamat " + name + " Anda benar Skor: " + score + " Lives: " + lives + " Level: " + level);
                    
                }else{
                    score -= 2;
                    lives -=1;
                    System.out.println("Wah, salah deh Skor: " + score + " Lives: " + lives + " Level: " + level);
                    
                }
                
                if (score >= 200){
                    level += 1;
                }
                
                if (lives == 0){
                    System.out.println("Hai " + name + ", Jangan menyerah ya untuk mencoba lagi.");
                    break;
                }
            }
            // game in level 3 with max score is 300, the end of level
            else{
                numbers1 = ThreadLocalRandom.current().nextInt(-10, 10);
                numbers2 = ThreadLocalRandom.current().nextInt(-10, 10);
                result = numbers1 - numbers2;
                if (numbers1 < 0 && numbers2 < 0){
                    System.out.println("Berapakah hasil dari (" + numbers1 + ") - (" + numbers2 + ") ?");
                } else if (numbers1 < 0 && numbers2 > 0){
                    System.out.println("Berapakah hasil dari (" + numbers1 + ") - " + numbers2 + " ?");
                } else if (numbers1 > 0 && numbers2 < 0){
                    System.out.println("Berapakah hasil dari " + numbers1 + " - (" + numbers2 + " ) ?");
                } else {
                    System.out.println("Berapakah hasil dari " + numbers1 + " - " + numbers2 + " ?");
                }
                System.out.println("Jawab= ");
                answer = sc.nextInt();
                
                if(result == answer){
                    score += 50;
                    System.out.println("Selamat " + name + " Anda benar Skor: " + score + " Lives: " + lives + " Level: " + level);
                    
                }else{
                    score -= 2;
                    lives -=1;
                    System.out.println("Wah, salah deh Skor: " + score + " Lives: " + lives + " Level: " + level);
                    
                }
                
                if (score >= 300){
                    System.out.println("Selamat " + name + ", Anda telah menyelesaikan soal pengurangan dengan baik. Silakan dicoba soal penjumlahan ya");
                    break;
                }
                
                if (lives == 0){
                    System.out.println("Hai " + name + ", Jangan menyerah ya untuk mencoba lagi.");
                    break;
                }
            }
        }
    }
        
}

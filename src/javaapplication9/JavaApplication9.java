
package javaapplication9;
import java.util.Scanner;

public class JavaApplication9 {

    
        public static void main(String[] args) {
        int suhu;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan suhu = ");
        suhu = scan.nextInt();
        
        if (suhu > 60){
            System.out.println("panas");
        } else if (suhu > 30) {
            System.out.println("normal");
        } else {
            System.out.println("suhu dingin");
        }
                       
    }
    
}

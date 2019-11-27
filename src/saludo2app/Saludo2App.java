package saludo2app;
import java.util.Scanner;

public class Saludo2App {

        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
            System.out.println("Dame una hora (0 a 24)");
            byte hora = teclado.nextByte();
            
            if (hora >= 6 && hora < 13){
            System.out.println("Buenos días");
            
        }else if (hora >= 13 && hora < 20){
            System.out.println("Buenas tardes");
           
        }else if ((hora >= 20 && hora <= 24) || (hora >= 0 && hora < 6)){
            System.out.println("Buenas noches");
        }else{
            System.out.println("No es una hora válida");
        }
          
            
       
        }
    
}

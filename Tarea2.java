
package tarea.pkg2;
import java.util.Scanner;
public class Tarea2 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int j=4;
        int[] numeros;
        numeros = new int[j];
        String pro,pre,op;
        int res=0,num1,num2;
       System.out.println("Ingrese el problema: ");
       String problema= sc.nextLine();
       String[] splitted = problema.split(" ");
       
        pro=splitted[0];
        op=splitted[1];
        pre=splitted[2];
        num1=Integer.valueOf(pro);
        num2=Integer.valueOf(pre);
        switch (op){
            case "+":
                res=num1+num2;
                break;
            case "-":
                res=num1-num2;
                break;
            case "*":
                res=num1*num2;
                break;
            case "/":
                res=num1/num2;
                break;
        }
               
    
        System.out.println("El resultado es: "+res);
        }
    }



import java.util.Scanner;
public class Calculo2 {
	public static void main(String[] args) {

double a,b,c,d,res;
		
		
a=2;
b=3;
c=5;
d=9;

//Processamento
if (a > 2 && b< 7) {
        
        res = (a+2)*(b-2);
        
}else {
 res  =(a+b)/d*(c+d);
}

System.out.printf("O resultado é: %.2f", res);
}
}
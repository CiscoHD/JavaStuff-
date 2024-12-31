import java.util.Scanner;

public class Actividad3
{
    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = lector.nextInt();
        int a = 0, b = 1, c = 0, limite = 0;

        /* Comprobar si el número del usuario se encuentra en la secuencia de Fibonacci y/o
           el número es par */

        if(num > 1)
        {
            while ((a + b) < num)
            {
                c = a + b;
                a = b;
                b = c;
            }
            if(num == c)
            {
                if(num % 2 == 0)
                    System.out.println(num + " es un número de Fibonacci y es un número par");
                else
                    System.out.println(num + " es un número de Fibonacci");
            }
            if(num > c)
            {
                if(num % 2 == 0)
                    System.out.println(num + " no es número de Fibonacci y es un número par");
                else
                    System.out.println(num + " no es un número de Fibonacci");
            }
        }
        else
            System.out.println("El número introducido es inválido");

        a = 0;
        b = 1;
        c = 0;
        while((a + b) < num)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
            if((a + b) < num)
                System.out.print(",");
        }
    }
}

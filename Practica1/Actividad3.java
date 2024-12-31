import java.util.Scanner;

public class Actividad3
{
    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = lector.nextInt();
        int n = 2, resul = 0;

        if(num > 1)
        {
        n = 1;
            while(resul < num)
            {
                n = n + 1;
                resul = (n - 1) + (n - 2);
                System.out.println(resul);
                System.out.println(n);
            }
        }
        else
        System.out.println("Número inválido");


    }
}

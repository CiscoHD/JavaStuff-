import java.util.Scanner;

public class Actividad1
{
    public static void main(String[] args)
    {
        //Instanciación de Scanner
        Scanner lector = new Scanner(System.in);

        //Ingreso de datos
        System.out.print("Ingrese el primer número real ");
        float num1 = lector.nextFloat();
        System.out.print("Ingrese el segundo número real ");
        float num2 = lector.nextFloat();

        float sum = num1 + num2; //Resultado de la operación
        System.out.println("===================================="); //Separador visual
        //Impresión en pantalla
        if (sum > 0)
        {
            System.out.println(num1 + " + " + num2 + " = " + sum + " (es positivo)");
        }
        else
        {
            System.out.println(num1 + " + " + num2 + " = " + sum + " (es negativo)");
        }

    }
}

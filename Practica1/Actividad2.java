import java.util.Scanner;

public class Actividad2
{
    public static void main (String[] args)
    {
        //Declaración de variables
        int[] califs = new int[33];
        int numMaterias = 0;
        float prom = 0, sum = 0;
        Scanner lector = new Scanner(System.in); //Instanciación de Scanner

        //Entrada de datos del usuario
        System.out.print("Ingrese el grado del alumno (1, 2 o 3): ");
        int grado = lector.nextInt();

        if (grado >= 1 && grado <= 3) //Se comprueba si la opción es válida
        {
            if (grado == 1)
            {
                /*
                   -> Se asigna el número de materia al tipo de grado que se eligió
                   -> El ciclo for va desde cero hasta numMaterias
                   -> Se asigna a índice el valor del iterador i
                */
                numMaterias = 12;
                System.out.println("Grado 1");
                System.out.println("--------------------");
                for(int i = 0; i < numMaterias; i++)
                {
                    int indice = i + 1;
                    System.out.print("Materia " + indice + " :");
                    int valorCali = lector.nextInt();
                    califs[i] = valorCali;
                    sum = sum + valorCali;
                }

            }
            else if (grado == 2)
            {
                numMaterias = 24;
                System.out.println("Grado 2");
                System.out.println("--------------------");
                for(int i = 0; i < numMaterias; i++)
                {
                    int indice = i + 1;
                    System.out.print("Materia " + indice + " :");
                    int valorCali = lector.nextInt();
                    califs[i] = valorCali;
                    sum = sum + valorCali;
                }
            }
            else if (grado == 3)
            {
                numMaterias = 33;
                System.out.println("Grado 3");
                System.out.println("--------------------");
                for(int i = 0; i < numMaterias; i++)
                {
                    int indice = i + 1;
                    System.out.print("Materia " + indice + " :");
                    int valorCali = lector.nextInt();
                    califs[i] = valorCali;
                    sum = sum + valorCali;
                }
            }
            prom = sum / numMaterias;
            System.out.println("=================================");
            System.out.println(numMaterias + " calificaciones");
            System.out.println("Promedio: " + prom);
        }
        else
            System.out.println("El grado introducido es inválido");
    }
}

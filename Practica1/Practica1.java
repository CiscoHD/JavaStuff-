import java.util.Scanner;

public class Practica1
{
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        do 
        {
            //Menu principal
            System.out.println("------Menu principal------");
            System.out.println("1. Suma de dos números");
            System.out.println("2. Promedio de calificaciones");
            System.out.println("3. Sucesión de Fibonacci");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = lector.nextInt();

            if(opcion == 1)
            {
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
            else if(opcion == 2)
            {
                //Declaración de variables
                int[] califs = new int[33];
                int numMaterias = 0;
                float prom = 0, sum = 0;

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
            else if(opcion == 3)
            {
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
                    else 
                        System.out.println(" ");
                }
            }
        } while(opcion < 4);
        System.out.println("Programa finalizado");
    }
}
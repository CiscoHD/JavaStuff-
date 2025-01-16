public class Fechas
{
    public static void main(String[] args)
    {
        /*
            Declaración de arreglo "meses" para conversion de formatos: 
            dd/mm/aa -> dd de "mm" de "aaaa"
        */ 
        String[] meses = {"enero", "febrero", "marzo",
                          "abril", "mayo", "junio",
                          "julio", "agosto", "septiembre",
                          "octubre", "noviembre", "diciembre"};
        /*
            Declaración de arreglo "diaMac" para comprobacion de 
            días maximos en cada mes
        */
        int[] diaMax = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dia = 0, mes = 0, año = 0; 
        String añoStr;

        for(int i = 0; i < args.length; i++)
        {
            // Identificación de formatos mediante el tercer caracter de la fecha
            if(args[i].charAt(2) == '/' )
            {
                // System.out.println("Formato 1, ");
                String[] formatoUno = args[i].split("/");

                System.out.print(args[i] + " -> "); //Fecha dada por el usuario 

                if (formatoUno.length == 3)
                { 
                    /*
                        Conversión de la cadenas dia/mes/año de String a Int 
                        para:
                        -> Ser usdadas como índices de los arreglos "meses" y "diaMax"
                        -> Comprobar la existenia de la fecha   
                    */
                    dia = Integer.parseInt(formatoUno[0]);
                    mes = Integer.parseInt(formatoUno[1]);
                    año = Integer.parseInt(formatoUno[2]);

                    if(mes > 0 && mes <= 12 && año <= 99) //Comprobación del mes  
                    {   
                        if(dia > 0 && dia <= diaMax[mes - 1]) // Comprobación del dia 
                        {
                            String fechaFormatoDos = new String(dia + " de " + meses[mes - 1] + " de 20" + año);
                            System.out.println(fechaFormatoDos);
                        }
                    }
                    else 
                        System.out.println("Formato no reconocido");
                }
                else 
                        System.out.println("Formato no reconocido");
            }
            else if(args[i].charAt(1) == ' ' || args[i].charAt(2) == ' ')
            {
                // System.out.println("Formato 2");
                String[] formatoDos = args[i].split(" ");

                System.out.print(args[i] + " -> "); //Fecha dada por el usuario

                if (formatoDos.length == 5)
                { 
                    if(formatoDos[1].equals("de") && formatoDos[3].equals("de"))
                    {
                        dia = Integer.parseInt(formatoDos[0]);
                        año = Integer.parseInt(formatoDos[4]);
                        // Comprobación del mes dado 
                        for (int j = 0; j < meses.length; j++)
                        {
                            if (formatoDos[2].equals(meses[j]))
                                mes = j + 1;                   
                        
                        }
                        if(mes != -1)
                        {
                            if (dia > 0 && dia <= diaMax[mes]) 
                            {
                                String fechaFormatoUno;
                                if (mes < 10)
                                    fechaFormatoUno = new String(dia + "/" + "0" + mes + "/" + año);
                                else 
                                    fechaFormatoUno = new String(dia + "/" + mes + "/" + año);
                                System.out.println(fechaFormatoUno);
                            }
                            else 
                                System.out.println("Formato no reconocido");                
                        }
                    }
                    else 
                        System.out.println("Formato no reconocido");  
                }else
                    System.out.println("Formato no reconocido");
            }
            else 
                System.out.println("Formato no reconocido");    
        }
    }
}
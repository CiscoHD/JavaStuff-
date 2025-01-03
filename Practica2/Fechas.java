public class Fechas
{
    public static void main(String[] args)
    {
        String[] meses = {"enero", "febrero", "marzo",
                          "abril", "mayo", "junio",
                          "julio", "agosto", "septiembre",
                          "octubre", "noviembre", "diciembre"};

        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args[i].charAt(2));

            // Identificación de formatos mediante el tercer caracter de la fecha
            if(args[i].charAt(2) == '/')
            {
                System.out.println("Formato 1, " + args[i].indexOf("/"));
                String[] formatoUno = args[i].split("/");

                System.out.println("Extensión " + formatoUno.length);

                int dia = Integer.parseInt(formatoUno[0]);
                System.out.println("El día del argumento " + i + " " + dia);

                int mes = Integer.parseInt(formatoUno[1]);
                System.out.println("El mes del argumento " + i + " " + meses[mes]);
            }
            else if(args[i].charAt(2) == ' ')
            {
                System.out.println("Formato 2");
                String[] formatoDos = args[i].split(" ");
                System.out.println("Extensión" + formatoDos.length);
                for(int j = 0; j < formatoDos.length; j++)
                {
                    System.out.println(formatoDos[j] + ", " + j);
                }
            }
            else
            {
                System.out.println("Formato no reconocido");
            }
        }
    }
}




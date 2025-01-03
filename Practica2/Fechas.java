public class Fechas
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {

            System.out.println(args[i].charAt(2));
            
            // Identificación de formatos mediante el tercer caracter de la fecha
            if(args[i].charAt(2) == '/')
            {
                System.out.println("Formato 1, " + args[i].indexOf("/"));
                String[] formatoUno = args[i].split("/");
                System.out.println("Extensión " + formatoUno.length);
                for(int j = 0; j < formatoUno.length; j++)
                {
                    System.out.println(formatoUno[j] + ", " + j);
                }
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

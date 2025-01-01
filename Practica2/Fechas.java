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
                System.out.println("Formato 1");
            }
            else if(args[i].charAt(2) == ' ')
            {
                System.out.println("Formato 2");
            }
            else
            {
                System.out.println("Formato no reconocido");
            }
        }

    }
}

import java.io.IOException;
import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) throws IOException {
        try {
            if (args.length == 1) {
                double x = Double.parseDouble( args[0] );
                Angulo leitura = new Angulo();
                System.out.println( "\nSeno: " + leitura.fSeno( x ) +
                                    "\nCosseno: " + leitura.fCosseno( x ) +
                                    "\nTangente: " + leitura.fTangente( x ) +
                                    "\nCotangente: " + leitura.fCotangente( x ) );
            }
        } catch (Exception e) {}
        do {
            Scanner leitura = new Scanner( System.in );
            Angulo entrada = new Angulo();
            String a;
            try {
                System.out.println( "\nDigite uma medida em graus do angulo: " );

                a = leitura.nextLine();
                double x = Double.parseDouble( a );

                if (a == null) {
                    System.exit( 0 );
                } else

                    System.out.println( "\nSeno: " + entrada.fSeno( x ) +
                                        "\nCosseno: " + entrada.fCosseno( x ) +
                                        "\nTangente: " + entrada.fTangente( x ) +
                                        "\nCotangente: " + entrada.fCotangente( x ) );
            } catch (Exception e) {
                System.out.println( "\nFinalizando o programa..." );
                System.exit( 0 );
            }
        } while (true);
    }
}

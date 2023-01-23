import static java.lang.Math.round;

public class CalculaArea {
    public static void main(String[] args) {
        try {

            int erro = 0;

            for (int i = 0; i < args.length; i++) {
                if (( args[i].matches( "[a-z]*" ) ) || ( args[i].matches( "[A-Z]*" ) )) {
                    System.out.println( "\n" + ( i + 1 ) + " º argumento, " + args[i] + ", nao e numero" );
                    erro = erro + 1;
                }
            }
            if (erro > 0) {
                System.exit( 0 );
            }

            if (args.length < 1) {
                System.out.println( "\nNumero de argumentos insuficientes" );
                System.exit( 0 );
            }
            if (args.length > 3) {
                System.out.println( "\nNumero de argumentos excessivo" );
                System.exit( 0 );
            }
            if (args.length == 1) {
                double r = Double.parseDouble( args[0] );
                System.out.println( "\nA area do circulo e: " + calcula( (float) r ) + " unidades de area" );
            }
            if (args.length == 2) {
                double a = Double.parseDouble( args[0] );
                double b = Double.parseDouble( args[1] );
                System.out.println( "\nA area do retangulo e: " + calcula( (float) b, (float) a ) + " unidades de area" );
            }
            if (args.length == 3) {
                double l1 = Double.parseDouble( args[0] );
                double l2 = Double.parseDouble( args[1] );
                double l3 = Double.parseDouble( args[2] );
                System.out.println( "\nA area do triangulo e: " + calcula( (float) l1, (float) l2, (float) l3 ) + " unidades de area" );
                if (l1 == l2 && l2 == l3) {
                    System.out.println( "\nO triangulo e Equilatero" );
                } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                    System.out.println( "\nO triangulo e Isosceles" );
                } else if (l1 != l2 && l1 != l3 && l2 != l3) {
                    System.out.println( "\nO triangulo e Escaleno" );
                }
            }
        } catch (Exception e) {
            System.out.println( "Algo deu errado." );
        }
    }

    private static double calcula(float r) {
        r = r;
        return round( ( Math.PI * ( r * r ) ) );
    }

    private static double calcula(float b, float a) {
        a = a;
        b = b;
        return round( ( a * b ) );
    }

    private static double calcula(float l1, float l2, float l3) {
        l1 = l1;
        l2 = l2;
        l3 = l3;
        return round( ( ( l1 * l2 ) / 2 ) );
    }
}

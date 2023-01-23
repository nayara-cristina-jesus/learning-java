import java.lang.Math;

public class Angle {

    //Metodo que converte uma entrada em graus para radianos
    public static double cvtAngulo(double x) {
        return Math.toRadians( x );
    }

    //Metodo que calcula o seno
    public static double fSeno(double x) {
        return Math.round( Math.sin( cvtAngulo( x ) ) );
    }

    //Metodo que calcula o cosseno
    public static double fCosseno(double x) {
        return Math.round( Math.cos( cvtAngulo( x ) ) );
    }

    //Metodo que calcula a tangente
    public static double fTangente(double x) {
        return Math.round( Math.tan( cvtAngulo( x ) ) );
    }

    //Metodo que calcula a cotangente
    public static double fCotangente(double x) {
        return Math.round( ( 1 / ( Math.tan( cvtAngulo( x ) ) ) ) );
    }
}

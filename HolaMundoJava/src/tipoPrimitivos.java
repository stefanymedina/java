/*
 * Tipos Primitivos en Java 
 */

/**
 *
 * @author stefanymedina
 */
public class tipoPrimitivos {

    public static void main(String args[]) {
        /*
            Tipos primitivos enteros: byte, short, int, long
         */

        byte numeroByte = 120;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minmo byte " + Byte.MIN_VALUE); // -127
        System.out.println("Valor maximo byte " + Byte.MAX_VALUE); // 128

        short numeroShort = 10;
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("Valor minimo short = " + Short.MIN_VALUE);
        System.out.println("Valor maximo short = " + Short.MAX_VALUE);
        
        int numeroInt = 10;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("Valor minimo int = " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int = " + Integer.MAX_VALUE);
        
        long numerolong = 10;
        System.out.println("\nnumerolong = " + numerolong);
        System.out.println("Valor minimo long = " + Long.MIN_VALUE);
        System.out.println("Valor maximo long = " + Long.MAX_VALUE);
        
        /*
        
            Tipos primitivos de tipo flotante: float y double
        */
        
        
        float numeroFloat = 80.6F;
        System.out.println("\nnumeroFloat = " + numeroFloat);
        System.out.println("Valor minimo Float = " + Float.MIN_VALUE);
        System.out.println("Valor Maximo Float = " + Float.MAX_VALUE);
        
        double numeroDouble = 10.0;
        System.out.println("\nnumeroDouble = " + numeroDouble);
        System.out.println("Valor minimo long = " + Double.MIN_VALUE);
        System.out.println("Valor maximo long = " + Double.MIN_VALUE);
        
    }

}

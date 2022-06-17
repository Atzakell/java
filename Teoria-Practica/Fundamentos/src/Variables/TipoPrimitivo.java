package Variables;

public class TipoPrimitivo {
    public static void main(String args[]) {
        /*
         * tipos primitivos enteros
         * -byte, short, int, long
         */
        byte numeroByte = (byte) 1000;
        System.out.println("Valor del byte " + numeroByte);
        System.out.println("Valor minimo byte " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte " + Byte.MAX_VALUE);

        short numeroShort = (short) 32770;
        System.out.println("\nValor de short " + numeroShort);
        System.out.println("Valor minimo del Short " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println("\nValor del int " + numeroInt);
        System.out.println("Valor minimo del Int " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int " + Integer.MAX_VALUE);

        long numerolong = (long) 9223372036854775807L;
        System.out.println("\nValor del long " + numerolong);
        System.out.println("Valor minimo del long " + Long.MIN_VALUE);
        System.out.println("Valor maximo dle long " + Long.MAX_VALUE);

        /*
         * tipos primitivos flotantes
         * -float y double
         */

        float numerofloat = (float) 10.0;
        System.out.println("\nValor del float " + numerofloat);
        System.out.println("Valor minimo de tipo float " + Float.MIN_VALUE);
        System.out.println("Valor maximo de tipo float " + Float.MAX_VALUE);

        double numerodouble = 55124.5548;
        System.out.println("\nValor del double " + numerodouble);
        System.out.println("Valor minimo de tipo float " + Double.MIN_VALUE);
        System.out.println("Valor maximo de tipo float " + Double.MAX_VALUE);
    }
}

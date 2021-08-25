package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        /*Clases envolvente de tipo primitivo
     * int - Integer  primitiva - clase envolvente 
     * long - Long
     * float - Float
     * double - Double
     * boolean - Boolean
        char - Character
        short - Short
        
         */

        int enteroU = 10;
        //Autoboxing
        Integer enteroD = 20; // clase envpolvente del tipo int (object)
        System.out.println("entero uno:" + enteroU); // literal enetera
        System.out.println("entero dos:" + enteroD.toString()); // literal de tipo string 
        
        //Unboxing 
        int enteroD2 = enteroD;

    }

}

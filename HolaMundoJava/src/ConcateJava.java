//concatenacion en java

public class ConcateJava {

    public static void main(String args[]) {
        var usuario = "Stefany";
        var titulo = "Ingeniero";

        var total = usuario + " " + titulo;
        System.out.println("total = " + total);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);// se realiza la suma de numeros
        System.out.println(i + j + usuario); // se realiza la suma de izquierda a derecha 
        System.out.println(usuario + i + j); // como el primer valor que consigue es cadena todo lo que toma despues de este lo toma de igual forma
        // si quieremos realizar efectivamente la suma del lado derecho debos colocar parentesis asi:
        System.out.println(usuario + (i+j));
        
    }
}

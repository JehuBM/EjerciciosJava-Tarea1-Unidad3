public class App {
/*Suma de números del 1 al N */
public static long Recursividad1(int n) {
    if(n == 0 ) {
        return 0;
            
    }
    {
      return n + Recursividad1(n - 1);
      }
        
}

//Fibonacci
public static long Fibonacci(int n){
    if (n<=1){
        return n;
        
    }
    {
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

}

//Potencia
public static int Potencia(int base, int exponente) {

    if (exponente == 0) {
        return 1;
    }

    return base * Potencia(base, exponente - 1);
}

//Recorrer un String al revés... WHAT???
public static String StringVolteado(String texto){
    if (texto.length() == 0){
        return "";
    }
    return StringVolteado(texto.substring(1)) + texto.charAt(0);
}


    public static void main(String[] args) throws Exception {
     System.out.println(Potencia(3, 2));
       
    }
}

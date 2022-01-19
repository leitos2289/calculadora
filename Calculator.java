import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    private static int sumaNumero(int number){
        int val = 0;
        for(int i=1; i<= number; i++){
            if(i%3 == 0 || i%5 == 0 || i%7 == 0){
                val = val+i;
                System.out.println(i);
            }
        }
        return val;
    }

    static String cadena (String value){
        String [] lista = value.split("");
        int z = 0;
        int cont = 0;
        String aux = "";
        while (z<=lista.length-1){
            String v = lista[z];
            cont = 0;
            int i = z;
            do{
                if(v.equals(lista[i])){
                    cont ++;
                    if(i == lista.length-1){
                        aux = aux.concat(String.valueOf(cont).concat(v));
                        z=i+1;
                    }
                }else {
                    aux = aux.concat(String.valueOf(cont).concat(v));
                    z=i;
                    break;

                }
                i++;
            }while(i < lista.length);
        }

        return aux;
    }

    public static String contarCaracteres(String cadena) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        String cadenaOut = "";
        int aux=0;
        do {
            contador=0;
            char c = cadena.charAt(aux);
            posicion = cadena.indexOf(c);
            while (posicion != -1) { //mientras se encuentre el caracter
                contador++;           //se cuenta
                //se sigue buscando a partir de la posición siguiente a la encontrada
                posicion = cadena.indexOf(c, posicion + 1);
            }
            cadenaOut = cadenaOut.concat(String.valueOf(contador)).concat(String.valueOf(c));
            cadena = cadena.replace(String.valueOf(c), "");

        }while (aux < cadena.length());


        return cadenaOut;
    }

    public static void main (String [ ] args) {
        //int valor = sumaNumero(15);
        //String v = cadena("aaderttdaa");
        String valor = contarCaracteres("aedgaredadgda");
        System.out.println("Total:" + valor);
    }
}

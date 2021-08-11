public class Main {
    public static void main(String[] args) {

        Integer x = 10;
        Integer z = x;
        System.out.println("Objeto Wrapper 'X' com 'autoboxing': " + x.toString());
        System.out.println("Objeto Wrapper 'Z' por referencia': " + z.toString());
        System.out.println("Metodo com Objeto Wrapper 'Z' por autoboxing': " + MudaValor(20).toString());
        System.out.println("Metodo com Objeto Wrapper 'Z' por referencia': " + ReferenciaValor(x).toString());
    }

    public static Integer MudaValor(Integer z){
        return z;
    }

    public static Integer ReferenciaValor(Integer x){
        Integer z = x;
        return z;
    }

}


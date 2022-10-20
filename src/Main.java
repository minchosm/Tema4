public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "otoño";

        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf > 0) {
            System.out.println("El número es negativo.");
        }else {
            System.out.println("El número es el 0");
        }

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println( "El numeroWhile tiene un valor de " + numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println( "El numeroWhile tiene un valor de " + numeroWhile);
        }while (numeroWhile <3);

        for(int i = 3;numeroFor <= i; numeroFor ++ ){
            System.out.println("numeroFor e es igual a : " + numeroFor);
        }

        switch (estacion){
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("Esa estación no existe");

        }
    }


}
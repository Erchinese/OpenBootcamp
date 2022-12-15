public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 2;
        int numeroFor = 0;
        var estacion = "VERANO";

        // if

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es igual a cero");
        }

        // while

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        // doWhile

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);

        // for

        for (; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }

        // switch
        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case    "OTOÑO":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estación");

        }

    }
}

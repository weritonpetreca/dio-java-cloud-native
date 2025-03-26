public class EvenOdd {

    protected EvenOdd(int primeiroNumero, int segundoNumero, @org.jetbrains.annotations.NotNull String parImpar) {
        switch (parImpar){
            case "P":
                for (int i = primeiroNumero; i <= segundoNumero; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case "I":
                for (int i = primeiroNumero; i <= segundoNumero; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
        }
    }
}

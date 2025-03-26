public class CheckDivision {
    public CheckDivision(int primeiroNumero, int proximoNumero) {
        int errCounter = 0;
        do {
            try {
                if (errCounter >= 2) {
                    System.out.println("Muitas entradas inválidas. Tente novamente mais tarde.");
                    return;
                }
                double divisionResult = (double) proximoNumero % primeiroNumero;
                if (divisionResult == 0) {
                    System.out.println("O número " + proximoNumero + " dividido por " + primeiroNumero + " tem resto 0\nInsira um próximo número: ");
                    proximoNumero = Divisao.scanner.nextInt();
                    checkNumber(primeiroNumero, proximoNumero);
                }
            } catch (ArithmeticException e) {
                System.out.println("O número digitado deve ser maior que " + primeiroNumero + ".\nInsira um próximo número: ");
                proximoNumero = Divisao.scanner.nextInt();
                errCounter++;
                //checkNumber(primeiroNumero, proximoNumero);
            } catch (Exception e) {
                System.out.println("Entrada inválida! Insira um número válido.");
                Divisao.scanner.next(); // Limpa a entrada inválida
                errCounter++;
            }
        } while (proximoNumero % primeiroNumero == 0);
    }

    public static void checkNumber(int primeiroNumero, int proximoNumero) throws ArithmeticException {
        if (proximoNumero <= primeiroNumero) {
            throw new ArithmeticException();
        } else if (proximoNumero % primeiroNumero != 0) {
            System.out.println("O número " + proximoNumero + " dividido por " + primeiroNumero + " tem resto diferente de 0");
        }
    }
}
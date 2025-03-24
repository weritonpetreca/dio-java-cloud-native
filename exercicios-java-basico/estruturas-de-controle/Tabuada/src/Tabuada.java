public class Tabuada {

    public Tabuada(int Number) {
        for(int i = 1; i <= 10; i++){
            int tab = i * Number;
            System.out.println(i + " X " + Number + " = " + tab);
        }
    }
}

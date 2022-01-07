package sourceFiles;

public class Calculette {
    public int additionner(int a, int b){
        return a+b;
    }

    public int soustraire(int a, int b){
        return a-b;
    }

    public int multiplier(int a, int b){
        return a * b;
    }

    public int diviser(int a, int b) {
        if(b != 0 ){
            return a / b;
        } else {
            System.out.print("impossible");
            return 0;
        }
    }
}

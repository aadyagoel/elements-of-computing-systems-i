public class Or3Input {
    int or3inputout;

    void Or3InputFunction(int or3in1, int or3in2, int or3in3) {
        Or orgate5 = new Or();
        orgate5.OrFunction(or3in1, or3in2);
        int tempout1 = orgate5.out5;

        Or orgate6 = new Or();
        orgate6.OrFunction(tempout1, or3in3);
        or3inputout = orgate6.out5;
    }
   /* public static void main(String[] args) {
        Or3Input or3gate0 = new Or3Input();
        or3gate0.Or3InputFunction(1,0,1);
        System.out.print(or3gate0.or3inputout);
    }*/
}

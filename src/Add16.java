public class Add16 {
    int[] sumAdd = new int[16];

    void Add16Function(int[] Add16in1, int[] Add16in2) {
        HalfAdder halfadder3 = new HalfAdder();
        halfadder3.HalfAdderFunction(Add16in1[0], Add16in2[0]);
        int c = halfadder3.carryHA;
        sumAdd[0] = halfadder3.sumHA;
        for(int i=1; i<=15; i++) {
            FullAdder fulladder1 = new FullAdder();
            fulladder1.FullAdderFunction(Add16in1[i], Add16in2[i], c);
            sumAdd[i] = fulladder1.sumFA;
            c = fulladder1.carryFA; // carry drops by itself because the for loop doesn't run
        }
    }
    public static void main(String[] args) {
        Add16 add16 = new Add16();
        int[] Add16in1 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] Add16in2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        add16.Add16Function(Add16in1, Add16in2);
        System.out.print(add16.sumAdd);
    }
}

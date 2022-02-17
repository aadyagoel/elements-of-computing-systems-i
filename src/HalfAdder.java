public class HalfAdder {
    int sumHA;
    int carryHA;

    void HalfAdderFunction(int HAin1, int HAin2) {
        Xor xor1 = new Xor();
        xor1.XorFunction(HAin1, HAin2);
        sumHA = xor1.out9;
        And and1 = new And();
        and1.AndFunction(HAin1, HAin2);
        carryHA = and1.out2;
    }
   /* public static void main(String[] args) {
        HalfAdder halfadder0 = new HalfAdder();
        halfadder0.HalfAdderFunction(1,1);
        System.out.print(halfadder0.sumHA);
        System.out.print(halfadder0.carryHA);
    }*/
}

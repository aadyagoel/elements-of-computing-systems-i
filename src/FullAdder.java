public class FullAdder {
    int sumFA;
    int carryFA;
    void FullAdderFunction(int FAin1, int FAin2, int FAin3) {
        HalfAdder halfadder1 = new HalfAdder();
        halfadder1.HalfAdderFunction(FAin1, FAin2);
        int ab = halfadder1.sumHA;
        int cab = halfadder1.carryHA;
        HalfAdder halfadder2 = new HalfAdder();
        halfadder2.HalfAdderFunction(FAin3, ab);
        sumFA = halfadder2.sumHA;
        int s = halfadder2.carryHA;
        Or or2 = new Or();
        or2.OrFunction(cab, s);
        carryFA = or2.out5;
    }
    /*public static void main(String[] args) {
        FullAdder fulladder0 = new FullAdder();
        fulladder0.FullAdderFunction(0,0,0);
        System.out.print(fulladder0.sumFA);
        System.out.print(fulladder0.carryFA);
    }
    //HalfAdder(a=a,b=b,sum=ab,carry=cab);
    //HalfAdder(a=c,b=ab,sum=sum,carry=s);
    //Or(a=cab,b=s,out=carry);*/
}

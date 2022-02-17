public class syncBCD {
    int q3, q2, q1, q0;
    int nq3, q31;

    void syncBCD() {
        //if(){ // if user input true
            FlipFlop JKFF1 = new FlipFlop();
            JKFF1.JKFlipFlopFunction(1, 1);
            q0 = JKFF1.Q;
            int q01 = JKFF1.Q;

            And and10 = new And();
            and10.AndFunction(q01,nq3);
            int in1 = and10.out2;

            FlipFlop JKFF2 = new FlipFlop();
            JKFF2.JKFlipFlopFunction(in1,in1);
            q1 = JKFF2.Q;
            int q11 = JKFF2.Q;

            And and11 = new And();
            and11.AndFunction(q01,q11);
            int in2 = and11.out2;

            FlipFlop JKFF3 = new FlipFlop();
            JKFF3.JKFlipFlopFunction(in2,in2);
            q2 = JKFF3.Q;
            int q21 = JKFF3.Q;

            And and12 = new And();
            and12.AndFunction(in2,q21);
            int or1 = and12.out2;

            And and13 = new And();
            and13.AndFunction(q01,q31);
            int or2 = and13.out2;

            Or or50 = new Or();
            or50.OrFunction(or1,or2);
            int in3 = or50.out5;

            FlipFlop JKFF4 = new FlipFlop();
            JKFF4.JKFlipFlopFunction(in3,in3);
            q3 = JKFF4.Q;
            nq3 = JKFF4.nQ;
            q31 = JKFF4.Q;
       // }
    }
    public static void main(String[] args) {
        for(int i=0; i<=1; i++) {
            syncBCD syncBCD0 = new syncBCD();
            syncBCD0.syncBCD();
            System.out.print(syncBCD0.q3);
            System.out.print(syncBCD0.q2);
            System.out.print(syncBCD0.q1);
            System.out.print(syncBCD0.q0);
        }
    }
}
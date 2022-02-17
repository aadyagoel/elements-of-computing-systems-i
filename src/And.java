public class And {
    int out2;
    void AndFunction(int input1, int input2) {
        NandGate nand1 = new NandGate();
        nand1.function(input1,input2); // change for input a
        int out1 = nand1.out; //not gate
        NandGate nand2 = new NandGate();
        nand2.function(out1,out1); // change for input b
        out2 = nand2.out; // not gate
    }
   /* public static void main(String[] args) {
        And and0 = new And();
        and0.AndFunction(1,1);
        System.out.print(and0.out2);
    }*/
}
public class MuxTwoOne {
    int out17;
    int MuxFunction(int dataline1, int dataline2, int sel){
        //not gate
        NandGate nand11 = new NandGate();
        nand11.function(sel, sel);
        int notsel = nand11.out;
        // and gate 1
        NandGate nand12 = new NandGate();
        nand12.function(dataline1,notsel); // change for input a
        int out11 = nand12.out; //not gate
        NandGate nand13 = new NandGate();
        nand13.function(out11,out11); // change for input b
        int out12 = nand13.out; // not gate

        NandGate nand14 = new NandGate();
        nand14.function(dataline2,sel); // change for input a
        int out13 = nand14.out; //not gate
        NandGate nand15 = new NandGate();
        nand15.function(out13,out13); // change for input b
        int out14 = nand15.out; // not gate
//or
        NandGate nand16 = new NandGate();
        nand16.function(out12, out12);
        int out15 = nand16.out;
        NandGate nand17 = new NandGate();
        nand17.function(out14,out14);
        int out16 = nand17.out;
        NandGate nand18 = new NandGate();
        nand18.function(out15,out16);
        out17 = nand18.out;
        return out17;
    }
    //Not(in=sel,out=nsel);
    //    	And(a=a,b=nsel,out=c);
    //	And(a=b,b=sel,out=d);
    //	Or(a=c,b=d,out=out);

   /*public static void main(String[] args) {
        MuxTwoOne mux0 = new MuxTwoOne();
        mux0.MuxFunction(1,0,1);
        System.out.print(mux0.out17);
    }*/
}

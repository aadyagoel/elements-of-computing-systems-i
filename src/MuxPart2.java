/*public class MuxPart2 {
    int[] muxoutput = new int[16];
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

    void Mux16Function(int[] dataline31, int[] dataline32,int sel) {
        for(int i=0;i<=15;i++) {
            muxoutput[i] = MuxFunction(dataline31[i],dataline32[i],sel);
            //MuxTwoOne mux1 = new MuxTwoOne();
            //mux1.MuxFunction(dataline1[i],dataline2[i],sel);
            //muxoutput[i] = mux1.out17;
            //System.out.print(mux1.out17);
            System.out.print(muxoutput[i]);

        }
    }
    public static void main(String[] args) {
        MuxPart2 mux161 = new MuxPart2();

        int[] dataline11 = {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] dataline12 = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1};

        mux161.Mux16Function(dataline11,dataline12,1);
        //for(int i=0;i>=15;i++) {
        //  System.out.print(mux161.muxoutput[i]);
        //}
    }
}*/
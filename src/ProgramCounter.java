public class ProgramCounter {
    int[] PCout = new int[16];
    int[] FBout = new int[16]; //if gives null remove other comment
    void ProgramCounterFunction(int[] PCin1, int load, int inc, int reset) {
       ////CHIP PC {
        ////    IN in[16],load,inc,reset;
        ////    OUT out[16];
        ////    PARTS:
        ////	Inc16(in=oo,out=incd);
        ////	Mux16(a=oo,b=incd,sel=inc,out=o);
        ////	Mux16(a=o,b=in,sel=load,out=uu);
        ////	Mux16(a=uu,b[0..15]=false,sel=reset,out=this);
        ////	Register(in=this,load=true,out=out,out=oo);
        Inc16 inc1 = new Inc16();
        inc1.Inc16Function(FBout);
        int[] incout = new int[16];
        incout = inc1.incoutput; //will this work? else increment with for loop

        Mux16 muxgate28 = new Mux16();
        muxgate28.Mux16Function(FBout,incout,inc);
        int[] w0 = new int[16];
        w0 = muxgate28.muxoutput; // ditto , data type Integer can change or vice versa

        Mux16 muxgate29 = new Mux16();
        muxgate29.Mux16Function(w0,PCin1,load);
        int[] w1 = new int[16];
        w1 = muxgate29.muxoutput;

        int[] b3 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //right?
        Mux16 muxgate34 = new Mux16();
        muxgate34.Mux16Function(w1,b3,reset);
        int[] cout = new int[16];
        cout = muxgate34.muxoutput;

        Or3Input or3input1 = new Or3Input(); // make Or3input
        or3input1.Or3InputFunction(inc, load, reset);
        int regload = or3input1.or3inputout;

        Register16 register16 = new Register16();
        register16.Register16Function(cout, regload);// 16 bit register it is, error cause
        FBout = register16.register16out;
        PCout = register16.register16out;
    }

    public static void main(String[] args) {
        ProgramCounter pc = new ProgramCounter();
        int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        pc.ProgramCounterFunction(a,1,1,0);
        for(int i=0; i<=14; i++){
            System.out.print(pc.PCout[i]);
        }
    }
}




 public class CPU {
    int[] outM = new int[16];
    int writeM;
    int[] addressM = new int[15];
    int[] pc = new int[15];

    // code variables
    int[] outtM = new int[16];
    int[] D = new int[16];

    void CPUFunction(int[] inM, int[] instruction, int reset) {
        Not not5 = new Not();
        not5.NotFunction(instruction[15]);
        int ni = not5.out10;

        Mux16 mux16gate3 = new Mux16();
        mux16gate3.Mux16Function(outtM, instruction, ni);
        int[] i = new int[16];
        i = mux16gate3.muxoutput;

        Or orgate3 = new Or();
        orgate3.OrFunction(ni, instruction[5]);
        int intoA = orgate3.out5;

        // A register ARegister(in=i,load=intoA,out=A,out[0..14]=addressM);
       // ARegister aregister1 = new ARegister();
        // aregister1.ARegisterFunction(i);
        // int[] A = new int[15]; //value
        // A = aregister1.value;
        //addressM = aregister1.value; // memory is 15 or 16!!?
        int[] A = new int[16];
        Register16 AR = new Register16();
        AR.Register16Function(i, intoA);
        A = AR.register16out;
        for(int k=0; k<=14; k++) {
            addressM[k] = A[k+1];
        }

        And and10 = new And();
        and10.AndFunction(instruction[15], instruction[12]);
        int AorM = and10.out2;

        Mux16 mux16gate7 = new Mux16();
        mux16gate7.Mux16Function(A, inM, AorM);
        int[] AM = new int[16];
        AM = mux16gate7.muxoutput;

        And and11 = new And();
        and11.AndFunction(instruction[15], instruction[4]);
        int intoD = and11.out2;

        // D register DRegister(in=outtM,load=intoD,out=D);
        Register16 DR = new Register16();
        DR.Register16Function(outtM, intoD);
        D = DR.register16out;

        L alu1 = new L();
        alu1.function(D, AM, instruction[11], instruction[10], instruction[9], instruction[8], instruction[7], instruction[6]);
        outtM = alu1.fout;
        outM = alu1.fout;
        int zr = alu1.zr;
        int ng = alu1.ng;

        And and12 = new And();
        and12.AndFunction(instruction[15], instruction[3]);
        writeM = and12.out2;

        Not not20 = new Not();
        not20.NotFunction(ng);
        int pos = not20.out10;

        Not not21 = new Not();
        not21.NotFunction(zr);
        int nzr = not21.out10;

        And and13 = new And();
        and13.AndFunction(instruction[15], instruction[0]);
        int jgt = and13.out2;

        And and14 = new And();
        and14.AndFunction(pos, nzr);
        int posnzr = and14.out2;

        And and15 = new And();
        and15.AndFunction(jgt, posnzr);
        int ld1 = and15.out2;

        And and16 = new And();
        and16.AndFunction(instruction[15], instruction[1]);
        int jeq = and16.out2;

        And and17 = new And();
        and17.AndFunction(jeq, zr);
        int ld2 = and17.out2;

        And and18 = new And();
        and18.AndFunction(instruction[15], instruction[2]);
        int jlt = and18.out2;

        And and19 = new And();
        and19.AndFunction(jlt, ng);
        int ld3 = and19.out2;

        Or or1 = new Or();
        or1.OrFunction(ld1, ld2);
        int ldt = or1.out5;

        Or or2 = new Or();
        or2.OrFunction(ld3, ldt);
        int ld = or1.out5;

        ProgramCounter PC1 = new ProgramCounter();
        PC1.ProgramCounterFunction(A, ld, 1, reset);
        for (int j = 0; j<=14; j++) { //change index to java equivalent
            pc[j] = PC1.PCout[j];
        }
    }
     public static void main(String[] args) {
         CPU cpu0 = new CPU();
         int[] inM = {1,1,1,0,0,1,1,1,1,1,0,1,0,1,1,1};
         int[] instruction = {1,1,1,0,0,1,1,1,1,1,0,1,0,1,1,1};
         int reset = 1;
         cpu0.CPUFunction(inM, instruction, reset);
         for(int l = 0; l<=15; l++) {
             System.out.print(cpu0.outM[l]);
         }
         System.out.print(":outM");
         System.out.print(" "+cpu0.writeM);
         System.out.print(":writeM"+" ");
         for(int n = 0; n <=14; n++) {
             System.out.print(cpu0.addressM[n]);
         }
         System.out.print(":addressM"+" ");
         for(int n = 0; n <=14; n++) {
             System.out.print(cpu0.pc[n]);
         }
         System.out.print(":pc");
     }
}


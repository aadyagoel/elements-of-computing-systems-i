public class Register {
    int registerout;
    int DFFoutput=0;
//    IN in, load;
//    OUT out;
//    PARTS:
//Mux(a=gayout,b=in,sel=load,out=a);
//DFF(in=a,out=out,out=gayout);
    void RegisterFunction(int registerin,int bitload) {
        MuxTwoOne mux1 = new MuxTwoOne();
        mux1.MuxFunction(DFFoutput, registerin, bitload);
        registerout = mux1.out17;
        //for(int i=0; i<=15; i++) {
            DFFoutput = registerin; //dff out is previous IN not OUT
        //}
    }
    public static void main(String[] args) {
        Register register0 = new Register();
        register0.RegisterFunction(1,0);
        //System.out.print(register0.registerout);
    }
}

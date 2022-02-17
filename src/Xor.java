public class Xor {
    int out9;
    void XorFunction(int Xorin1, int Xorin2){
        NandGate nand6 = new NandGate();
        nand6.function(Xorin1, Xorin2);
        int out6 = nand6.out;
        NandGate nand7 = new NandGate();
        nand7.function(Xorin1,out6);
        int out7 = nand7.out;
        NandGate nand8 = new NandGate();
        nand8.function(out6,Xorin2);
        int out8 = nand8.out;
        NandGate nand9 = new NandGate();
        nand9.function(out7,out8);
        out9 = nand9.out;
    }
   /* public static void main(String[] args) {
        Xor xor1 = new Xor();
        xor1.XorFunction(0,0);
        System.out.print(xor1.out9);
    }*/
}

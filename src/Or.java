public class Or {
    int out5;
    void OrFunction(int Orin1, int Orin2){
        NandGate nand3 = new NandGate();
        nand3.function(Orin1, Orin1);
        int out3 = nand3.out;
        NandGate nand4 = new NandGate();
        nand4.function(Orin2,Orin2);
        int out4 = nand4.out;
        NandGate nand5 = new NandGate();
        nand5.function(out3,out4);
        out5 = nand5.out;
    }
   /* public static void main(String[] args) {
        Or or1 = new Or();
        or1.OrFunction(1,1);
        System.out.print(or1.out5);
    }*/
}

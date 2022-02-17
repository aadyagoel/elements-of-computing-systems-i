public class Not {
    int out10;
    void NotFunction(int not1){
        NandGate nand10 = new NandGate();
        nand10.function(not1,not1);
        out10 = nand10.out;
    }

    /*public static void main(String[] args) {
        Not not0 = new Not();
        not0.NotFunction(0);
        System.out.print(not0.out10);
    }*/
}

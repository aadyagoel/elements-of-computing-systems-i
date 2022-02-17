public class Not16 {
    int[] not16output = new int[16];
    void Not16Function(int[] not16in) {
        Not not1 = new Not();
        for (int i=0; i<=15; i++) {
            not1.NotFunction(not16in[i]);
            not16output[i] = not1.out10;
            //System.out.print(not16output[i]);
        }
    }
   /* public static void main(String[] args) {
        Not16 not16gate0 = new Not16();
        int[] not16in = {1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1};
        not16gate0.Not16Function(not16in);
    } */
}

public class Mux16{//} extends MuxTwoOne {
    int[] muxoutput = new int[16];
    void Mux16Function(int[] dataline1, int[] dataline2, int sel) {
        for (int i = 0; i <= 15; i++) {
            //int temp = MuxFunction(dataline1[i], dataline2[i], sel);
            //muxoutput[i] = temp;
            //System.out.print(dataline2[i]);
            MuxTwoOne mux10 = new MuxTwoOne();
            mux10.MuxFunction(dataline1[i],dataline2[i],sel);
            muxoutput[i] = mux10.out17;
            //System.out.print(muxoutput[i]);
        }
        //System.out.print(muxoutput);
    }
    /*public static void main(String[] args) {
        Mux16 mux161 = new Mux16();
        int[] dataline11 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] dataline12 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
        mux161.Mux16Function(dataline11, dataline12, 1);
    }*/
}
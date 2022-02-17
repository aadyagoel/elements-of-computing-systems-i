public class Nand3Input {
    int nandout;

    void Nand3Function(int a, int b, int c) {
        if (a==1 && b==1 && c==1) {
            nandout = 0;
        }
        else {
            nandout = 1;
        }
    }
}

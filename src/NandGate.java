public class NandGate { //runs with public here too
    //int a; we can use it like this as well
    //int b; but trying for shorter code
    int out;
    void function(int a, int b) { // instead we wrote a,b here
        if(a==1 && b==1) {
            out = 0;
        }
        else {
            out = 1;
        }
        //System.out.print(out);
    }
    public static void main(String[] args) {
        NandGate nand0 = new NandGate();
        nand0.function(1,0);
        System.out.print(nand0.out);
    }
}
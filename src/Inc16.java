public class Inc16 {
    //Add16(a=in,b[0]=true,out=out);
    int[] incoutput = new int[16];
    int[] outinc = new int[16];
    int[] b = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
    void Inc16Function(int[] inc16in) {
        Add16 add16gate1 = new Add16();
        add16gate1.Add16Function(inc16in,b);
        incoutput = add16gate1.sumAdd;
    }
}

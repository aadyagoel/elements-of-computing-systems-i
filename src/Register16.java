public class Register16 {
    int[] register16out = new int[16];
    void Register16Function(int[] register16in, int r16load) {
        Register register1 = new Register();
        for(int i = 0; i<=15; i++) {
            register1.RegisterFunction(register16in[i],r16load);
            register16out[i] = register1.registerout;
            //System.out.print(register16out[i]);
        }
    }
    public static void main(String[] args) {
        Register16 r16 = new Register16();
        int[] a = {1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0};
        r16.Register16Function(a, 0);
    }
}

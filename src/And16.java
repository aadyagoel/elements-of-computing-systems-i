public class And16{
    int[] andout = new int[16];
    void And16Function(int[] a1 , int[] a2){
        And A1 = new And();
        for(int i = 0;i <=15 ; i++) {
            A1.AndFunction(a1[i] , a2[i]);
            andout[i] = A1.out2;
        }
    }
   /* public static void main(String args[]){
        And16 a = new And16();
        int[] a1 = new int[16];
        int[] a2 = new int[16];
        int[] a11 = {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] a12 = {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1};
        a.And16Function(a11,a12);
    }*/
}
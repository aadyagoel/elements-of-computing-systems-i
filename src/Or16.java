public class Or16{
    int or16out[] = new int[16];
    void Or16Function(int o1[],int o2[]){
        Or o = new Or();
        for(int i = 0 ; i <=15 ; i ++){
            o.OrFunction(o1[i],o2[i]);
            or16out[i] = o.out5;
        }
    }
    /*public static void main(String args[]){
        Or16 o16 = new Or16();
        And16 a = new And16();
        int[] o1 = new int[16];
        int[] o2 = new int[16];
        int[] a11 = {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] a12 = {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1};
        o16.Or16Function(a11,a12);
    }*/
}
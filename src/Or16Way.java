public class Or16Way{
    int a ;
    int ooo[]  = new int[16];
    int or16wayout;
    void Or16WayFunction(int[] o1){
        Or o = new Or();
        a = o1[0];
        for(int i = 1; i<=15;i++){
            o.OrFunction(a,o1[i]);
            a = o.out5;
            ooo[i] = a;
        }
        or16wayout = ooo[15];
    }
   /* public static void main(String args[]){
        Or16Way oo = new Or16Way();
        int aa[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        oo.Or16WayFunction(aa);
    }*/
}
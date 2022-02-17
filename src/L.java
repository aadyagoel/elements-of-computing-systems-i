class L {
    int ng,zr;
    int fout[] = new int[16];
    void function(int[]x ,int[]y, int zx, int nx, int zy, int ny, int f, int no){

        int x1[] = new int[16];
        int y1[] = new int[16];
        for(int i = 0 ; i < 16 ; i++){
            x1[i] = 0;
            y1[i] = 0;
        }
        Mux16 m = new Mux16();
        m.Mux16Function(x,x1,zx);
        int xo[] = new int[16];
        xo = m.muxoutput;
        Mux16 m1 = new Mux16();
        m1.Mux16Function(y,y1,zy);
        int yo[] = new int[16];
        yo = m1.muxoutput;

        Not16 n = new Not16();
        int xo1[] = new int[16];
        n.Not16Function(xo);
        xo1 = n.not16output;
        Mux16 m2 = new Mux16();
        m2.Mux16Function(xo,xo1,nx);
        int mx[] = new int[16];
        mx = m2.muxoutput;
        Not16 n1 = new Not16();
        int yo1[] = new int[16];
        n1.Not16Function(yo);
        yo1 = n1.not16output;
        Mux16 m3 = new Mux16();
        m3.Mux16Function(yo,yo1,ny);
        int my[] = new int[16];
        my = m3.muxoutput;



        Add16 add = new Add16();
        And16 and = new And16();
        int and16[] = new int[16];
        int add16[] = new int[16];
        add.Add16Function(mx,my);
        add16 = add.sumAdd;
        and.And16Function(mx,my);
        and16 = and.andout;


        Mux16 m4 = new Mux16();
        m4.Mux16Function(and16,add16,f);
        int out[] = new int[16];
        out = m4.muxoutput;



        Not16 n2 = new Not16();
        n2.Not16Function(out);
        int notout[] = new int[16];
        notout = n2.not16output;
        Mux16 m5 = new Mux16();
        m5.Mux16Function(out,notout,no);

        fout = m5.muxoutput;
        ng = fout[0];
        Or16Way ow = new Or16Way();
        ow.Or16WayFunction(fout);
        int outow = ow.or16wayout;
        Not nn = new Not();
        nn.NotFunction(outow);
        zr = nn.out10;
    }
   /* public static void main(String args[]){
        L a = new L();
        int[] x = {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0};
        a.function(x,y,1,1,1,1,1,1);
        System.out.println(" zr " + a.zr + " " + " ng " + " " + a.ng);
        for(int i = 0 ; i < 16 ; i++){
            System.out.print(a.fout[i]);
        }
    }*/
}
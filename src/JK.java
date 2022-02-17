import java.util.*;
public class JK { //JK FLIP FLOP: Whatever is the state will get complemented
    Scanner sc = new Scanner(System.in);
    int[] clock = {2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0}; //only runs at upward arrow edge, not at 1 0 4 loops
    int[] clock2 = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
    int[] clock3 = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
    int c,d;
    //clock just as a for loop
    //loop ever time clock[i] == 2, loop = true
    int Q=0;
    int nQ=1;//from 1st line: whatever we start out with is inverted
    int Q3;
    int nQ3;//doubt;even clock or dff will give either 1 or 0 only so switching this should work here?
    void JKFlipFlopFunction(int J, int K) { //these forloop two inputs we have to change
        Nand3Input nand9 = new Nand3Input();
        nand9.Nand3Function(J,nQ,d);//b was nQ before 3 inputNand clock
        int Jout = nand9.nandout;// we dont need 3 input nand because it wont make difference to output
        // for clock we have external for loop
        //System.out.print(Jout);//0
        Nand3Input nand10 = new Nand3Input();
        nand10.Nand3Function(K,Q,c);//b was Q before//change to c
        int Kout = nand10.nandout;
        //System.out.print(Kout);//1

        NandGate nand11 = new NandGate();
        nand11.function(Jout,nQ);
        Q = nand11.out;//1
        //System.out.print(Q);

        NandGate nand12 = new NandGate();
        nand12.function(Kout,Q);
        int nQ1 = nand12.out;
        nQ = nand12.out;
        //Not not1 = new Not();
        //not1.NotFunction(nQ1);
        //nQ = not1.out10;
        //System.out.print(nQ);
    }
    public static void main(String[] args) {
        JK jkflipflop = new JK();
        //when clock!=2 this
        //clock loop
        //clock==2 if statement
        //run below
        //ask input every time
        for(int i=0; i<=100; i++) {
            jkflipflop.c = jkflipflop.clock2[i];
            jkflipflop.d = jkflipflop.clock3[i];
            //clock runs 4 cycles
           // int CK = jkflipflop.clock[c];
            //System.out.println(CK);
            //if(CK==2) {
                //this should only run when clock==2
                //ask for J K input every time

            int Jinput = jkflipflop.sc.nextInt();
            int Kinput = jkflipflop.sc.nextInt();
            jkflipflop.JKFlipFlopFunction(Jinput,Kinput);
            System.out.println("Q: "+ jkflipflop.Q);
            System.out.println("nQ: "+jkflipflop.nQ);

            //}
        }
    }
}
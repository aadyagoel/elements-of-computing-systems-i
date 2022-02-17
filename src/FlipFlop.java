import java.util.*;
public class FlipFlop { //JK FLIP FLOP: Whatever is the state will get complemented
    Scanner sc = new Scanner(System.in);
    int[] clock = {2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0,2,3,1,0}; //only runs at upward arrow edge, not at 1 0 4 loops
    //clock just as a for loop
    //loop ever time clock[i] == 2, loop = true
    int Q=0;
    int nQ=1;//from 1st line: whatever we start out with is inverted
    void JKFlipFlopFunction(int J, int K) { //these forloop two inputs we have to change
        NandGate nand9 = new NandGate();
        nand9.function(J,nQ);//b was nQ before 3 inputNand clock
        int Jout = nand9.out;// we dont need 3 input nand because it wont make difference to output
        // for clock we have external for loop

        NandGate nand10 = new NandGate();
        nand10.function(K,Q);//b was Q before
        int Kout = nand10.out;

        NandGate nand11 = new NandGate();
        nand11.function(Jout,nQ);
        Q = nand11.out;

        NandGate nand12 = new NandGate();
        nand12.function(Kout,Q);
        nQ = nand12.out;
    }
    public static void main(String[] args) {
        FlipFlop jkflipflop = new FlipFlop();
        //when clock!=2 this
        //clock loop
        //clock==2 if statement
        //run below
        //ask input every time
        for(int c=0; c<=100; c++) { //clock runs 4 cycles
            int CK = jkflipflop.clock[c];
            System.out.println(CK);
            if(CK==2) {
                //this should only run when clock==2
                //ask for J K input every time
                int Jinput = jkflipflop.sc.nextInt();
                int Kinput = jkflipflop.sc.nextInt();
                jkflipflop.JKFlipFlopFunction(Jinput,Kinput);
                //System.out.println("Q: "+ jkflipflop.Q);
                //System.out.println("nQ: "+jkflipflop.nQ);
            }
        }
    }
}
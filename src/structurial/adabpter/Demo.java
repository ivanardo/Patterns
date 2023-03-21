package structurial.adabpter;

import structurial.adabpter.adapters.SquarePegAdapter;
import structurial.adabpter.round.RoundHole;
import structurial.adabpter.round.RoundPeg;
import structurial.adabpter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg fits round hole");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);
//        hole.fits(smallPeg); // не компилируется

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largePeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}

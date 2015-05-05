// File:        MarieSim1.java
// Author:      Julie Lobur
// JDK Version: 1.3.1
// Date:        November 9, 2001
//              Updated Jan 7, 2007 (Replaced deprecated awt call.)
// Notice:      This code may be freely used for noncommercial purposes.
import MarieSimulator.MarieSim;
/******************************************************************************************
* This console application creates an instance of the MARIE machine simulator.  See       *
* MarieSim.java for details.                                                              *
******************************************************************************************/
public class MarieSim1 {
  public static void main(String args[]) {
    MarieSim sim = new MarieSim();
   sim.setVisible(true);
  }
} // MarieSim1

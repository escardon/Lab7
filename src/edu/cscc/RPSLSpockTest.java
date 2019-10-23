package edu.cscc;
import org.junit.Assert;
import org.junit.Test;
/***
 * @author Ed Scardon, October 13, Lab7 JavaDoc, Unit Testing, and GitHub
 */

import static edu.cscc.RPSLSpock.*;
import static org.junit.Assert.*;

public class RPSLSpockTest {

    @org.junit.Test
    public void TestisValidPick() {
    Assert.assertTrue(RPSLSpock.isValidPick(ROCK));
    Assert.assertTrue(RPSLSpock.isValidPick(PAPER));
    Assert.assertTrue(RPSLSpock.isValidPick(SCISSORS));
    Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
    Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
    Assert.assertFalse(RPSLSpock.isValidPick("BadPick"));}

    @org.junit.Test
    public void generatePick() {


        for (int i = 0; i <= 1000000; i++) {
            String pick = RPSLSpock.generatePick();
            Assert.assertNotNull(pick);
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
        }
    }
    @org.junit.Test
    public void testisComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.ROCK));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.PAPER));

    }
}
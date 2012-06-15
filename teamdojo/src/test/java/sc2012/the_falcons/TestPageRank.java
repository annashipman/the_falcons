package sc2012.the_falcons;

import org.junit.Test;
import sc2012.the_falcons.domain.Network;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: lewisn05
 * Date: 14/06/2012
 * Time: 14:59
 * To change this template use File | Settings | File Templates.
 */
public class TestPageRank {

    @Test
    public void given_programmer_should_return() {
        Programmer alice = new Programmer();
        Programmer bob = new Programmer();
        Network network = new Network();
        KudosCalculator kudosCalculator = new KudosCalculator(network, 0.85);
        float aliceRank = kudosCalculator.getKudos(alice);
        float bobRank = kudosCalculator.getKudos(bob);
        assertEquals(1.0, aliceRank);
        assertEquals(1.0, bobRank);

    }
}

package sc2012.the_falcons;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created with IntelliJ IDEA.
 * User: lewisn05
 * Date: 14/06/2012
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
public class Programmer {
    String name;
    SortedSet<String> languages;
    public Set<Programmer> recommendations = new HashSet<Programmer>();
    public double kudos;
}


package sc2012.the_falcons.domain;

import java.util.List;

public class Network {
	
	private int numberOfProgrammers;
	private int length;
	private List<Object> programmers;

	public Network(List<Object> programmers) {
		this.programmers = programmers;
		numberOfProgrammers=programmers.size();
	}

	public List<Object> getProgrammers() {
		return programmers;
	}

}

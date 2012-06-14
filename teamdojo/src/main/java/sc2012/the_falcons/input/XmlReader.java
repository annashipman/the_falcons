package sc2012.the_falcons.input;

import java.io.File;

import sc2012.the_falcons.domain.Network;

public class XmlReader {
	private final File inputFile;

	public XmlReader(File inputFile) {
		this.inputFile = inputFile;
	}

	public Network getNetwork() {
		return new Network();
	}

}

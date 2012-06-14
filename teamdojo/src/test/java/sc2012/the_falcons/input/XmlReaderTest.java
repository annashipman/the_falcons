package sc2012.the_falcons.input;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.junit.Test;

import sc2012.the_falcons.domain.Network;

public class XmlReaderTest {

	@Test
	public void shouldReadXmlAndReturnANetwork() {
		Network network = createNetworkFrom("src/main/resources/ProNet.xml");

		assertThat(network, is(notNullValue()));
	}

	@Test
	public void shouldReturn7ProgrammersInNetwork() {

		Network network = createNetworkFrom("src/main/resources/ProNet.xml");

		assertThat(network.getProgrammers().size(), is(10));

	}

	@Test
	public void shouldReturnValidFile() {
		File inputFile = new File("src/test/resources/ProNet.xml");
		System.out.println(inputFile.getAbsolutePath());
		assertThat(inputFile.exists(), is(true));
	}

	@Test
	public void shouldReturn2ProgrammersInTestNetwork() {
		Network network = createNetworkFrom("src/test/resources/ProNet.xml");
		assertThat(network.getProgrammers().size(), is(2));
	}

	private Network createNetworkFrom(String fileName) {
		File inputFile = new File(fileName);
		XmlReader reader = new XmlReader(inputFile);
		Network network = reader.getNetwork();
		return network;
	}
}

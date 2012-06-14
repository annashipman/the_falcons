package sc2012.the_falcons.input;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import sc2012.the_falcons.domain.Network;

public class XmlReader {
	private final File inputFile;

	public XmlReader(File inputFile) {
		this.inputFile = inputFile;
	}

	public Network getNetwork() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			builder.parse(inputFile);
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
		catch(SAXException e){
			throw new RuntimeException(e);
		}


		return new Network();
	}

}

package sc2012.the_falcons.input;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import sc2012.the_falcons.domain.Network;

public class XmlReader {
	private final File inputFile;

	public XmlReader(File inputFile) {
		this.inputFile = inputFile;
	}

	public Network getNetwork() {
		Element rootNode = createDocumentFrom(inputFile);

		NodeList listOfProgrammers = rootNode.getElementsByTagName("Programmer");

		return new Network(listOfProgrammers.getLength());
	}

	private Element createDocumentFrom(File aFile) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		
		Document document = null;
		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(aFile);
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		}
		catch(IOException e){
			throw new RuntimeException(e);
		}
		catch(SAXException e){
			throw new RuntimeException(e);
		}

		Element rootNode = document.getDocumentElement();
		return rootNode;
	}

}

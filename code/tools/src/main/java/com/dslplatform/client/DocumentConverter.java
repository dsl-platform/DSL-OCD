package com.dslplatform.client;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

enum DocumentConverter {
    INSTANCE;

    private final DocumentBuilder documentBuilder;
    private final Transformer transformer;

    private DocumentConverter() {
        try {
          final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
          dbf.setValidating(false);
          dbf.setFeature("http://xml.org/sax/features/namespaces", false);
          dbf.setFeature("http://xml.org/sax/features/validation", false);
          dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
          dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
          dbf.setNamespaceAware(false);
          dbf.newDocumentBuilder();
          documentBuilder= dbf.newDocumentBuilder();

          final TransformerFactory tf = TransformerFactory.newInstance();
          transformer = tf.newTransformer();
          transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
          transformer.setOutputProperty(OutputKeys.INDENT, "no");
        }
        catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Converts a <code>String</code> into a <code>org.w3c.dom.Document</code>.
     * Synchronized on the <code>DocumentBuilderFactory</code> to prevent the
     * <a href="http://acroyear.blog-city.com/xerces_and_the_dreaded_fwk005.htm">FWK005</a> parsing Exception
     * when being used from concurrent threads.
     * @throws IOException
     * @throws SAXException
     */
    Document stringToDocument(final String xml) throws SAXException, IOException {
        synchronized (documentBuilder) {
            return documentBuilder.parse(new InputSource(new StringReader(xml)));
        }
    }

    /**
     * Converts a <code>org.w3c.dom.Document</code> into a <code>String</code>
     *
     * Synchronized on the <code>Transformer</code> to prevent the
     * <a href="http://acroyear.blog-city.com/xerces_and_the_dreaded_fwk005.htm">FWK005</a> parsing Exception
     * when being used from concurrent threads.
     */
    String documentToString(final Document xml) {
        synchronized (transformer) {
            final StringWriter sw = new StringWriter();
            try {
              transformer.transform(new DOMSource(xml), new StreamResult(sw));
            } catch (TransformerException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
            return sw.toString();
        }
    }
}

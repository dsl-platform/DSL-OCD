package com.dslplatform.ocd;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class DomHelper {

    private final XPath xpath = XPathFactory.newInstance().newXPath();

    public final Document document;

    public DomHelper(final Document doc) {
        this.document = doc;
    }

    public void writeToFile(final String filename) {
        FileOutputStream fos = null;
        try {
            final File f = new File(filename);
            new File(f.getParent()).mkdirs();
            fos = new FileOutputStream(f);
            final DOMSource ds = new DOMSource(this.document);
            final Transformer t = TransformerFactory.newInstance().newTransformer();
            final StreamResult sr = new StreamResult(fos);
            t.transform(ds,sr);
            fos.close();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        } finally{
            try{
                if(fos != null)fos.close();
            } catch(final Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    public Element root(final Element root) {
        this.document.appendChild(root);
        return root;
    }

    public Attr attr(final String name, final String value) {
        final Attr a = this.document.createAttribute(name);
        a.setValue(value);
        return a;
    }

    public Element text(final Object data) {
    	String dataString = data.toString();
    	String[] textNodes = dataString.split("\n");
    	Element span = this.span();
    	for(int i=0; i!=textNodes.length; i++){
    		span.appendChild(this.document.createTextNode(textNodes[i]));
    		if(i != textNodes.length-1) {
    			span.appendChild(this.br());
    		}
    	}
    	
    	return span;
    }

    public Element element(final String tagName) {
        return this.element(tagName, (Node[]) null);
    }

    public Element element(final String tagName, final Node... children) {
        final Element element = document.createElement(tagName);
        this.appendChildren(element, children);
        return element;
    }

    private void appendChildren(final Element e, final Node... children) {
        if (children != null)
            for (final Node child : children){
                if(child instanceof Attr){
                    e.setAttribute(((Attr) child).getName(), ((Attr) child).getValue());
                }
                else {
                    e.appendChild(child);
                }
            }
    }

    public String xpathValue(final String expression) {
        try {
            return this.xpath.compile(expression).evaluate(this.document);
        } catch (final XPathExpressionException e) {
            throw new RuntimeException(e);
        }
    }

    public Element table(final Node ... children ) {
        return this.element("table", children);
    }

    public Element tr(final Node ... children ) {
        return this.element("tr", children);
    }

    public Element th(final Node ... children ) {
        return this.element("th", children);
    }

    public Element td(final Node ... children ) {
        return this.element("td", children);
    }

    public Element a(final Node ... children) {
        return this.element("a", children);
    }

    public Element code(final Node ... children) {
        return this.element("code", children);
    }

    public Element h1(final Node ... children) {
        return this.element("h1", children);
    }

    public Element h2(final Node ... children) {
        return this.element("h2", children);
    }

    public Element div(final Node ... children) {
        return this.element("div", children);
    }
    
    public Element span(final Node ... children) {
        return this.element("span", children);
    }

    public Element br() {
        return this.element("br");
    }

    public Attr href(final String value) {
        return this.attr("href", value);
    }

    public Attr src(final String value) {
        return this.attr("src", value);
    }

    public Attr id(final String value) {
        return this.attr("id", value);
    }

    public Attr target(final String value) {
        return this.attr("target", value);
    }

    public Attr style(final String value) {
        return this.attr("style", value);
    }
}


package com.dslplatform.ocd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DomHelper {

    public final Document document;
    public DomHelper(final Document doc) {
        this.document = doc;
    }

    public String getDocumentAsString() {
        try {
            final DOMSource domSource = new DOMSource(this.document);
            final Transformer t = TransformerFactory.newInstance().newTransformer();
            final StringWriter writer = new StringWriter();
            final StreamResult sr = new StreamResult(writer);
            t.transform(domSource,sr);
            return writer.toString();
        } catch(final Exception e){
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(final String filename) {
        FileOutputStream fileOutputStream = null;
        try {
            final File file = new File(filename);
            new File(file.getParent()).mkdirs();
            fileOutputStream = new FileOutputStream(file);

            final byte[] bytesContent = this.getDocumentAsString()
                    .replaceAll("&lt;", "<")
                    .replaceAll("&gt;", ">")
                    .getBytes("UTF-8");

            fileOutputStream.write(bytesContent);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        } finally{
            try{
                if(fileOutputStream != null)fileOutputStream.close();
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

    public Node text(final Object data) {
        return this.document.createTextNode(data.toString().replace("\n", "<br/>"));
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

    public Element table(final Node ... children ) {
        return this.element("table", children);
    }

    public Element thead(final Node ... children) {
        return this.element("thead", children);
    }

    public Element tbody(final Node ... children) {
        return this.element("tbody", children);
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

    public Element html(final Node ... children) {
        return this.element("html", children);
    }

    public Element title(final Node ... children) {
        return this.element("title", children);
    }

    public Element link(final Node ... children) {
        return this.element("link", children);
    }

    public Element script(final Node ... children) {
        return this.element("script", children);
    }

    public Element head(final Node ... children) {
        return this.element("head", children);
    }

    public Element body(final Node ... children) {
        return this.element("body", children);
    }

    public Element caption(final Node ... children) {
        return this.element("caption", children);
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

    public Attr rel(final String value) {
        return this.attr("rel", value);
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


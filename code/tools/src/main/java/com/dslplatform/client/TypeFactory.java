package com.dslplatform.client;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;

import org.w3c.dom.Element;

public abstract class TypeFactory {
    public static URI buildURI(final String uri) {
        try {
            return new URI(uri);
        } catch (final URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static InetAddress buildIP(final String ip) {
        try {
            return InetAddress.getByName(ip);
        } catch (final UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static Element buildElement(final String xml) {
        try {
            return DocumentConverter.INSTANCE.stringToDocument(xml).getDocumentElement();
        }
        catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneImages_5 implements java.io.Serializable {
    public OneListOfOneImages_5(
            final java.util.List<java.awt.image.BufferedImage> oneListOfOneImages,
            final java.util.List<java.awt.image.BufferedImage> calculatedOneListOfOneImages,
            final java.util.List<java.awt.image.BufferedImage> persistedOneListOfOneImages) {
        setOneListOfOneImages(oneListOfOneImages);
        this.calculatedOneListOfOneImages = calculatedOneListOfOneImages;
        this.persistedOneListOfOneImages = persistedOneListOfOneImages;
    }

    public OneListOfOneImages_5() {
        this.oneListOfOneImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
        this.calculatedOneListOfOneImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
        this.persistedOneListOfOneImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1761983993;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneImages_5)) return false;
        final OneListOfOneImages_5 other = (OneListOfOneImages_5) obj;

        if (!(this.oneListOfOneImages.equals(other.oneListOfOneImages)))
            return false;
        if (!(this.calculatedOneListOfOneImages
                .equals(other.calculatedOneListOfOneImages))) return false;
        if (!(this.persistedOneListOfOneImages
                .equals(other.persistedOneListOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneImages_5(" + oneListOfOneImages + ','
                + calculatedOneListOfOneImages + ','
                + persistedOneListOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> oneListOfOneImages;

    @JsonProperty("oneListOfOneImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.image.BufferedImage> getOneListOfOneImages() {
        return oneListOfOneImages;
    }

    public OneListOfOneImages_5 setOneListOfOneImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneImages\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneImages = value;

        return this;
    }

    private final java.util.List<java.awt.image.BufferedImage> calculatedOneListOfOneImages;

    public java.util.List<java.awt.image.BufferedImage> getCalculatedOneListOfOneImages() {
        return this.calculatedOneListOfOneImages;
    }

    private final java.util.List<java.awt.image.BufferedImage> persistedOneListOfOneImages;

    public java.util.List<java.awt.image.BufferedImage> getPersistedOneListOfOneImages() {
        return this.persistedOneListOfOneImages;
    }
}

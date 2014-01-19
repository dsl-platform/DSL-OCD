package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneImages_5 implements java.io.Serializable {
    public OneArrayOfOneImages_5(
            final java.awt.image.BufferedImage[] oneArrayOfOneImages,
            final java.awt.image.BufferedImage[] calculatedOneArrayOfOneImages,
            final java.awt.image.BufferedImage[] persistedOneArrayOfOneImages) {
        setOneArrayOfOneImages(oneArrayOfOneImages);
        this.calculatedOneArrayOfOneImages = calculatedOneArrayOfOneImages;
        this.persistedOneArrayOfOneImages = persistedOneArrayOfOneImages;
    }

    public OneArrayOfOneImages_5() {
        this.oneArrayOfOneImages = new java.awt.image.BufferedImage[] {};
        this.calculatedOneArrayOfOneImages = new java.awt.image.BufferedImage[] {};
        this.persistedOneArrayOfOneImages = new java.awt.image.BufferedImage[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 129685412;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneImages_5)) return false;
        final OneArrayOfOneImages_5 other = (OneArrayOfOneImages_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneImages,
                other.oneArrayOfOneImages))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneImages,
                other.calculatedOneArrayOfOneImages))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneImages,
                other.persistedOneArrayOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneImages_5(" + oneArrayOfOneImages + ','
                + calculatedOneArrayOfOneImages + ','
                + persistedOneArrayOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] oneArrayOfOneImages;

    @JsonProperty("oneArrayOfOneImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.image.BufferedImage[] getOneArrayOfOneImages() {
        return oneArrayOfOneImages;
    }

    public OneArrayOfOneImages_5 setOneArrayOfOneImages(
            final java.awt.image.BufferedImage[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneImages\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneImages = value;

        return this;
    }

    private final java.awt.image.BufferedImage[] calculatedOneArrayOfOneImages;

    public java.awt.image.BufferedImage[] getCalculatedOneArrayOfOneImages() {
        return this.calculatedOneArrayOfOneImages;
    }

    private final java.awt.image.BufferedImage[] persistedOneArrayOfOneImages;

    public java.awt.image.BufferedImage[] getPersistedOneArrayOfOneImages() {
        return this.persistedOneArrayOfOneImages;
    }
}

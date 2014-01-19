package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneImages_5 implements java.io.Serializable {
    public OneSetOfOneImages_5(
            final java.util.Set<java.awt.image.BufferedImage> oneSetOfOneImages,
            final java.util.Set<java.awt.image.BufferedImage> calculatedOneSetOfOneImages,
            final java.util.Set<java.awt.image.BufferedImage> persistedOneSetOfOneImages) {
        setOneSetOfOneImages(oneSetOfOneImages);
        this.calculatedOneSetOfOneImages = calculatedOneSetOfOneImages;
        this.persistedOneSetOfOneImages = persistedOneSetOfOneImages;
    }

    public OneSetOfOneImages_5() {
        this.oneSetOfOneImages = new java.util.HashSet<java.awt.image.BufferedImage>();
        this.calculatedOneSetOfOneImages = new java.util.HashSet<java.awt.image.BufferedImage>();
        this.persistedOneSetOfOneImages = new java.util.HashSet<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1699592463;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneImages_5)) return false;
        final OneSetOfOneImages_5 other = (OneSetOfOneImages_5) obj;

        if (!(this.oneSetOfOneImages.equals(other.oneSetOfOneImages)))
            return false;
        if (!(this.calculatedOneSetOfOneImages
                .equals(other.calculatedOneSetOfOneImages))) return false;
        if (!(this.persistedOneSetOfOneImages
                .equals(other.persistedOneSetOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneImages_5(" + oneSetOfOneImages + ','
                + calculatedOneSetOfOneImages + ','
                + persistedOneSetOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> oneSetOfOneImages;

    @JsonProperty("oneSetOfOneImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.image.BufferedImage> getOneSetOfOneImages() {
        return oneSetOfOneImages;
    }

    public OneSetOfOneImages_5 setOneSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneImages\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneImages = value;

        return this;
    }

    private final java.util.Set<java.awt.image.BufferedImage> calculatedOneSetOfOneImages;

    public java.util.Set<java.awt.image.BufferedImage> getCalculatedOneSetOfOneImages() {
        return this.calculatedOneSetOfOneImages;
    }

    private final java.util.Set<java.awt.image.BufferedImage> persistedOneSetOfOneImages;

    public java.util.Set<java.awt.image.BufferedImage> getPersistedOneSetOfOneImages() {
        return this.persistedOneSetOfOneImages;
    }
}

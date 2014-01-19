package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableImages_5 implements java.io.Serializable {
    public OneListOfNullableImages_5(
            final java.util.List<java.awt.image.BufferedImage> oneListOfNullableImages,
            final java.util.List<java.awt.image.BufferedImage> calculatedOneListOfNullableImages,
            final java.util.List<java.awt.image.BufferedImage> persistedOneListOfNullableImages) {
        setOneListOfNullableImages(oneListOfNullableImages);
        this.calculatedOneListOfNullableImages = calculatedOneListOfNullableImages;
        this.persistedOneListOfNullableImages = persistedOneListOfNullableImages;
    }

    public OneListOfNullableImages_5() {
        this.oneListOfNullableImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
        this.calculatedOneListOfNullableImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
        this.persistedOneListOfNullableImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1100973148;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableImages_5)) return false;
        final OneListOfNullableImages_5 other = (OneListOfNullableImages_5) obj;

        if (!(this.oneListOfNullableImages
                .equals(other.oneListOfNullableImages))) return false;
        if (!(this.calculatedOneListOfNullableImages
                .equals(other.calculatedOneListOfNullableImages)))
            return false;
        if (!(this.persistedOneListOfNullableImages
                .equals(other.persistedOneListOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableImages_5(" + oneListOfNullableImages + ','
                + calculatedOneListOfNullableImages + ','
                + persistedOneListOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> oneListOfNullableImages;

    @JsonProperty("oneListOfNullableImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.image.BufferedImage> getOneListOfNullableImages() {
        return oneListOfNullableImages;
    }

    public OneListOfNullableImages_5 setOneListOfNullableImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableImages\" cannot be null!");
        this.oneListOfNullableImages = value;

        return this;
    }

    private final java.util.List<java.awt.image.BufferedImage> calculatedOneListOfNullableImages;

    public java.util.List<java.awt.image.BufferedImage> getCalculatedOneListOfNullableImages() {
        return this.calculatedOneListOfNullableImages;
    }

    private final java.util.List<java.awt.image.BufferedImage> persistedOneListOfNullableImages;

    public java.util.List<java.awt.image.BufferedImage> getPersistedOneListOfNullableImages() {
        return this.persistedOneListOfNullableImages;
    }
}

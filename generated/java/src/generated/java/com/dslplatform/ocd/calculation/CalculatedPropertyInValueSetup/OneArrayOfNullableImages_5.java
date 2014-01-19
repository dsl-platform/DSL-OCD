package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableImages_5 implements java.io.Serializable {
    public OneArrayOfNullableImages_5(
            final java.awt.image.BufferedImage[] oneArrayOfNullableImages,
            final java.awt.image.BufferedImage[] calculatedOneArrayOfNullableImages,
            final java.awt.image.BufferedImage[] persistedOneArrayOfNullableImages) {
        setOneArrayOfNullableImages(oneArrayOfNullableImages);
        this.calculatedOneArrayOfNullableImages = calculatedOneArrayOfNullableImages;
        this.persistedOneArrayOfNullableImages = persistedOneArrayOfNullableImages;
    }

    public OneArrayOfNullableImages_5() {
        this.oneArrayOfNullableImages = new java.awt.image.BufferedImage[] {};
        this.calculatedOneArrayOfNullableImages = new java.awt.image.BufferedImage[] {};
        this.persistedOneArrayOfNullableImages = new java.awt.image.BufferedImage[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1658708137;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableImages_5)) return false;
        final OneArrayOfNullableImages_5 other = (OneArrayOfNullableImages_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableImages,
                other.oneArrayOfNullableImages))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableImages,
                other.calculatedOneArrayOfNullableImages))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableImages,
                other.persistedOneArrayOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableImages_5(" + oneArrayOfNullableImages + ','
                + calculatedOneArrayOfNullableImages + ','
                + persistedOneArrayOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] oneArrayOfNullableImages;

    @JsonProperty("oneArrayOfNullableImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.image.BufferedImage[] getOneArrayOfNullableImages() {
        return oneArrayOfNullableImages;
    }

    public OneArrayOfNullableImages_5 setOneArrayOfNullableImages(
            final java.awt.image.BufferedImage[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableImages\" cannot be null!");
        this.oneArrayOfNullableImages = value;

        return this;
    }

    private final java.awt.image.BufferedImage[] calculatedOneArrayOfNullableImages;

    public java.awt.image.BufferedImage[] getCalculatedOneArrayOfNullableImages() {
        return this.calculatedOneArrayOfNullableImages;
    }

    private final java.awt.image.BufferedImage[] persistedOneArrayOfNullableImages;

    public java.awt.image.BufferedImage[] getPersistedOneArrayOfNullableImages() {
        return this.persistedOneArrayOfNullableImages;
    }
}

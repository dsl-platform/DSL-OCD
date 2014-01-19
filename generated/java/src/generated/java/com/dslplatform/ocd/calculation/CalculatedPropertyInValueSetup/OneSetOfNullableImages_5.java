package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableImages_5 implements java.io.Serializable {
    public OneSetOfNullableImages_5(
            final java.util.Set<java.awt.image.BufferedImage> oneSetOfNullableImages,
            final java.util.Set<java.awt.image.BufferedImage> calculatedOneSetOfNullableImages,
            final java.util.Set<java.awt.image.BufferedImage> persistedOneSetOfNullableImages) {
        setOneSetOfNullableImages(oneSetOfNullableImages);
        this.calculatedOneSetOfNullableImages = calculatedOneSetOfNullableImages;
        this.persistedOneSetOfNullableImages = persistedOneSetOfNullableImages;
    }

    public OneSetOfNullableImages_5() {
        this.oneSetOfNullableImages = new java.util.HashSet<java.awt.image.BufferedImage>();
        this.calculatedOneSetOfNullableImages = new java.util.HashSet<java.awt.image.BufferedImage>();
        this.persistedOneSetOfNullableImages = new java.util.HashSet<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1929352208;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableImages_5)) return false;
        final OneSetOfNullableImages_5 other = (OneSetOfNullableImages_5) obj;

        if (!(this.oneSetOfNullableImages.equals(other.oneSetOfNullableImages)))
            return false;
        if (!(this.calculatedOneSetOfNullableImages
                .equals(other.calculatedOneSetOfNullableImages))) return false;
        if (!(this.persistedOneSetOfNullableImages
                .equals(other.persistedOneSetOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableImages_5(" + oneSetOfNullableImages + ','
                + calculatedOneSetOfNullableImages + ','
                + persistedOneSetOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> oneSetOfNullableImages;

    @JsonProperty("oneSetOfNullableImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.image.BufferedImage> getOneSetOfNullableImages() {
        return oneSetOfNullableImages;
    }

    public OneSetOfNullableImages_5 setOneSetOfNullableImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableImages\" cannot be null!");
        this.oneSetOfNullableImages = value;

        return this;
    }

    private final java.util.Set<java.awt.image.BufferedImage> calculatedOneSetOfNullableImages;

    public java.util.Set<java.awt.image.BufferedImage> getCalculatedOneSetOfNullableImages() {
        return this.calculatedOneSetOfNullableImages;
    }

    private final java.util.Set<java.awt.image.BufferedImage> persistedOneSetOfNullableImages;

    public java.util.Set<java.awt.image.BufferedImage> getPersistedOneSetOfNullableImages() {
        return this.persistedOneSetOfNullableImages;
    }
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneImages_4 implements java.io.Serializable {
    public NullableSetOfOneImages_4(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages,
            final java.util.Set<java.awt.image.BufferedImage> calculatedNullableSetOfOneImages,
            final java.util.Set<java.awt.image.BufferedImage> persistedNullableSetOfOneImages) {
        setNullableSetOfOneImages(nullableSetOfOneImages);
        this.calculatedNullableSetOfOneImages = calculatedNullableSetOfOneImages;
        this.persistedNullableSetOfOneImages = persistedNullableSetOfOneImages;
    }

    public NullableSetOfOneImages_4() {
        this.calculatedNullableSetOfOneImages = null;
        this.persistedNullableSetOfOneImages = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2047361509;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneImages_4)) return false;
        final NullableSetOfOneImages_4 other = (NullableSetOfOneImages_4) obj;

        if (!(this.nullableSetOfOneImages == other.nullableSetOfOneImages || this.nullableSetOfOneImages != null
                && this.nullableSetOfOneImages
                        .equals(other.nullableSetOfOneImages))) return false;
        if (!(this.calculatedNullableSetOfOneImages == other.calculatedNullableSetOfOneImages || this.calculatedNullableSetOfOneImages != null
                && this.calculatedNullableSetOfOneImages
                        .equals(other.calculatedNullableSetOfOneImages)))
            return false;
        if (!(this.persistedNullableSetOfOneImages == other.persistedNullableSetOfOneImages || this.persistedNullableSetOfOneImages != null
                && this.persistedNullableSetOfOneImages
                        .equals(other.persistedNullableSetOfOneImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneImages_4(" + nullableSetOfOneImages + ','
                + calculatedNullableSetOfOneImages + ','
                + persistedNullableSetOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages;

    @JsonProperty("nullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfOneImages() {
        return nullableSetOfOneImages;
    }

    public NullableSetOfOneImages_4 setNullableSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneImages = value;

        return this;
    }

    private final java.util.Set<java.awt.image.BufferedImage> calculatedNullableSetOfOneImages;

    public java.util.Set<java.awt.image.BufferedImage> getCalculatedNullableSetOfOneImages() {
        return this.calculatedNullableSetOfOneImages;
    }

    private final java.util.Set<java.awt.image.BufferedImage> persistedNullableSetOfOneImages;

    public java.util.Set<java.awt.image.BufferedImage> getPersistedNullableSetOfOneImages() {
        return this.persistedNullableSetOfOneImages;
    }
}

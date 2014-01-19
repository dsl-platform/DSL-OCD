package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableImages_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableImages_4(
            final java.awt.image.BufferedImage[] nullableArrayOfNullableImages,
            final java.awt.image.BufferedImage[] calculatedNullableArrayOfNullableImages,
            final java.awt.image.BufferedImage[] persistedNullableArrayOfNullableImages) {
        setNullableArrayOfNullableImages(nullableArrayOfNullableImages);
        this.calculatedNullableArrayOfNullableImages = calculatedNullableArrayOfNullableImages;
        this.persistedNullableArrayOfNullableImages = persistedNullableArrayOfNullableImages;
    }

    public NullableArrayOfNullableImages_4() {
        this.calculatedNullableArrayOfNullableImages = null;
        this.persistedNullableArrayOfNullableImages = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 615277751;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableImages_4)) return false;
        final NullableArrayOfNullableImages_4 other = (NullableArrayOfNullableImages_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableImages,
                other.nullableArrayOfNullableImages))) return false;
        if (!(this.calculatedNullableArrayOfNullableImages == other.calculatedNullableArrayOfNullableImages || this.calculatedNullableArrayOfNullableImages != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableImages,
                        other.calculatedNullableArrayOfNullableImages)))
            return false;
        if (!(this.persistedNullableArrayOfNullableImages == other.persistedNullableArrayOfNullableImages || this.persistedNullableArrayOfNullableImages != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableImages,
                        other.persistedNullableArrayOfNullableImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableImages_4("
                + nullableArrayOfNullableImages + ','
                + calculatedNullableArrayOfNullableImages + ','
                + persistedNullableArrayOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] nullableArrayOfNullableImages;

    @JsonProperty("nullableArrayOfNullableImages")
    public java.awt.image.BufferedImage[] getNullableArrayOfNullableImages() {
        return nullableArrayOfNullableImages;
    }

    public NullableArrayOfNullableImages_4 setNullableArrayOfNullableImages(
            final java.awt.image.BufferedImage[] value) {
        this.nullableArrayOfNullableImages = value;

        return this;
    }

    private final java.awt.image.BufferedImage[] calculatedNullableArrayOfNullableImages;

    public java.awt.image.BufferedImage[] getCalculatedNullableArrayOfNullableImages() {
        return this.calculatedNullableArrayOfNullableImages;
    }

    private final java.awt.image.BufferedImage[] persistedNullableArrayOfNullableImages;

    public java.awt.image.BufferedImage[] getPersistedNullableArrayOfNullableImages() {
        return this.persistedNullableArrayOfNullableImages;
    }
}

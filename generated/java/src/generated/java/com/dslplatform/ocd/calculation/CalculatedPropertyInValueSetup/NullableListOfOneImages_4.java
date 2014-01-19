package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneImages_4 implements java.io.Serializable {
    public NullableListOfOneImages_4(
            final java.util.List<java.awt.image.BufferedImage> nullableListOfOneImages,
            final java.util.List<java.awt.image.BufferedImage> calculatedNullableListOfOneImages,
            final java.util.List<java.awt.image.BufferedImage> persistedNullableListOfOneImages) {
        setNullableListOfOneImages(nullableListOfOneImages);
        this.calculatedNullableListOfOneImages = calculatedNullableListOfOneImages;
        this.persistedNullableListOfOneImages = persistedNullableListOfOneImages;
    }

    public NullableListOfOneImages_4() {
        this.calculatedNullableListOfOneImages = null;
        this.persistedNullableListOfOneImages = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1748114967;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneImages_4)) return false;
        final NullableListOfOneImages_4 other = (NullableListOfOneImages_4) obj;

        if (!(this.nullableListOfOneImages == other.nullableListOfOneImages || this.nullableListOfOneImages != null
                && this.nullableListOfOneImages
                        .equals(other.nullableListOfOneImages))) return false;
        if (!(this.calculatedNullableListOfOneImages == other.calculatedNullableListOfOneImages || this.calculatedNullableListOfOneImages != null
                && this.calculatedNullableListOfOneImages
                        .equals(other.calculatedNullableListOfOneImages)))
            return false;
        if (!(this.persistedNullableListOfOneImages == other.persistedNullableListOfOneImages || this.persistedNullableListOfOneImages != null
                && this.persistedNullableListOfOneImages
                        .equals(other.persistedNullableListOfOneImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneImages_4(" + nullableListOfOneImages + ','
                + calculatedNullableListOfOneImages + ','
                + persistedNullableListOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> nullableListOfOneImages;

    @JsonProperty("nullableListOfOneImages")
    public java.util.List<java.awt.image.BufferedImage> getNullableListOfOneImages() {
        return nullableListOfOneImages;
    }

    public NullableListOfOneImages_4 setNullableListOfOneImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneImages = value;

        return this;
    }

    private final java.util.List<java.awt.image.BufferedImage> calculatedNullableListOfOneImages;

    public java.util.List<java.awt.image.BufferedImage> getCalculatedNullableListOfOneImages() {
        return this.calculatedNullableListOfOneImages;
    }

    private final java.util.List<java.awt.image.BufferedImage> persistedNullableListOfOneImages;

    public java.util.List<java.awt.image.BufferedImage> getPersistedNullableListOfOneImages() {
        return this.persistedNullableListOfOneImages;
    }
}

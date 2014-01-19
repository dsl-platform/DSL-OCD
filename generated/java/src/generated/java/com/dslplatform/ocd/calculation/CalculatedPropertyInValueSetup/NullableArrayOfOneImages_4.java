package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneImages_4 implements java.io.Serializable {
    public NullableArrayOfOneImages_4(
            final java.awt.image.BufferedImage[] nullableArrayOfOneImages,
            final java.awt.image.BufferedImage[] calculatedNullableArrayOfOneImages,
            final java.awt.image.BufferedImage[] persistedNullableArrayOfOneImages) {
        setNullableArrayOfOneImages(nullableArrayOfOneImages);
        this.calculatedNullableArrayOfOneImages = calculatedNullableArrayOfOneImages;
        this.persistedNullableArrayOfOneImages = persistedNullableArrayOfOneImages;
    }

    public NullableArrayOfOneImages_4() {
        this.calculatedNullableArrayOfOneImages = null;
        this.persistedNullableArrayOfOneImages = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1186142138;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneImages_4)) return false;
        final NullableArrayOfOneImages_4 other = (NullableArrayOfOneImages_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneImages,
                other.nullableArrayOfOneImages))) return false;
        if (!(this.calculatedNullableArrayOfOneImages == other.calculatedNullableArrayOfOneImages || this.calculatedNullableArrayOfOneImages != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneImages,
                        other.calculatedNullableArrayOfOneImages)))
            return false;
        if (!(this.persistedNullableArrayOfOneImages == other.persistedNullableArrayOfOneImages || this.persistedNullableArrayOfOneImages != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneImages,
                        other.persistedNullableArrayOfOneImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneImages_4(" + nullableArrayOfOneImages + ','
                + calculatedNullableArrayOfOneImages + ','
                + persistedNullableArrayOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] nullableArrayOfOneImages;

    @JsonProperty("nullableArrayOfOneImages")
    public java.awt.image.BufferedImage[] getNullableArrayOfOneImages() {
        return nullableArrayOfOneImages;
    }

    public NullableArrayOfOneImages_4 setNullableArrayOfOneImages(
            final java.awt.image.BufferedImage[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneImages = value;

        return this;
    }

    private final java.awt.image.BufferedImage[] calculatedNullableArrayOfOneImages;

    public java.awt.image.BufferedImage[] getCalculatedNullableArrayOfOneImages() {
        return this.calculatedNullableArrayOfOneImages;
    }

    private final java.awt.image.BufferedImage[] persistedNullableArrayOfOneImages;

    public java.awt.image.BufferedImage[] getPersistedNullableArrayOfOneImages() {
        return this.persistedNullableArrayOfOneImages;
    }
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableImage_4 implements java.io.Serializable {
    public NullableImage_4(
            final java.awt.image.BufferedImage nullableImage,
            final java.awt.image.BufferedImage calculatedNullableImage,
            final java.awt.image.BufferedImage persistedNullableImage) {
        setNullableImage(nullableImage);
        this.calculatedNullableImage = calculatedNullableImage;
        this.persistedNullableImage = persistedNullableImage;
    }

    public NullableImage_4() {
        this.calculatedNullableImage = null;
        this.persistedNullableImage = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1487505063;
        result = prime
                * result
                + (this.nullableImage != null
                        ? this.nullableImage.hashCode()
                        : 0);
        result = prime
                * result
                + (this.calculatedNullableImage != null
                        ? this.calculatedNullableImage.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableImage != null
                        ? this.persistedNullableImage.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableImage_4)) return false;
        final NullableImage_4 other = (NullableImage_4) obj;

        if (!(this.nullableImage == other.nullableImage || this.nullableImage != null
                && this.nullableImage.equals(other.nullableImage)))
            return false;
        if (!(this.calculatedNullableImage == other.calculatedNullableImage || this.calculatedNullableImage != null
                && this.calculatedNullableImage
                        .equals(other.calculatedNullableImage))) return false;
        if (!(this.persistedNullableImage == other.persistedNullableImage || this.persistedNullableImage != null
                && this.persistedNullableImage
                        .equals(other.persistedNullableImage))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableImage_4(" + nullableImage + ','
                + calculatedNullableImage + ',' + persistedNullableImage + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage nullableImage;

    @JsonProperty("nullableImage")
    public java.awt.image.BufferedImage getNullableImage() {
        return nullableImage;
    }

    public NullableImage_4 setNullableImage(
            final java.awt.image.BufferedImage value) {
        this.nullableImage = value;

        return this;
    }

    private final java.awt.image.BufferedImage calculatedNullableImage;

    public java.awt.image.BufferedImage getCalculatedNullableImage() {
        return this.calculatedNullableImage;
    }

    private final java.awt.image.BufferedImage persistedNullableImage;

    public java.awt.image.BufferedImage getPersistedNullableImage() {
        return this.persistedNullableImage;
    }
}

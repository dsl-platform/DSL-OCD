package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableImages_4 implements
        java.io.Serializable {
    public NullableListOfNullableImages_4(
            final java.util.List<java.awt.image.BufferedImage> nullableListOfNullableImages,
            final java.util.List<java.awt.image.BufferedImage> calculatedNullableListOfNullableImages,
            final java.util.List<java.awt.image.BufferedImage> persistedNullableListOfNullableImages) {
        setNullableListOfNullableImages(nullableListOfNullableImages);
        this.calculatedNullableListOfNullableImages = calculatedNullableListOfNullableImages;
        this.persistedNullableListOfNullableImages = persistedNullableListOfNullableImages;
    }

    public NullableListOfNullableImages_4() {
        this.calculatedNullableListOfNullableImages = null;
        this.persistedNullableListOfNullableImages = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1942321030;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableImages_4)) return false;
        final NullableListOfNullableImages_4 other = (NullableListOfNullableImages_4) obj;

        if (!(this.nullableListOfNullableImages == other.nullableListOfNullableImages || this.nullableListOfNullableImages != null
                && this.nullableListOfNullableImages
                        .equals(other.nullableListOfNullableImages)))
            return false;
        if (!(this.calculatedNullableListOfNullableImages == other.calculatedNullableListOfNullableImages || this.calculatedNullableListOfNullableImages != null
                && this.calculatedNullableListOfNullableImages
                        .equals(other.calculatedNullableListOfNullableImages)))
            return false;
        if (!(this.persistedNullableListOfNullableImages == other.persistedNullableListOfNullableImages || this.persistedNullableListOfNullableImages != null
                && this.persistedNullableListOfNullableImages
                        .equals(other.persistedNullableListOfNullableImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableImages_4(" + nullableListOfNullableImages
                + ',' + calculatedNullableListOfNullableImages + ','
                + persistedNullableListOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> nullableListOfNullableImages;

    @JsonProperty("nullableListOfNullableImages")
    public java.util.List<java.awt.image.BufferedImage> getNullableListOfNullableImages() {
        return nullableListOfNullableImages;
    }

    public NullableListOfNullableImages_4 setNullableListOfNullableImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        this.nullableListOfNullableImages = value;

        return this;
    }

    private final java.util.List<java.awt.image.BufferedImage> calculatedNullableListOfNullableImages;

    public java.util.List<java.awt.image.BufferedImage> getCalculatedNullableListOfNullableImages() {
        return this.calculatedNullableListOfNullableImages;
    }

    private final java.util.List<java.awt.image.BufferedImage> persistedNullableListOfNullableImages;

    public java.util.List<java.awt.image.BufferedImage> getPersistedNullableListOfNullableImages() {
        return this.persistedNullableListOfNullableImages;
    }
}

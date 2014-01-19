package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableImages_4 implements
        java.io.Serializable {
    public NullableSetOfNullableImages_4(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfNullableImages,
            final java.util.Set<java.awt.image.BufferedImage> calculatedNullableSetOfNullableImages,
            final java.util.Set<java.awt.image.BufferedImage> persistedNullableSetOfNullableImages) {
        setNullableSetOfNullableImages(nullableSetOfNullableImages);
        this.calculatedNullableSetOfNullableImages = calculatedNullableSetOfNullableImages;
        this.persistedNullableSetOfNullableImages = persistedNullableSetOfNullableImages;
    }

    public NullableSetOfNullableImages_4() {
        this.calculatedNullableSetOfNullableImages = null;
        this.persistedNullableSetOfNullableImages = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1712490348;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableImages_4)) return false;
        final NullableSetOfNullableImages_4 other = (NullableSetOfNullableImages_4) obj;

        if (!(this.nullableSetOfNullableImages == other.nullableSetOfNullableImages || this.nullableSetOfNullableImages != null
                && this.nullableSetOfNullableImages
                        .equals(other.nullableSetOfNullableImages)))
            return false;
        if (!(this.calculatedNullableSetOfNullableImages == other.calculatedNullableSetOfNullableImages || this.calculatedNullableSetOfNullableImages != null
                && this.calculatedNullableSetOfNullableImages
                        .equals(other.calculatedNullableSetOfNullableImages)))
            return false;
        if (!(this.persistedNullableSetOfNullableImages == other.persistedNullableSetOfNullableImages || this.persistedNullableSetOfNullableImages != null
                && this.persistedNullableSetOfNullableImages
                        .equals(other.persistedNullableSetOfNullableImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableImages_4(" + nullableSetOfNullableImages
                + ',' + calculatedNullableSetOfNullableImages + ','
                + persistedNullableSetOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfNullableImages;

    @JsonProperty("nullableSetOfNullableImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfNullableImages() {
        return nullableSetOfNullableImages;
    }

    public NullableSetOfNullableImages_4 setNullableSetOfNullableImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        this.nullableSetOfNullableImages = value;

        return this;
    }

    private final java.util.Set<java.awt.image.BufferedImage> calculatedNullableSetOfNullableImages;

    public java.util.Set<java.awt.image.BufferedImage> getCalculatedNullableSetOfNullableImages() {
        return this.calculatedNullableSetOfNullableImages;
    }

    private final java.util.Set<java.awt.image.BufferedImage> persistedNullableSetOfNullableImages;

    public java.util.Set<java.awt.image.BufferedImage> getPersistedNullableSetOfNullableImages() {
        return this.persistedNullableSetOfNullableImages;
    }
}

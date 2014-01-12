package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableImagesValue4 implements
        java.io.Serializable {
    public NullableSetOfNullableImagesValue4(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfNullableImages) {
        setNullableSetOfNullableImages(nullableSetOfNullableImages);
    }

    public NullableSetOfNullableImagesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1775195864;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableImagesValue4)) return false;
        final NullableSetOfNullableImagesValue4 other = (NullableSetOfNullableImagesValue4) obj;

        if (!(this.nullableSetOfNullableImages == other.nullableSetOfNullableImages || this.nullableSetOfNullableImages != null
                && this.nullableSetOfNullableImages
                        .equals(other.nullableSetOfNullableImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableImagesValue4("
                + nullableSetOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfNullableImages;

    @JsonProperty("nullableSetOfNullableImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfNullableImages() {
        return nullableSetOfNullableImages;
    }

    public NullableSetOfNullableImagesValue4 setNullableSetOfNullableImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        this.nullableSetOfNullableImages = value;

        return this;
    }
}

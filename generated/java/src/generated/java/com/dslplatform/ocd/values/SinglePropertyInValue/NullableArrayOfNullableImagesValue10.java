package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableImagesValue10 implements
        java.io.Serializable {
    public NullableArrayOfNullableImagesValue10(
            final java.awt.image.BufferedImage[] nullableArrayOfNullableImages) {
        setNullableArrayOfNullableImages(nullableArrayOfNullableImages);
    }

    public NullableArrayOfNullableImagesValue10() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 815927978;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableImagesValue10))
            return false;
        final NullableArrayOfNullableImagesValue10 other = (NullableArrayOfNullableImagesValue10) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableImages,
                other.nullableArrayOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableImagesValue10("
                + nullableArrayOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] nullableArrayOfNullableImages;

    @JsonProperty("nullableArrayOfNullableImages")
    public java.awt.image.BufferedImage[] getNullableArrayOfNullableImages() {
        return nullableArrayOfNullableImages;
    }

    public NullableArrayOfNullableImagesValue10 setNullableArrayOfNullableImages(
            final java.awt.image.BufferedImage[] value) {
        this.nullableArrayOfNullableImages = value;

        return this;
    }
}

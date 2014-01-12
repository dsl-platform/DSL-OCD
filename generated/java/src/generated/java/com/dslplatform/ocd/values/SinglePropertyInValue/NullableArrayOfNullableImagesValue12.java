package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableImagesValue12 implements
        java.io.Serializable {
    public NullableArrayOfNullableImagesValue12(
            final java.awt.image.BufferedImage[] nullableArrayOfNullableImages) {
        setNullableArrayOfNullableImages(nullableArrayOfNullableImages);
    }

    public NullableArrayOfNullableImagesValue12() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 346871436;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableImagesValue12))
            return false;
        final NullableArrayOfNullableImagesValue12 other = (NullableArrayOfNullableImagesValue12) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableImages,
                other.nullableArrayOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableImagesValue12("
                + nullableArrayOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] nullableArrayOfNullableImages;

    @JsonProperty("nullableArrayOfNullableImages")
    public java.awt.image.BufferedImage[] getNullableArrayOfNullableImages() {
        return nullableArrayOfNullableImages;
    }

    public NullableArrayOfNullableImagesValue12 setNullableArrayOfNullableImages(
            final java.awt.image.BufferedImage[] value) {
        this.nullableArrayOfNullableImages = value;

        return this;
    }
}

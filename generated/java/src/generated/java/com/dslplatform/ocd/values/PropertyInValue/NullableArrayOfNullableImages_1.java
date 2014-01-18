package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableImages_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableImages_1(
            final java.awt.image.BufferedImage[] nullableArrayOfNullableImages) {
        setNullableArrayOfNullableImages(nullableArrayOfNullableImages);
    }

    public NullableArrayOfNullableImages_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 615277746;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableImages_1)) return false;
        final NullableArrayOfNullableImages_1 other = (NullableArrayOfNullableImages_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableImages,
                other.nullableArrayOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableImages_1("
                + nullableArrayOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] nullableArrayOfNullableImages;

    @JsonProperty("nullableArrayOfNullableImages")
    public java.awt.image.BufferedImage[] getNullableArrayOfNullableImages() {
        return nullableArrayOfNullableImages;
    }

    public NullableArrayOfNullableImages_1 setNullableArrayOfNullableImages(
            final java.awt.image.BufferedImage[] value) {
        this.nullableArrayOfNullableImages = value;

        return this;
    }
}

package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneImagesValue8 implements
        java.io.Serializable {
    public NullableArrayOfOneImagesValue8(
            final java.awt.image.BufferedImage[] nullableArrayOfOneImages) {
        setNullableArrayOfOneImages(nullableArrayOfOneImages);
    }

    public NullableArrayOfOneImagesValue8() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2100929106;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneImagesValue8)) return false;
        final NullableArrayOfOneImagesValue8 other = (NullableArrayOfOneImagesValue8) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneImages,
                other.nullableArrayOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneImagesValue8(" + nullableArrayOfOneImages
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] nullableArrayOfOneImages;

    @JsonProperty("nullableArrayOfOneImages")
    public java.awt.image.BufferedImage[] getNullableArrayOfOneImages() {
        return nullableArrayOfOneImages;
    }

    public NullableArrayOfOneImagesValue8 setNullableArrayOfOneImages(
            final java.awt.image.BufferedImage[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneImages = value;

        return this;
    }
}

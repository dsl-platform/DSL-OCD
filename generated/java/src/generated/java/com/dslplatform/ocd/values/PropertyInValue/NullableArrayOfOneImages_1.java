package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneImages_1 implements java.io.Serializable {
    public NullableArrayOfOneImages_1(
            final java.awt.image.BufferedImage[] nullableArrayOfOneImages) {
        setNullableArrayOfOneImages(nullableArrayOfOneImages);
    }

    public NullableArrayOfOneImages_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 426627251;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneImages_1)) return false;
        final NullableArrayOfOneImages_1 other = (NullableArrayOfOneImages_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneImages,
                other.nullableArrayOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneImages_1(" + nullableArrayOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] nullableArrayOfOneImages;

    @JsonProperty("nullableArrayOfOneImages")
    public java.awt.image.BufferedImage[] getNullableArrayOfOneImages() {
        return nullableArrayOfOneImages;
    }

    public NullableArrayOfOneImages_1 setNullableArrayOfOneImages(
            final java.awt.image.BufferedImage[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneImages = value;

        return this;
    }
}

package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneImagesValue2 implements java.io.Serializable {
    public NullableSetOfOneImagesValue2(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages) {
        setNullableSetOfOneImages(nullableSetOfOneImages);
    }

    public NullableSetOfOneImagesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1549333781;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneImagesValue2)) return false;
        final NullableSetOfOneImagesValue2 other = (NullableSetOfOneImagesValue2) obj;

        if (!(this.nullableSetOfOneImages == other.nullableSetOfOneImages || this.nullableSetOfOneImages != null
                && this.nullableSetOfOneImages
                        .equals(other.nullableSetOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneImagesValue2(" + nullableSetOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages;

    @JsonProperty("nullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfOneImages() {
        return nullableSetOfOneImages;
    }

    public NullableSetOfOneImagesValue2 setNullableSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneImages = value;

        return this;
    }
}

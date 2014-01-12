package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneImagesValue3 implements java.io.Serializable {
    public NullableSetOfOneImagesValue3(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages) {
        setNullableSetOfOneImages(nullableSetOfOneImages);
    }

    public NullableSetOfOneImagesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 16750160;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneImagesValue3)) return false;
        final NullableSetOfOneImagesValue3 other = (NullableSetOfOneImagesValue3) obj;

        if (!(this.nullableSetOfOneImages == other.nullableSetOfOneImages || this.nullableSetOfOneImages != null
                && this.nullableSetOfOneImages
                        .equals(other.nullableSetOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneImagesValue3(" + nullableSetOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages;

    @JsonProperty("nullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfOneImages() {
        return nullableSetOfOneImages;
    }

    public NullableSetOfOneImagesValue3 setNullableSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneImages = value;

        return this;
    }
}

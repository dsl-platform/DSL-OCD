package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneImagesValue4 implements java.io.Serializable {
    public NullableSetOfOneImagesValue4(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages) {
        setNullableSetOfOneImages(nullableSetOfOneImages);
    }

    public NullableSetOfOneImagesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 386534367;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneImagesValue4)) return false;
        final NullableSetOfOneImagesValue4 other = (NullableSetOfOneImagesValue4) obj;

        if (!(this.nullableSetOfOneImages == other.nullableSetOfOneImages || this.nullableSetOfOneImages != null
                && this.nullableSetOfOneImages
                        .equals(other.nullableSetOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneImagesValue4(" + nullableSetOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages;

    @JsonProperty("nullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfOneImages() {
        return nullableSetOfOneImages;
    }

    public NullableSetOfOneImagesValue4 setNullableSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneImages = value;

        return this;
    }
}

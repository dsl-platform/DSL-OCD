package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneImages_1 implements java.io.Serializable {
    public NullableSetOfOneImages_1(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages) {
        setNullableSetOfOneImages(nullableSetOfOneImages);
    }

    public NullableSetOfOneImages_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1644076982;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneImages_1)) return false;
        final NullableSetOfOneImages_1 other = (NullableSetOfOneImages_1) obj;

        if (!(this.nullableSetOfOneImages == other.nullableSetOfOneImages || this.nullableSetOfOneImages != null
                && this.nullableSetOfOneImages
                        .equals(other.nullableSetOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneImages_1(" + nullableSetOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages;

    @JsonProperty("nullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfOneImages() {
        return nullableSetOfOneImages;
    }

    public NullableSetOfOneImages_1 setNullableSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneImages = value;

        return this;
    }
}

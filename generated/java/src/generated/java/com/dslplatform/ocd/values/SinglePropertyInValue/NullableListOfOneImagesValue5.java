package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneImagesValue5 implements
        java.io.Serializable {
    public NullableListOfOneImagesValue5(
            final java.util.List<java.awt.image.BufferedImage> nullableListOfOneImages) {
        setNullableListOfOneImages(nullableListOfOneImages);
    }

    public NullableListOfOneImagesValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1894389300;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneImagesValue5)) return false;
        final NullableListOfOneImagesValue5 other = (NullableListOfOneImagesValue5) obj;

        if (!(this.nullableListOfOneImages == other.nullableListOfOneImages || this.nullableListOfOneImages != null
                && this.nullableListOfOneImages
                        .equals(other.nullableListOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneImagesValue5(" + nullableListOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> nullableListOfOneImages;

    @JsonProperty("nullableListOfOneImages")
    public java.util.List<java.awt.image.BufferedImage> getNullableListOfOneImages() {
        return nullableListOfOneImages;
    }

    public NullableListOfOneImagesValue5 setNullableListOfOneImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneImages = value;

        return this;
    }
}

package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableImagesValue4 implements
        java.io.Serializable {
    public NullableListOfNullableImagesValue4(
            final java.util.List<java.awt.image.BufferedImage> nullableListOfNullableImages) {
        setNullableListOfNullableImages(nullableListOfNullableImages);
    }

    public NullableListOfNullableImagesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1414230102;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableImagesValue4)) return false;
        final NullableListOfNullableImagesValue4 other = (NullableListOfNullableImagesValue4) obj;

        if (!(this.nullableListOfNullableImages == other.nullableListOfNullableImages || this.nullableListOfNullableImages != null
                && this.nullableListOfNullableImages
                        .equals(other.nullableListOfNullableImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableImagesValue4("
                + nullableListOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> nullableListOfNullableImages;

    @JsonProperty("nullableListOfNullableImages")
    public java.util.List<java.awt.image.BufferedImage> getNullableListOfNullableImages() {
        return nullableListOfNullableImages;
    }

    public NullableListOfNullableImagesValue4 setNullableListOfNullableImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        this.nullableListOfNullableImages = value;

        return this;
    }
}

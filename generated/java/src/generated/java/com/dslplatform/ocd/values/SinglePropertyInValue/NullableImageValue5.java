package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableImageValue5 implements java.io.Serializable {
    public NullableImageValue5(
            final java.awt.image.BufferedImage nullableImage) {
        setNullableImage(nullableImage);
    }

    public NullableImageValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1826675756;
        result = prime
                * result
                + (this.nullableImage != null
                        ? this.nullableImage.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableImageValue5)) return false;
        final NullableImageValue5 other = (NullableImageValue5) obj;

        if (!(this.nullableImage == other.nullableImage || this.nullableImage != null
                && this.nullableImage.equals(other.nullableImage)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableImageValue5(" + nullableImage + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage nullableImage;

    @JsonProperty("nullableImage")
    public java.awt.image.BufferedImage getNullableImage() {
        return nullableImage;
    }

    public NullableImageValue5 setNullableImage(
            final java.awt.image.BufferedImage value) {
        this.nullableImage = value;

        return this;
    }
}

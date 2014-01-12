package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableImagesValue6 implements java.io.Serializable {
    public OneSetOfNullableImagesValue6(
            final java.util.Set<java.awt.image.BufferedImage> oneSetOfNullableImages) {
        setOneSetOfNullableImages(oneSetOfNullableImages);
    }

    public OneSetOfNullableImagesValue6() {
        this.oneSetOfNullableImages = new java.util.HashSet<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1573221219;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableImagesValue6)) return false;
        final OneSetOfNullableImagesValue6 other = (OneSetOfNullableImagesValue6) obj;

        if (!(this.oneSetOfNullableImages.equals(other.oneSetOfNullableImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableImagesValue6(" + oneSetOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> oneSetOfNullableImages;

    @JsonProperty("oneSetOfNullableImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.image.BufferedImage> getOneSetOfNullableImages() {
        return oneSetOfNullableImages;
    }

    public OneSetOfNullableImagesValue6 setOneSetOfNullableImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableImages\" cannot be null!");
        this.oneSetOfNullableImages = value;

        return this;
    }
}

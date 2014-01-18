package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableImages_1 implements java.io.Serializable {
    public OneListOfNullableImages_1(
            final java.util.List<java.awt.image.BufferedImage> oneListOfNullableImages) {
        setOneListOfNullableImages(oneListOfNullableImages);
    }

    public OneListOfNullableImages_1() {
        this.oneListOfNullableImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1100973152;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableImages_1)) return false;
        final OneListOfNullableImages_1 other = (OneListOfNullableImages_1) obj;

        if (!(this.oneListOfNullableImages
                .equals(other.oneListOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableImages_1(" + oneListOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> oneListOfNullableImages;

    @JsonProperty("oneListOfNullableImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.image.BufferedImage> getOneListOfNullableImages() {
        return oneListOfNullableImages;
    }

    public OneListOfNullableImages_1 setOneListOfNullableImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableImages\" cannot be null!");
        this.oneListOfNullableImages = value;

        return this;
    }
}

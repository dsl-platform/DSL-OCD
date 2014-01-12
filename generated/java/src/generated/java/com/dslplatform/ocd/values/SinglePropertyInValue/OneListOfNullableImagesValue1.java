package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableImagesValue1 implements
        java.io.Serializable {
    public OneListOfNullableImagesValue1(
            final java.util.List<java.awt.image.BufferedImage> oneListOfNullableImages) {
        setOneListOfNullableImages(oneListOfNullableImages);
    }

    public OneListOfNullableImagesValue1() {
        this.oneListOfNullableImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 887255148;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableImagesValue1)) return false;
        final OneListOfNullableImagesValue1 other = (OneListOfNullableImagesValue1) obj;

        if (!(this.oneListOfNullableImages
                .equals(other.oneListOfNullableImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableImagesValue1(" + oneListOfNullableImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> oneListOfNullableImages;

    @JsonProperty("oneListOfNullableImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.image.BufferedImage> getOneListOfNullableImages() {
        return oneListOfNullableImages;
    }

    public OneListOfNullableImagesValue1 setOneListOfNullableImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableImages\" cannot be null!");
        this.oneListOfNullableImages = value;

        return this;
    }
}

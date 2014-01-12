package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneImagesValue8 implements java.io.Serializable {
    public OneArrayOfOneImagesValue8(
            final java.awt.image.BufferedImage[] oneArrayOfOneImages) {
        setOneArrayOfOneImages(oneArrayOfOneImages);
    }

    public OneArrayOfOneImagesValue8() {
        this.oneArrayOfOneImages = new java.awt.image.BufferedImage[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1231038605;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneImagesValue8)) return false;
        final OneArrayOfOneImagesValue8 other = (OneArrayOfOneImagesValue8) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneImages,
                other.oneArrayOfOneImages))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneImagesValue8(" + oneArrayOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage[] oneArrayOfOneImages;

    @JsonProperty("oneArrayOfOneImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.image.BufferedImage[] getOneArrayOfOneImages() {
        return oneArrayOfOneImages;
    }

    public OneArrayOfOneImagesValue8 setOneArrayOfOneImages(
            final java.awt.image.BufferedImage[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneImages\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneImages = value;

        return this;
    }
}

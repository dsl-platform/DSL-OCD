package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneImagesValue2 implements java.io.Serializable {
    public OneListOfOneImagesValue2(
            final java.util.List<java.awt.image.BufferedImage> oneListOfOneImages) {
        setOneListOfOneImages(oneListOfOneImages);
    }

    public OneListOfOneImagesValue2() {
        this.oneListOfOneImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2083072814;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneImagesValue2)) return false;
        final OneListOfOneImagesValue2 other = (OneListOfOneImagesValue2) obj;

        if (!(this.oneListOfOneImages.equals(other.oneListOfOneImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneImagesValue2(" + oneListOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> oneListOfOneImages;

    @JsonProperty("oneListOfOneImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.image.BufferedImage> getOneListOfOneImages() {
        return oneListOfOneImages;
    }

    public OneListOfOneImagesValue2 setOneListOfOneImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneImages\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneImages = value;

        return this;
    }
}

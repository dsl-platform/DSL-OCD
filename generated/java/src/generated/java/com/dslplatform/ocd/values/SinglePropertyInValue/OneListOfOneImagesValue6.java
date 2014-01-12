package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneImagesValue6 implements java.io.Serializable {
    public OneListOfOneImagesValue6(
            final java.util.List<java.awt.image.BufferedImage> oneListOfOneImages) {
        setOneListOfOneImages(oneListOfOneImages);
    }

    public OneListOfOneImagesValue6() {
        this.oneListOfOneImages = new java.util.ArrayList<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 113704346;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneImagesValue6)) return false;
        final OneListOfOneImagesValue6 other = (OneListOfOneImagesValue6) obj;

        if (!(this.oneListOfOneImages.equals(other.oneListOfOneImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneImagesValue6(" + oneListOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.awt.image.BufferedImage> oneListOfOneImages;

    @JsonProperty("oneListOfOneImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.awt.image.BufferedImage> getOneListOfOneImages() {
        return oneListOfOneImages;
    }

    public OneListOfOneImagesValue6 setOneListOfOneImages(
            final java.util.List<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneImages\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneImages = value;

        return this;
    }
}

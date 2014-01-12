package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneImagesValue3 implements java.io.Serializable {
    public OneSetOfOneImagesValue3(
            final java.util.Set<java.awt.image.BufferedImage> oneSetOfOneImages) {
        setOneSetOfOneImages(oneSetOfOneImages);
    }

    public OneSetOfOneImagesValue3() {
        this.oneSetOfOneImages = new java.util.HashSet<java.awt.image.BufferedImage>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1567651103;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneImagesValue3)) return false;
        final OneSetOfOneImagesValue3 other = (OneSetOfOneImagesValue3) obj;

        if (!(this.oneSetOfOneImages.equals(other.oneSetOfOneImages)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneImagesValue3(" + oneSetOfOneImages + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.awt.image.BufferedImage> oneSetOfOneImages;

    @JsonProperty("oneSetOfOneImages")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.awt.image.BufferedImage> getOneSetOfOneImages() {
        return oneSetOfOneImages;
    }

    public OneSetOfOneImagesValue3 setOneSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneImages\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneImages = value;

        return this;
    }
}

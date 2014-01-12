package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneImageValue6 implements java.io.Serializable {
    public OneImageValue6(
            final java.awt.image.BufferedImage oneImage) {
        setOneImage(oneImage);
    }

    public OneImageValue6() {
        this.oneImage = new java.awt.image.BufferedImage(0, 0,
                java.awt.image.BufferedImage.TYPE_4BYTE_ABGR);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1273421870;
        result = prime * result
                + (this.oneImage != null ? this.oneImage.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneImageValue6)) return false;
        final OneImageValue6 other = (OneImageValue6) obj;

        if (!(this.oneImage.equals(other.oneImage))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneImageValue6(" + oneImage + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage oneImage;

    @JsonProperty("oneImage")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.image.BufferedImage getOneImage() {
        return oneImage;
    }

    public OneImageValue6 setOneImage(final java.awt.image.BufferedImage value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneImage\" cannot be null!");
        this.oneImage = value;

        return this;
    }
}

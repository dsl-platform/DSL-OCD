package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneImageValue4 implements java.io.Serializable {
    public OneImageValue4(
            final java.awt.image.BufferedImage oneImage) {
        setOneImage(oneImage);
    }

    public OneImageValue4() {
        this.oneImage = new java.awt.image.BufferedImage(1, 1,
                java.awt.image.BufferedImage.TYPE_4BYTE_ABGR);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 110622456;
        result = prime * result
                + (this.oneImage != null ? this.oneImage.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneImageValue4)) return false;
        final OneImageValue4 other = (OneImageValue4) obj;

        if (!(this.oneImage.equals(other.oneImage))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneImageValue4(" + oneImage + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage oneImage;

    @JsonProperty("oneImage")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.image.BufferedImage getOneImage() {
        return oneImage;
    }

    public OneImageValue4 setOneImage(final java.awt.image.BufferedImage value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneImage\" cannot be null!");
        this.oneImage = value;

        return this;
    }
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneImage_5 implements java.io.Serializable {
    public OneImage_5(
            final java.awt.image.BufferedImage oneImage,
            final java.awt.image.BufferedImage calculatedOneImage,
            final java.awt.image.BufferedImage persistedOneImage) {
        setOneImage(oneImage);
        this.calculatedOneImage = calculatedOneImage;
        this.persistedOneImage = persistedOneImage;
    }

    public OneImage_5() {
        this.oneImage = new java.awt.image.BufferedImage(1, 1,
                java.awt.image.BufferedImage.TYPE_4BYTE_ABGR);
        this.calculatedOneImage = new java.awt.image.BufferedImage(1, 1,
                java.awt.image.BufferedImage.TYPE_4BYTE_ABGR);
        this.persistedOneImage = new java.awt.image.BufferedImage(1, 1,
                java.awt.image.BufferedImage.TYPE_4BYTE_ABGR);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1646049529;
        result = prime * result
                + (this.oneImage != null ? this.oneImage.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneImage != null ? this.calculatedOneImage
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneImage != null ? this.persistedOneImage
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneImage_5)) return false;
        final OneImage_5 other = (OneImage_5) obj;

        if (!(this.oneImage.equals(other.oneImage))) return false;
        if (!(this.calculatedOneImage.equals(other.calculatedOneImage)))
            return false;
        if (!(this.persistedOneImage.equals(other.persistedOneImage)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneImage_5(" + oneImage + ',' + calculatedOneImage + ','
                + persistedOneImage + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.awt.image.BufferedImage oneImage;

    @JsonProperty("oneImage")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.awt.image.BufferedImage getOneImage() {
        return oneImage;
    }

    public OneImage_5 setOneImage(final java.awt.image.BufferedImage value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneImage\" cannot be null!");
        this.oneImage = value;

        return this;
    }

    private final java.awt.image.BufferedImage calculatedOneImage;

    public java.awt.image.BufferedImage getCalculatedOneImage() {
        return this.calculatedOneImage;
    }

    private final java.awt.image.BufferedImage persistedOneImage;

    public java.awt.image.BufferedImage getPersistedOneImage() {
        return this.persistedOneImage;
    }
}

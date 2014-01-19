package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneBinary_5 implements java.io.Serializable {
    public OneBinary_5(
            final byte[] oneBinary,
            final byte[] calculatedOneBinary,
            final byte[] persistedOneBinary) {
        setOneBinary(oneBinary);
        this.calculatedOneBinary = calculatedOneBinary;
        this.persistedOneBinary = persistedOneBinary;
    }

    public OneBinary_5() {
        this.oneBinary = new byte[0];
        this.calculatedOneBinary = new byte[0];
        this.persistedOneBinary = new byte[0];
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 904993981;
        result = prime * result + (java.util.Arrays.hashCode(this.oneBinary));
        result = prime * result
                + (java.util.Arrays.hashCode(this.calculatedOneBinary));
        result = prime * result
                + (java.util.Arrays.hashCode(this.persistedOneBinary));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneBinary_5)) return false;
        final OneBinary_5 other = (OneBinary_5) obj;

        if (!(java.util.Arrays.equals(this.oneBinary, other.oneBinary)))
            return false;
        if (!(java.util.Arrays.equals(this.calculatedOneBinary,
                other.calculatedOneBinary))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneBinary,
                other.persistedOneBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneBinary_5(" + oneBinary + ',' + calculatedOneBinary + ','
                + persistedOneBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[] oneBinary;

    @JsonProperty("oneBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[] getOneBinary() {
        return oneBinary;
    }

    public OneBinary_5 setOneBinary(final byte[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneBinary\" cannot be null!");
        this.oneBinary = value;

        return this;
    }

    private final byte[] calculatedOneBinary;

    public byte[] getCalculatedOneBinary() {
        return this.calculatedOneBinary;
    }

    private final byte[] persistedOneBinary;

    public byte[] getPersistedOneBinary() {
        return this.persistedOneBinary;
    }
}

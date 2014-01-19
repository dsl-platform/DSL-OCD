package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableBinary_4 implements java.io.Serializable {
    public NullableBinary_4(
            final byte[] nullableBinary,
            final byte[] calculatedNullableBinary,
            final byte[] persistedNullableBinary) {
        setNullableBinary(nullableBinary);
        this.calculatedNullableBinary = calculatedNullableBinary;
        this.persistedNullableBinary = persistedNullableBinary;
    }

    public NullableBinary_4() {
        this.calculatedNullableBinary = null;
        this.persistedNullableBinary = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 288928769;
        result = prime * result
                + (java.util.Arrays.hashCode(this.nullableBinary));
        result = prime * result
                + (java.util.Arrays.hashCode(this.calculatedNullableBinary));
        result = prime * result
                + (java.util.Arrays.hashCode(this.persistedNullableBinary));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableBinary_4)) return false;
        final NullableBinary_4 other = (NullableBinary_4) obj;

        if (!(java.util.Arrays
                .equals(this.nullableBinary, other.nullableBinary)))
            return false;
        if (!(java.util.Arrays.equals(this.calculatedNullableBinary,
                other.calculatedNullableBinary))) return false;
        if (!(java.util.Arrays.equals(this.persistedNullableBinary,
                other.persistedNullableBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableBinary_4(" + nullableBinary + ','
                + calculatedNullableBinary + ',' + persistedNullableBinary
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[] nullableBinary;

    @JsonProperty("nullableBinary")
    public byte[] getNullableBinary() {
        return nullableBinary;
    }

    public NullableBinary_4 setNullableBinary(final byte[] value) {
        this.nullableBinary = value;

        return this;
    }

    private final byte[] calculatedNullableBinary;

    public byte[] getCalculatedNullableBinary() {
        return this.calculatedNullableBinary;
    }

    private final byte[] persistedNullableBinary;

    public byte[] getPersistedNullableBinary() {
        return this.persistedNullableBinary;
    }
}

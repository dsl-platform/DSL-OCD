package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBinaries_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableBinaries_4(
            final byte[][] nullableArrayOfNullableBinaries,
            final byte[][] calculatedNullableArrayOfNullableBinaries,
            final byte[][] persistedNullableArrayOfNullableBinaries) {
        setNullableArrayOfNullableBinaries(nullableArrayOfNullableBinaries);
        this.calculatedNullableArrayOfNullableBinaries = calculatedNullableArrayOfNullableBinaries;
        this.persistedNullableArrayOfNullableBinaries = persistedNullableArrayOfNullableBinaries;
    }

    public NullableArrayOfNullableBinaries_4() {
        this.calculatedNullableArrayOfNullableBinaries = null;
        this.persistedNullableArrayOfNullableBinaries = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 25990566;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBinaries_4)) return false;
        final NullableArrayOfNullableBinaries_4 other = (NullableArrayOfNullableBinaries_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.nullableArrayOfNullableBinaries,
                other.nullableArrayOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedNullableArrayOfNullableBinaries,
                other.calculatedNullableArrayOfNullableBinaries)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedNullableArrayOfNullableBinaries,
                other.persistedNullableArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBinaries_4("
                + nullableArrayOfNullableBinaries + ','
                + calculatedNullableArrayOfNullableBinaries + ','
                + persistedNullableArrayOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfNullableBinaries;

    @JsonProperty("nullableArrayOfNullableBinaries")
    public byte[][] getNullableArrayOfNullableBinaries() {
        return nullableArrayOfNullableBinaries;
    }

    public NullableArrayOfNullableBinaries_4 setNullableArrayOfNullableBinaries(
            final byte[][] value) {
        this.nullableArrayOfNullableBinaries = value;

        return this;
    }

    private final byte[][] calculatedNullableArrayOfNullableBinaries;

    public byte[][] getCalculatedNullableArrayOfNullableBinaries() {
        return this.calculatedNullableArrayOfNullableBinaries;
    }

    private final byte[][] persistedNullableArrayOfNullableBinaries;

    public byte[][] getPersistedNullableArrayOfNullableBinaries() {
        return this.persistedNullableArrayOfNullableBinaries;
    }
}

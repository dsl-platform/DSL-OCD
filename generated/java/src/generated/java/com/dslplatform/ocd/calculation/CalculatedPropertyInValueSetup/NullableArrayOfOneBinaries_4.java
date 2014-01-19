package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneBinaries_4 implements java.io.Serializable {
    public NullableArrayOfOneBinaries_4(
            final byte[][] nullableArrayOfOneBinaries,
            final byte[][] calculatedNullableArrayOfOneBinaries,
            final byte[][] persistedNullableArrayOfOneBinaries) {
        setNullableArrayOfOneBinaries(nullableArrayOfOneBinaries);
        this.calculatedNullableArrayOfOneBinaries = calculatedNullableArrayOfOneBinaries;
        this.persistedNullableArrayOfOneBinaries = persistedNullableArrayOfOneBinaries;
    }

    public NullableArrayOfOneBinaries_4() {
        this.calculatedNullableArrayOfOneBinaries = null;
        this.persistedNullableArrayOfOneBinaries = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 866204413;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneBinaries_4)) return false;
        final NullableArrayOfOneBinaries_4 other = (NullableArrayOfOneBinaries_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.nullableArrayOfOneBinaries,
                other.nullableArrayOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedNullableArrayOfOneBinaries,
                other.calculatedNullableArrayOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedNullableArrayOfOneBinaries,
                other.persistedNullableArrayOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneBinaries_4(" + nullableArrayOfOneBinaries
                + ',' + calculatedNullableArrayOfOneBinaries + ','
                + persistedNullableArrayOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfOneBinaries;

    @JsonProperty("nullableArrayOfOneBinaries")
    public byte[][] getNullableArrayOfOneBinaries() {
        return nullableArrayOfOneBinaries;
    }

    public NullableArrayOfOneBinaries_4 setNullableArrayOfOneBinaries(
            final byte[][] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneBinaries = value;

        return this;
    }

    private final byte[][] calculatedNullableArrayOfOneBinaries;

    public byte[][] getCalculatedNullableArrayOfOneBinaries() {
        return this.calculatedNullableArrayOfOneBinaries;
    }

    private final byte[][] persistedNullableArrayOfOneBinaries;

    public byte[][] getPersistedNullableArrayOfOneBinaries() {
        return this.persistedNullableArrayOfOneBinaries;
    }
}

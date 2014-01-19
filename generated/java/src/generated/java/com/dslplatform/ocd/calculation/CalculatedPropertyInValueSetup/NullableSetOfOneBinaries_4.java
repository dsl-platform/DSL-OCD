package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneBinaries_4 implements java.io.Serializable {
    public NullableSetOfOneBinaries_4(
            final java.util.Set<byte[]> nullableSetOfOneBinaries,
            final java.util.Set<byte[]> calculatedNullableSetOfOneBinaries,
            final java.util.Set<byte[]> persistedNullableSetOfOneBinaries) {
        setNullableSetOfOneBinaries(nullableSetOfOneBinaries);
        this.calculatedNullableSetOfOneBinaries = calculatedNullableSetOfOneBinaries;
        this.persistedNullableSetOfOneBinaries = persistedNullableSetOfOneBinaries;
    }

    public NullableSetOfOneBinaries_4() {
        this.calculatedNullableSetOfOneBinaries = null;
        this.persistedNullableSetOfOneBinaries = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1989267122;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneBinaries_4)) return false;
        final NullableSetOfOneBinaries_4 other = (NullableSetOfOneBinaries_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.nullableSetOfOneBinaries, other.nullableSetOfOneBinaries)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedNullableSetOfOneBinaries,
                other.calculatedNullableSetOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedNullableSetOfOneBinaries,
                other.persistedNullableSetOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneBinaries_4(" + nullableSetOfOneBinaries + ','
                + calculatedNullableSetOfOneBinaries + ','
                + persistedNullableSetOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> nullableSetOfOneBinaries;

    @JsonProperty("nullableSetOfOneBinaries")
    public java.util.Set<byte[]> getNullableSetOfOneBinaries() {
        return nullableSetOfOneBinaries;
    }

    public NullableSetOfOneBinaries_4 setNullableSetOfOneBinaries(
            final java.util.Set<byte[]> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneBinaries = value;

        return this;
    }

    private final java.util.Set<byte[]> calculatedNullableSetOfOneBinaries;

    public java.util.Set<byte[]> getCalculatedNullableSetOfOneBinaries() {
        return this.calculatedNullableSetOfOneBinaries;
    }

    private final java.util.Set<byte[]> persistedNullableSetOfOneBinaries;

    public java.util.Set<byte[]> getPersistedNullableSetOfOneBinaries() {
        return this.persistedNullableSetOfOneBinaries;
    }
}

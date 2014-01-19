package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableBinaries_4 implements
        java.io.Serializable {
    public NullableSetOfNullableBinaries_4(
            final java.util.Set<byte[]> nullableSetOfNullableBinaries,
            final java.util.Set<byte[]> calculatedNullableSetOfNullableBinaries,
            final java.util.Set<byte[]> persistedNullableSetOfNullableBinaries) {
        setNullableSetOfNullableBinaries(nullableSetOfNullableBinaries);
        this.calculatedNullableSetOfNullableBinaries = calculatedNullableSetOfNullableBinaries;
        this.persistedNullableSetOfNullableBinaries = persistedNullableSetOfNullableBinaries;
    }

    public NullableSetOfNullableBinaries_4() {
        this.calculatedNullableSetOfNullableBinaries = null;
        this.persistedNullableSetOfNullableBinaries = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 29428715;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableBinaries_4)) return false;
        final NullableSetOfNullableBinaries_4 other = (NullableSetOfNullableBinaries_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.nullableSetOfNullableBinaries,
                other.nullableSetOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedNullableSetOfNullableBinaries,
                other.calculatedNullableSetOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedNullableSetOfNullableBinaries,
                other.persistedNullableSetOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableBinaries_4("
                + nullableSetOfNullableBinaries + ','
                + calculatedNullableSetOfNullableBinaries + ','
                + persistedNullableSetOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> nullableSetOfNullableBinaries;

    @JsonProperty("nullableSetOfNullableBinaries")
    public java.util.Set<byte[]> getNullableSetOfNullableBinaries() {
        return nullableSetOfNullableBinaries;
    }

    public NullableSetOfNullableBinaries_4 setNullableSetOfNullableBinaries(
            final java.util.Set<byte[]> value) {
        this.nullableSetOfNullableBinaries = value;

        return this;
    }

    private final java.util.Set<byte[]> calculatedNullableSetOfNullableBinaries;

    public java.util.Set<byte[]> getCalculatedNullableSetOfNullableBinaries() {
        return this.calculatedNullableSetOfNullableBinaries;
    }

    private final java.util.Set<byte[]> persistedNullableSetOfNullableBinaries;

    public java.util.Set<byte[]> getPersistedNullableSetOfNullableBinaries() {
        return this.persistedNullableSetOfNullableBinaries;
    }
}

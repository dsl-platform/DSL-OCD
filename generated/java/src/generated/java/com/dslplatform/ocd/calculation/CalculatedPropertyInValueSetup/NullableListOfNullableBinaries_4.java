package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableBinaries_4 implements
        java.io.Serializable {
    public NullableListOfNullableBinaries_4(
            final java.util.List<byte[]> nullableListOfNullableBinaries,
            final java.util.List<byte[]> calculatedNullableListOfNullableBinaries,
            final java.util.List<byte[]> persistedNullableListOfNullableBinaries) {
        setNullableListOfNullableBinaries(nullableListOfNullableBinaries);
        this.calculatedNullableListOfNullableBinaries = calculatedNullableListOfNullableBinaries;
        this.persistedNullableListOfNullableBinaries = persistedNullableListOfNullableBinaries;
    }

    public NullableListOfNullableBinaries_4() {
        this.calculatedNullableListOfNullableBinaries = null;
        this.persistedNullableListOfNullableBinaries = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 641652855;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableBinaries_4)) return false;
        final NullableListOfNullableBinaries_4 other = (NullableListOfNullableBinaries_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.nullableListOfNullableBinaries,
                other.nullableListOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedNullableListOfNullableBinaries,
                other.calculatedNullableListOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedNullableListOfNullableBinaries,
                other.persistedNullableListOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableBinaries_4("
                + nullableListOfNullableBinaries + ','
                + calculatedNullableListOfNullableBinaries + ','
                + persistedNullableListOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> nullableListOfNullableBinaries;

    @JsonProperty("nullableListOfNullableBinaries")
    public java.util.List<byte[]> getNullableListOfNullableBinaries() {
        return nullableListOfNullableBinaries;
    }

    public NullableListOfNullableBinaries_4 setNullableListOfNullableBinaries(
            final java.util.List<byte[]> value) {
        this.nullableListOfNullableBinaries = value;

        return this;
    }

    private final java.util.List<byte[]> calculatedNullableListOfNullableBinaries;

    public java.util.List<byte[]> getCalculatedNullableListOfNullableBinaries() {
        return this.calculatedNullableListOfNullableBinaries;
    }

    private final java.util.List<byte[]> persistedNullableListOfNullableBinaries;

    public java.util.List<byte[]> getPersistedNullableListOfNullableBinaries() {
        return this.persistedNullableListOfNullableBinaries;
    }
}

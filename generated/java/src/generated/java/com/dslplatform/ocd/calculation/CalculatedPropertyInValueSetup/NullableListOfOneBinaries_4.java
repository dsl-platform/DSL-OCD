package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneBinaries_4 implements java.io.Serializable {
    public NullableListOfOneBinaries_4(
            final java.util.List<byte[]> nullableListOfOneBinaries,
            final java.util.List<byte[]> calculatedNullableListOfOneBinaries,
            final java.util.List<byte[]> persistedNullableListOfOneBinaries) {
        setNullableListOfOneBinaries(nullableListOfOneBinaries);
        this.calculatedNullableListOfOneBinaries = calculatedNullableListOfOneBinaries;
        this.persistedNullableListOfOneBinaries = persistedNullableListOfOneBinaries;
    }

    public NullableListOfOneBinaries_4() {
        this.calculatedNullableListOfOneBinaries = null;
        this.persistedNullableListOfOneBinaries = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1880347032;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneBinaries_4)) return false;
        final NullableListOfOneBinaries_4 other = (NullableListOfOneBinaries_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards
                .compareBinary(this.nullableListOfOneBinaries,
                        other.nullableListOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedNullableListOfOneBinaries,
                other.calculatedNullableListOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedNullableListOfOneBinaries,
                other.persistedNullableListOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneBinaries_4(" + nullableListOfOneBinaries + ','
                + calculatedNullableListOfOneBinaries + ','
                + persistedNullableListOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> nullableListOfOneBinaries;

    @JsonProperty("nullableListOfOneBinaries")
    public java.util.List<byte[]> getNullableListOfOneBinaries() {
        return nullableListOfOneBinaries;
    }

    public NullableListOfOneBinaries_4 setNullableListOfOneBinaries(
            final java.util.List<byte[]> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneBinaries = value;

        return this;
    }

    private final java.util.List<byte[]> calculatedNullableListOfOneBinaries;

    public java.util.List<byte[]> getCalculatedNullableListOfOneBinaries() {
        return this.calculatedNullableListOfOneBinaries;
    }

    private final java.util.List<byte[]> persistedNullableListOfOneBinaries;

    public java.util.List<byte[]> getPersistedNullableListOfOneBinaries() {
        return this.persistedNullableListOfOneBinaries;
    }
}

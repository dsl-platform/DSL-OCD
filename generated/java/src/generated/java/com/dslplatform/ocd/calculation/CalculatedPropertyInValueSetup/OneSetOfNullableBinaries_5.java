package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableBinaries_5 implements java.io.Serializable {
    public OneSetOfNullableBinaries_5(
            final java.util.Set<byte[]> oneSetOfNullableBinaries,
            final java.util.Set<byte[]> calculatedOneSetOfNullableBinaries,
            final java.util.Set<byte[]> persistedOneSetOfNullableBinaries) {
        setOneSetOfNullableBinaries(oneSetOfNullableBinaries);
        this.calculatedOneSetOfNullableBinaries = calculatedOneSetOfNullableBinaries;
        this.persistedOneSetOfNullableBinaries = persistedOneSetOfNullableBinaries;
    }

    public OneSetOfNullableBinaries_5() {
        this.oneSetOfNullableBinaries = new java.util.HashSet<byte[]>();
        this.calculatedOneSetOfNullableBinaries = new java.util.HashSet<byte[]>();
        this.persistedOneSetOfNullableBinaries = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1318433197;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableBinaries_5)) return false;
        final OneSetOfNullableBinaries_5 other = (OneSetOfNullableBinaries_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.oneSetOfNullableBinaries, other.oneSetOfNullableBinaries)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedOneSetOfNullableBinaries,
                other.calculatedOneSetOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedOneSetOfNullableBinaries,
                other.persistedOneSetOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableBinaries_5(" + oneSetOfNullableBinaries + ','
                + calculatedOneSetOfNullableBinaries + ','
                + persistedOneSetOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> oneSetOfNullableBinaries;

    @JsonProperty("oneSetOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getOneSetOfNullableBinaries() {
        return oneSetOfNullableBinaries;
    }

    public OneSetOfNullableBinaries_5 setOneSetOfNullableBinaries(
            final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableBinaries\" cannot be null!");
        this.oneSetOfNullableBinaries = value;

        return this;
    }

    private final java.util.Set<byte[]> calculatedOneSetOfNullableBinaries;

    public java.util.Set<byte[]> getCalculatedOneSetOfNullableBinaries() {
        return this.calculatedOneSetOfNullableBinaries;
    }

    private final java.util.Set<byte[]> persistedOneSetOfNullableBinaries;

    public java.util.Set<byte[]> getPersistedOneSetOfNullableBinaries() {
        return this.persistedOneSetOfNullableBinaries;
    }
}

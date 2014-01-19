package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneBinaries_5 implements java.io.Serializable {
    public OneSetOfOneBinaries_5(
            final java.util.Set<byte[]> oneSetOfOneBinaries,
            final java.util.Set<byte[]> calculatedOneSetOfOneBinaries,
            final java.util.Set<byte[]> persistedOneSetOfOneBinaries) {
        setOneSetOfOneBinaries(oneSetOfOneBinaries);
        this.calculatedOneSetOfOneBinaries = calculatedOneSetOfOneBinaries;
        this.persistedOneSetOfOneBinaries = persistedOneSetOfOneBinaries;
    }

    public OneSetOfOneBinaries_5() {
        this.oneSetOfOneBinaries = new java.util.HashSet<byte[]>();
        this.calculatedOneSetOfOneBinaries = new java.util.HashSet<byte[]>();
        this.persistedOneSetOfOneBinaries = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 826238280;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneBinaries_5)) return false;
        final OneSetOfOneBinaries_5 other = (OneSetOfOneBinaries_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.oneSetOfOneBinaries, other.oneSetOfOneBinaries)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedOneSetOfOneBinaries,
                other.calculatedOneSetOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedOneSetOfOneBinaries,
                other.persistedOneSetOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneBinaries_5(" + oneSetOfOneBinaries + ','
                + calculatedOneSetOfOneBinaries + ','
                + persistedOneSetOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> oneSetOfOneBinaries;

    @JsonProperty("oneSetOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getOneSetOfOneBinaries() {
        return oneSetOfOneBinaries;
    }

    public OneSetOfOneBinaries_5 setOneSetOfOneBinaries(
            final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneBinaries = value;

        return this;
    }

    private final java.util.Set<byte[]> calculatedOneSetOfOneBinaries;

    public java.util.Set<byte[]> getCalculatedOneSetOfOneBinaries() {
        return this.calculatedOneSetOfOneBinaries;
    }

    private final java.util.Set<byte[]> persistedOneSetOfOneBinaries;

    public java.util.Set<byte[]> getPersistedOneSetOfOneBinaries() {
        return this.persistedOneSetOfOneBinaries;
    }
}

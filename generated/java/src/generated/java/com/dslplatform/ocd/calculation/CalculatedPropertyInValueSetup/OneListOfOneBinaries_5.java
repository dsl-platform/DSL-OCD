package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneBinaries_5 implements java.io.Serializable {
    public OneListOfOneBinaries_5(
            final java.util.List<byte[]> oneListOfOneBinaries,
            final java.util.List<byte[]> calculatedOneListOfOneBinaries,
            final java.util.List<byte[]> persistedOneListOfOneBinaries) {
        setOneListOfOneBinaries(oneListOfOneBinaries);
        this.calculatedOneListOfOneBinaries = calculatedOneListOfOneBinaries;
        this.persistedOneListOfOneBinaries = persistedOneListOfOneBinaries;
    }

    public OneListOfOneBinaries_5() {
        this.oneListOfOneBinaries = new java.util.ArrayList<byte[]>();
        this.calculatedOneListOfOneBinaries = new java.util.ArrayList<byte[]>();
        this.persistedOneListOfOneBinaries = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1652093492;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneBinaries_5)) return false;
        final OneListOfOneBinaries_5 other = (OneListOfOneBinaries_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.oneListOfOneBinaries, other.oneListOfOneBinaries)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedOneListOfOneBinaries,
                other.calculatedOneListOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedOneListOfOneBinaries,
                other.persistedOneListOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneBinaries_5(" + oneListOfOneBinaries + ','
                + calculatedOneListOfOneBinaries + ','
                + persistedOneListOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> oneListOfOneBinaries;

    @JsonProperty("oneListOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getOneListOfOneBinaries() {
        return oneListOfOneBinaries;
    }

    public OneListOfOneBinaries_5 setOneListOfOneBinaries(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneBinaries = value;

        return this;
    }

    private final java.util.List<byte[]> calculatedOneListOfOneBinaries;

    public java.util.List<byte[]> getCalculatedOneListOfOneBinaries() {
        return this.calculatedOneListOfOneBinaries;
    }

    private final java.util.List<byte[]> persistedOneListOfOneBinaries;

    public java.util.List<byte[]> getPersistedOneListOfOneBinaries() {
        return this.persistedOneListOfOneBinaries;
    }
}

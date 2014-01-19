package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableBinaries_5 implements java.io.Serializable {
    public OneListOfNullableBinaries_5(
            final java.util.List<byte[]> oneListOfNullableBinaries,
            final java.util.List<byte[]> calculatedOneListOfNullableBinaries,
            final java.util.List<byte[]> persistedOneListOfNullableBinaries) {
        setOneListOfNullableBinaries(oneListOfNullableBinaries);
        this.calculatedOneListOfNullableBinaries = calculatedOneListOfNullableBinaries;
        this.persistedOneListOfNullableBinaries = persistedOneListOfNullableBinaries;
    }

    public OneListOfNullableBinaries_5() {
        this.oneListOfNullableBinaries = new java.util.ArrayList<byte[]>();
        this.calculatedOneListOfNullableBinaries = new java.util.ArrayList<byte[]>();
        this.persistedOneListOfNullableBinaries = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1595983805;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableBinaries_5)) return false;
        final OneListOfNullableBinaries_5 other = (OneListOfNullableBinaries_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards
                .compareBinary(this.oneListOfNullableBinaries,
                        other.oneListOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedOneListOfNullableBinaries,
                other.calculatedOneListOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedOneListOfNullableBinaries,
                other.persistedOneListOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableBinaries_5(" + oneListOfNullableBinaries + ','
                + calculatedOneListOfNullableBinaries + ','
                + persistedOneListOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> oneListOfNullableBinaries;

    @JsonProperty("oneListOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getOneListOfNullableBinaries() {
        return oneListOfNullableBinaries;
    }

    public OneListOfNullableBinaries_5 setOneListOfNullableBinaries(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableBinaries\" cannot be null!");
        this.oneListOfNullableBinaries = value;

        return this;
    }

    private final java.util.List<byte[]> calculatedOneListOfNullableBinaries;

    public java.util.List<byte[]> getCalculatedOneListOfNullableBinaries() {
        return this.calculatedOneListOfNullableBinaries;
    }

    private final java.util.List<byte[]> persistedOneListOfNullableBinaries;

    public java.util.List<byte[]> getPersistedOneListOfNullableBinaries() {
        return this.persistedOneListOfNullableBinaries;
    }
}

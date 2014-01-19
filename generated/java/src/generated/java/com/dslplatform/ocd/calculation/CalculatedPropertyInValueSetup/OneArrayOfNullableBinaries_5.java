package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBinaries_5 implements java.io.Serializable {
    public OneArrayOfNullableBinaries_5(
            final byte[][] oneArrayOfNullableBinaries,
            final byte[][] calculatedOneArrayOfNullableBinaries,
            final byte[][] persistedOneArrayOfNullableBinaries) {
        setOneArrayOfNullableBinaries(oneArrayOfNullableBinaries);
        this.calculatedOneArrayOfNullableBinaries = calculatedOneArrayOfNullableBinaries;
        this.persistedOneArrayOfNullableBinaries = persistedOneArrayOfNullableBinaries;
    }

    public OneArrayOfNullableBinaries_5() {
        this.oneArrayOfNullableBinaries = new byte[][] {};
        this.calculatedOneArrayOfNullableBinaries = new byte[][] {};
        this.persistedOneArrayOfNullableBinaries = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 429272658;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBinaries_5)) return false;
        final OneArrayOfNullableBinaries_5 other = (OneArrayOfNullableBinaries_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.oneArrayOfNullableBinaries,
                other.oneArrayOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedOneArrayOfNullableBinaries,
                other.calculatedOneArrayOfNullableBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedOneArrayOfNullableBinaries,
                other.persistedOneArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBinaries_5(" + oneArrayOfNullableBinaries
                + ',' + calculatedOneArrayOfNullableBinaries + ','
                + persistedOneArrayOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] oneArrayOfNullableBinaries;

    @JsonProperty("oneArrayOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfNullableBinaries() {
        return oneArrayOfNullableBinaries;
    }

    public OneArrayOfNullableBinaries_5 setOneArrayOfNullableBinaries(
            final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBinaries\" cannot be null!");
        this.oneArrayOfNullableBinaries = value;

        return this;
    }

    private final byte[][] calculatedOneArrayOfNullableBinaries;

    public byte[][] getCalculatedOneArrayOfNullableBinaries() {
        return this.calculatedOneArrayOfNullableBinaries;
    }

    private final byte[][] persistedOneArrayOfNullableBinaries;

    public byte[][] getPersistedOneArrayOfNullableBinaries() {
        return this.persistedOneArrayOfNullableBinaries;
    }
}

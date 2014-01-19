package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneBinaries_5 implements java.io.Serializable {
    public OneArrayOfOneBinaries_5(
            final byte[][] oneArrayOfOneBinaries,
            final byte[][] calculatedOneArrayOfOneBinaries,
            final byte[][] persistedOneArrayOfOneBinaries) {
        setOneArrayOfOneBinaries(oneArrayOfOneBinaries);
        this.calculatedOneArrayOfOneBinaries = calculatedOneArrayOfOneBinaries;
        this.persistedOneArrayOfOneBinaries = persistedOneArrayOfOneBinaries;
    }

    public OneArrayOfOneBinaries_5() {
        this.oneArrayOfOneBinaries = new byte[][] {};
        this.calculatedOneArrayOfOneBinaries = new byte[][] {};
        this.persistedOneArrayOfOneBinaries = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 886027327;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneBinaries_5)) return false;
        final OneArrayOfOneBinaries_5 other = (OneArrayOfOneBinaries_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.oneArrayOfOneBinaries, other.oneArrayOfOneBinaries)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.calculatedOneArrayOfOneBinaries,
                other.calculatedOneArrayOfOneBinaries))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBinary(
                this.persistedOneArrayOfOneBinaries,
                other.persistedOneArrayOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneBinaries_5(" + oneArrayOfOneBinaries + ','
                + calculatedOneArrayOfOneBinaries + ','
                + persistedOneArrayOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] oneArrayOfOneBinaries;

    @JsonProperty("oneArrayOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfOneBinaries() {
        return oneArrayOfOneBinaries;
    }

    public OneArrayOfOneBinaries_5 setOneArrayOfOneBinaries(final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneBinaries = value;

        return this;
    }

    private final byte[][] calculatedOneArrayOfOneBinaries;

    public byte[][] getCalculatedOneArrayOfOneBinaries() {
        return this.calculatedOneArrayOfOneBinaries;
    }

    private final byte[][] persistedOneArrayOfOneBinaries;

    public byte[][] getPersistedOneArrayOfOneBinaries() {
        return this.persistedOneArrayOfOneBinaries;
    }
}

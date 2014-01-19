package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneStringsWithMaxLengthOf9_5 implements
        java.io.Serializable {
    public OneArrayOfOneStringsWithMaxLengthOf9_5(
            final String[] oneArrayOfOneStringsWithMaxLengthOf9,
            final String[] calculatedOneArrayOfOneStringsWithMaxLengthOf9,
            final String[] persistedOneArrayOfOneStringsWithMaxLengthOf9) {
        setOneArrayOfOneStringsWithMaxLengthOf9(oneArrayOfOneStringsWithMaxLengthOf9);
        this.calculatedOneArrayOfOneStringsWithMaxLengthOf9 = calculatedOneArrayOfOneStringsWithMaxLengthOf9;
        this.persistedOneArrayOfOneStringsWithMaxLengthOf9 = persistedOneArrayOfOneStringsWithMaxLengthOf9;
    }

    public OneArrayOfOneStringsWithMaxLengthOf9_5() {
        this.oneArrayOfOneStringsWithMaxLengthOf9 = new String[] {};
        this.calculatedOneArrayOfOneStringsWithMaxLengthOf9 = new String[] {};
        this.persistedOneArrayOfOneStringsWithMaxLengthOf9 = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1037804006;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneStringsWithMaxLengthOf9_5))
            return false;
        final OneArrayOfOneStringsWithMaxLengthOf9_5 other = (OneArrayOfOneStringsWithMaxLengthOf9_5) obj;

        if (!(java.util.Arrays.equals(
                this.oneArrayOfOneStringsWithMaxLengthOf9,
                other.oneArrayOfOneStringsWithMaxLengthOf9))) return false;
        if (!(java.util.Arrays.equals(
                this.calculatedOneArrayOfOneStringsWithMaxLengthOf9,
                other.calculatedOneArrayOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(java.util.Arrays.equals(
                this.persistedOneArrayOfOneStringsWithMaxLengthOf9,
                other.persistedOneArrayOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneStringsWithMaxLengthOf9_5("
                + oneArrayOfOneStringsWithMaxLengthOf9 + ','
                + calculatedOneArrayOfOneStringsWithMaxLengthOf9 + ','
                + persistedOneArrayOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneStringsWithMaxLengthOf9() {
        return oneArrayOfOneStringsWithMaxLengthOf9;
    }

    public OneArrayOfOneStringsWithMaxLengthOf9_5 setOneArrayOfOneStringsWithMaxLengthOf9(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneArrayOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final String[] calculatedOneArrayOfOneStringsWithMaxLengthOf9;

    public String[] getCalculatedOneArrayOfOneStringsWithMaxLengthOf9() {
        return this.calculatedOneArrayOfOneStringsWithMaxLengthOf9;
    }

    private final String[] persistedOneArrayOfOneStringsWithMaxLengthOf9;

    public String[] getPersistedOneArrayOfOneStringsWithMaxLengthOf9() {
        return this.persistedOneArrayOfOneStringsWithMaxLengthOf9;
    }
}

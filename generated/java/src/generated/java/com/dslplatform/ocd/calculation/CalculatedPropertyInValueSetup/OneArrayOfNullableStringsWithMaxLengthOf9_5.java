package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableStringsWithMaxLengthOf9_5 implements
        java.io.Serializable {
    public OneArrayOfNullableStringsWithMaxLengthOf9_5(
            final String[] oneArrayOfNullableStringsWithMaxLengthOf9,
            final String[] calculatedOneArrayOfNullableStringsWithMaxLengthOf9,
            final String[] persistedOneArrayOfNullableStringsWithMaxLengthOf9) {
        setOneArrayOfNullableStringsWithMaxLengthOf9(oneArrayOfNullableStringsWithMaxLengthOf9);
        this.calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = calculatedOneArrayOfNullableStringsWithMaxLengthOf9;
        this.persistedOneArrayOfNullableStringsWithMaxLengthOf9 = persistedOneArrayOfNullableStringsWithMaxLengthOf9;
    }

    public OneArrayOfNullableStringsWithMaxLengthOf9_5() {
        this.oneArrayOfNullableStringsWithMaxLengthOf9 = new String[] {};
        this.calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = new String[] {};
        this.persistedOneArrayOfNullableStringsWithMaxLengthOf9 = new String[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 831490541;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableStringsWithMaxLengthOf9_5))
            return false;
        final OneArrayOfNullableStringsWithMaxLengthOf9_5 other = (OneArrayOfNullableStringsWithMaxLengthOf9_5) obj;

        if (!(java.util.Arrays.equals(
                this.oneArrayOfNullableStringsWithMaxLengthOf9,
                other.oneArrayOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(java.util.Arrays.equals(
                this.calculatedOneArrayOfNullableStringsWithMaxLengthOf9,
                other.calculatedOneArrayOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(java.util.Arrays.equals(
                this.persistedOneArrayOfNullableStringsWithMaxLengthOf9,
                other.persistedOneArrayOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableStringsWithMaxLengthOf9_5("
                + oneArrayOfNullableStringsWithMaxLengthOf9 + ','
                + calculatedOneArrayOfNullableStringsWithMaxLengthOf9 + ','
                + persistedOneArrayOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] oneArrayOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("oneArrayOfNullableStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfNullableStringsWithMaxLengthOf9() {
        return oneArrayOfNullableStringsWithMaxLengthOf9;
    }

    public OneArrayOfNullableStringsWithMaxLengthOf9_5 setOneArrayOfNullableStringsWithMaxLengthOf9(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneArrayOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final String[] calculatedOneArrayOfNullableStringsWithMaxLengthOf9;

    public String[] getCalculatedOneArrayOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedOneArrayOfNullableStringsWithMaxLengthOf9;
    }

    private final String[] persistedOneArrayOfNullableStringsWithMaxLengthOf9;

    public String[] getPersistedOneArrayOfNullableStringsWithMaxLengthOf9() {
        return this.persistedOneArrayOfNullableStringsWithMaxLengthOf9;
    }
}

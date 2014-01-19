package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableStringsWithMaxLengthOf9_5 implements
        java.io.Serializable {
    public OneListOfNullableStringsWithMaxLengthOf9_5(
            final java.util.List<String> oneListOfNullableStringsWithMaxLengthOf9,
            final java.util.List<String> calculatedOneListOfNullableStringsWithMaxLengthOf9,
            final java.util.List<String> persistedOneListOfNullableStringsWithMaxLengthOf9) {
        setOneListOfNullableStringsWithMaxLengthOf9(oneListOfNullableStringsWithMaxLengthOf9);
        this.calculatedOneListOfNullableStringsWithMaxLengthOf9 = calculatedOneListOfNullableStringsWithMaxLengthOf9;
        this.persistedOneListOfNullableStringsWithMaxLengthOf9 = persistedOneListOfNullableStringsWithMaxLengthOf9;
    }

    public OneListOfNullableStringsWithMaxLengthOf9_5() {
        this.oneListOfNullableStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
        this.calculatedOneListOfNullableStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
        this.persistedOneListOfNullableStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2073906010;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableStringsWithMaxLengthOf9_5))
            return false;
        final OneListOfNullableStringsWithMaxLengthOf9_5 other = (OneListOfNullableStringsWithMaxLengthOf9_5) obj;

        if (!(this.oneListOfNullableStringsWithMaxLengthOf9
                .equals(other.oneListOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedOneListOfNullableStringsWithMaxLengthOf9
                .equals(other.calculatedOneListOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedOneListOfNullableStringsWithMaxLengthOf9
                .equals(other.persistedOneListOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableStringsWithMaxLengthOf9_5("
                + oneListOfNullableStringsWithMaxLengthOf9 + ','
                + calculatedOneListOfNullableStringsWithMaxLengthOf9 + ','
                + persistedOneListOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("oneListOfNullableStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableStringsWithMaxLengthOf9() {
        return oneListOfNullableStringsWithMaxLengthOf9;
    }

    public OneListOfNullableStringsWithMaxLengthOf9_5 setOneListOfNullableStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneListOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.List<String> calculatedOneListOfNullableStringsWithMaxLengthOf9;

    public java.util.List<String> getCalculatedOneListOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedOneListOfNullableStringsWithMaxLengthOf9;
    }

    private final java.util.List<String> persistedOneListOfNullableStringsWithMaxLengthOf9;

    public java.util.List<String> getPersistedOneListOfNullableStringsWithMaxLengthOf9() {
        return this.persistedOneListOfNullableStringsWithMaxLengthOf9;
    }
}

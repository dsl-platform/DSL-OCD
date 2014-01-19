package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableStringsWithMaxLengthOf9_5 implements
        java.io.Serializable {
    public OneSetOfNullableStringsWithMaxLengthOf9_5(
            final java.util.Set<String> oneSetOfNullableStringsWithMaxLengthOf9,
            final java.util.Set<String> calculatedOneSetOfNullableStringsWithMaxLengthOf9,
            final java.util.Set<String> persistedOneSetOfNullableStringsWithMaxLengthOf9) {
        setOneSetOfNullableStringsWithMaxLengthOf9(oneSetOfNullableStringsWithMaxLengthOf9);
        this.calculatedOneSetOfNullableStringsWithMaxLengthOf9 = calculatedOneSetOfNullableStringsWithMaxLengthOf9;
        this.persistedOneSetOfNullableStringsWithMaxLengthOf9 = persistedOneSetOfNullableStringsWithMaxLengthOf9;
    }

    public OneSetOfNullableStringsWithMaxLengthOf9_5() {
        this.oneSetOfNullableStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
        this.calculatedOneSetOfNullableStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
        this.persistedOneSetOfNullableStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1894240058;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableStringsWithMaxLengthOf9_5))
            return false;
        final OneSetOfNullableStringsWithMaxLengthOf9_5 other = (OneSetOfNullableStringsWithMaxLengthOf9_5) obj;

        if (!(this.oneSetOfNullableStringsWithMaxLengthOf9
                .equals(other.oneSetOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedOneSetOfNullableStringsWithMaxLengthOf9
                .equals(other.calculatedOneSetOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedOneSetOfNullableStringsWithMaxLengthOf9
                .equals(other.persistedOneSetOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableStringsWithMaxLengthOf9_5("
                + oneSetOfNullableStringsWithMaxLengthOf9 + ','
                + calculatedOneSetOfNullableStringsWithMaxLengthOf9 + ','
                + persistedOneSetOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("oneSetOfNullableStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfNullableStringsWithMaxLengthOf9() {
        return oneSetOfNullableStringsWithMaxLengthOf9;
    }

    public OneSetOfNullableStringsWithMaxLengthOf9_5 setOneSetOfNullableStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneSetOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.Set<String> calculatedOneSetOfNullableStringsWithMaxLengthOf9;

    public java.util.Set<String> getCalculatedOneSetOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedOneSetOfNullableStringsWithMaxLengthOf9;
    }

    private final java.util.Set<String> persistedOneSetOfNullableStringsWithMaxLengthOf9;

    public java.util.Set<String> getPersistedOneSetOfNullableStringsWithMaxLengthOf9() {
        return this.persistedOneSetOfNullableStringsWithMaxLengthOf9;
    }
}

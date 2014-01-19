package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneStringsWithMaxLengthOf9_5 implements
        java.io.Serializable {
    public OneSetOfOneStringsWithMaxLengthOf9_5(
            final java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9,
            final java.util.Set<String> calculatedOneSetOfOneStringsWithMaxLengthOf9,
            final java.util.Set<String> persistedOneSetOfOneStringsWithMaxLengthOf9) {
        setOneSetOfOneStringsWithMaxLengthOf9(oneSetOfOneStringsWithMaxLengthOf9);
        this.calculatedOneSetOfOneStringsWithMaxLengthOf9 = calculatedOneSetOfOneStringsWithMaxLengthOf9;
        this.persistedOneSetOfOneStringsWithMaxLengthOf9 = persistedOneSetOfOneStringsWithMaxLengthOf9;
    }

    public OneSetOfOneStringsWithMaxLengthOf9_5() {
        this.oneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
        this.calculatedOneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
        this.persistedOneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2074074897;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneStringsWithMaxLengthOf9_5))
            return false;
        final OneSetOfOneStringsWithMaxLengthOf9_5 other = (OneSetOfOneStringsWithMaxLengthOf9_5) obj;

        if (!(this.oneSetOfOneStringsWithMaxLengthOf9
                .equals(other.oneSetOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedOneSetOfOneStringsWithMaxLengthOf9
                .equals(other.calculatedOneSetOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedOneSetOfOneStringsWithMaxLengthOf9
                .equals(other.persistedOneSetOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneStringsWithMaxLengthOf9_5("
                + oneSetOfOneStringsWithMaxLengthOf9 + ','
                + calculatedOneSetOfOneStringsWithMaxLengthOf9 + ','
                + persistedOneSetOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneSetOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneStringsWithMaxLengthOf9() {
        return oneSetOfOneStringsWithMaxLengthOf9;
    }

    public OneSetOfOneStringsWithMaxLengthOf9_5 setOneSetOfOneStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneSetOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.Set<String> calculatedOneSetOfOneStringsWithMaxLengthOf9;

    public java.util.Set<String> getCalculatedOneSetOfOneStringsWithMaxLengthOf9() {
        return this.calculatedOneSetOfOneStringsWithMaxLengthOf9;
    }

    private final java.util.Set<String> persistedOneSetOfOneStringsWithMaxLengthOf9;

    public java.util.Set<String> getPersistedOneSetOfOneStringsWithMaxLengthOf9() {
        return this.persistedOneSetOfOneStringsWithMaxLengthOf9;
    }
}

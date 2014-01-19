package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneStringsWithMaxLengthOf9_5 implements
        java.io.Serializable {
    public OneListOfOneStringsWithMaxLengthOf9_5(
            final java.util.List<String> oneListOfOneStringsWithMaxLengthOf9,
            final java.util.List<String> calculatedOneListOfOneStringsWithMaxLengthOf9,
            final java.util.List<String> persistedOneListOfOneStringsWithMaxLengthOf9) {
        setOneListOfOneStringsWithMaxLengthOf9(oneListOfOneStringsWithMaxLengthOf9);
        this.calculatedOneListOfOneStringsWithMaxLengthOf9 = calculatedOneListOfOneStringsWithMaxLengthOf9;
        this.persistedOneListOfOneStringsWithMaxLengthOf9 = persistedOneListOfOneStringsWithMaxLengthOf9;
    }

    public OneListOfOneStringsWithMaxLengthOf9_5() {
        this.oneListOfOneStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
        this.calculatedOneListOfOneStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
        this.persistedOneListOfOneStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1322550855;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneStringsWithMaxLengthOf9_5))
            return false;
        final OneListOfOneStringsWithMaxLengthOf9_5 other = (OneListOfOneStringsWithMaxLengthOf9_5) obj;

        if (!(this.oneListOfOneStringsWithMaxLengthOf9
                .equals(other.oneListOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedOneListOfOneStringsWithMaxLengthOf9
                .equals(other.calculatedOneListOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedOneListOfOneStringsWithMaxLengthOf9
                .equals(other.persistedOneListOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneStringsWithMaxLengthOf9_5("
                + oneListOfOneStringsWithMaxLengthOf9 + ','
                + calculatedOneListOfOneStringsWithMaxLengthOf9 + ','
                + persistedOneListOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneListOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneStringsWithMaxLengthOf9() {
        return oneListOfOneStringsWithMaxLengthOf9;
    }

    public OneListOfOneStringsWithMaxLengthOf9_5 setOneListOfOneStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneListOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.List<String> calculatedOneListOfOneStringsWithMaxLengthOf9;

    public java.util.List<String> getCalculatedOneListOfOneStringsWithMaxLengthOf9() {
        return this.calculatedOneListOfOneStringsWithMaxLengthOf9;
    }

    private final java.util.List<String> persistedOneListOfOneStringsWithMaxLengthOf9;

    public java.util.List<String> getPersistedOneListOfOneStringsWithMaxLengthOf9() {
        return this.persistedOneListOfOneStringsWithMaxLengthOf9;
    }
}

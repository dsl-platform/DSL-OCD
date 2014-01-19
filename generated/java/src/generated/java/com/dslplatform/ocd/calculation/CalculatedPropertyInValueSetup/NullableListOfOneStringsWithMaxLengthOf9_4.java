package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneStringsWithMaxLengthOf9_4 implements
        java.io.Serializable {
    public NullableListOfOneStringsWithMaxLengthOf9_4(
            final java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9,
            final java.util.List<String> calculatedNullableListOfOneStringsWithMaxLengthOf9,
            final java.util.List<String> persistedNullableListOfOneStringsWithMaxLengthOf9) {
        setNullableListOfOneStringsWithMaxLengthOf9(nullableListOfOneStringsWithMaxLengthOf9);
        this.calculatedNullableListOfOneStringsWithMaxLengthOf9 = calculatedNullableListOfOneStringsWithMaxLengthOf9;
        this.persistedNullableListOfOneStringsWithMaxLengthOf9 = persistedNullableListOfOneStringsWithMaxLengthOf9;
    }

    public NullableListOfOneStringsWithMaxLengthOf9_4() {
        this.calculatedNullableListOfOneStringsWithMaxLengthOf9 = null;
        this.persistedNullableListOfOneStringsWithMaxLengthOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 473722099;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneStringsWithMaxLengthOf9_4))
            return false;
        final NullableListOfOneStringsWithMaxLengthOf9_4 other = (NullableListOfOneStringsWithMaxLengthOf9_4) obj;

        if (!(this.nullableListOfOneStringsWithMaxLengthOf9 == other.nullableListOfOneStringsWithMaxLengthOf9 || this.nullableListOfOneStringsWithMaxLengthOf9 != null
                && this.nullableListOfOneStringsWithMaxLengthOf9
                        .equals(other.nullableListOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedNullableListOfOneStringsWithMaxLengthOf9 == other.calculatedNullableListOfOneStringsWithMaxLengthOf9 || this.calculatedNullableListOfOneStringsWithMaxLengthOf9 != null
                && this.calculatedNullableListOfOneStringsWithMaxLengthOf9
                        .equals(other.calculatedNullableListOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedNullableListOfOneStringsWithMaxLengthOf9 == other.persistedNullableListOfOneStringsWithMaxLengthOf9 || this.persistedNullableListOfOneStringsWithMaxLengthOf9 != null
                && this.persistedNullableListOfOneStringsWithMaxLengthOf9
                        .equals(other.persistedNullableListOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneStringsWithMaxLengthOf9_4("
                + nullableListOfOneStringsWithMaxLengthOf9 + ','
                + calculatedNullableListOfOneStringsWithMaxLengthOf9 + ','
                + persistedNullableListOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableListOfOneStringsWithMaxLengthOf9")
    public java.util.List<String> getNullableListOfOneStringsWithMaxLengthOf9() {
        return nullableListOfOneStringsWithMaxLengthOf9;
    }

    public NullableListOfOneStringsWithMaxLengthOf9_4 setNullableListOfOneStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableListOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.List<String> calculatedNullableListOfOneStringsWithMaxLengthOf9;

    public java.util.List<String> getCalculatedNullableListOfOneStringsWithMaxLengthOf9() {
        return this.calculatedNullableListOfOneStringsWithMaxLengthOf9;
    }

    private final java.util.List<String> persistedNullableListOfOneStringsWithMaxLengthOf9;

    public java.util.List<String> getPersistedNullableListOfOneStringsWithMaxLengthOf9() {
        return this.persistedNullableListOfOneStringsWithMaxLengthOf9;
    }
}

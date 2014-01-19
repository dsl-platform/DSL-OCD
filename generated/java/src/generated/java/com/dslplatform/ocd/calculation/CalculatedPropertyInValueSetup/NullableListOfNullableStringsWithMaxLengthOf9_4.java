package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableStringsWithMaxLengthOf9_4 implements
        java.io.Serializable {
    public NullableListOfNullableStringsWithMaxLengthOf9_4(
            final java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9,
            final java.util.List<String> calculatedNullableListOfNullableStringsWithMaxLengthOf9,
            final java.util.List<String> persistedNullableListOfNullableStringsWithMaxLengthOf9) {
        setNullableListOfNullableStringsWithMaxLengthOf9(nullableListOfNullableStringsWithMaxLengthOf9);
        this.calculatedNullableListOfNullableStringsWithMaxLengthOf9 = calculatedNullableListOfNullableStringsWithMaxLengthOf9;
        this.persistedNullableListOfNullableStringsWithMaxLengthOf9 = persistedNullableListOfNullableStringsWithMaxLengthOf9;
    }

    public NullableListOfNullableStringsWithMaxLengthOf9_4() {
        this.calculatedNullableListOfNullableStringsWithMaxLengthOf9 = null;
        this.persistedNullableListOfNullableStringsWithMaxLengthOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 231488702;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableStringsWithMaxLengthOf9_4))
            return false;
        final NullableListOfNullableStringsWithMaxLengthOf9_4 other = (NullableListOfNullableStringsWithMaxLengthOf9_4) obj;

        if (!(this.nullableListOfNullableStringsWithMaxLengthOf9 == other.nullableListOfNullableStringsWithMaxLengthOf9 || this.nullableListOfNullableStringsWithMaxLengthOf9 != null
                && this.nullableListOfNullableStringsWithMaxLengthOf9
                        .equals(other.nullableListOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedNullableListOfNullableStringsWithMaxLengthOf9 == other.calculatedNullableListOfNullableStringsWithMaxLengthOf9 || this.calculatedNullableListOfNullableStringsWithMaxLengthOf9 != null
                && this.calculatedNullableListOfNullableStringsWithMaxLengthOf9
                        .equals(other.calculatedNullableListOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedNullableListOfNullableStringsWithMaxLengthOf9 == other.persistedNullableListOfNullableStringsWithMaxLengthOf9 || this.persistedNullableListOfNullableStringsWithMaxLengthOf9 != null
                && this.persistedNullableListOfNullableStringsWithMaxLengthOf9
                        .equals(other.persistedNullableListOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableStringsWithMaxLengthOf9_4("
                + nullableListOfNullableStringsWithMaxLengthOf9 + ','
                + calculatedNullableListOfNullableStringsWithMaxLengthOf9 + ','
                + persistedNullableListOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableListOfNullableStringsWithMaxLengthOf9")
    public java.util.List<String> getNullableListOfNullableStringsWithMaxLengthOf9() {
        return nullableListOfNullableStringsWithMaxLengthOf9;
    }

    public NullableListOfNullableStringsWithMaxLengthOf9_4 setNullableListOfNullableStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableListOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.List<String> calculatedNullableListOfNullableStringsWithMaxLengthOf9;

    public java.util.List<String> getCalculatedNullableListOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedNullableListOfNullableStringsWithMaxLengthOf9;
    }

    private final java.util.List<String> persistedNullableListOfNullableStringsWithMaxLengthOf9;

    public java.util.List<String> getPersistedNullableListOfNullableStringsWithMaxLengthOf9() {
        return this.persistedNullableListOfNullableStringsWithMaxLengthOf9;
    }
}

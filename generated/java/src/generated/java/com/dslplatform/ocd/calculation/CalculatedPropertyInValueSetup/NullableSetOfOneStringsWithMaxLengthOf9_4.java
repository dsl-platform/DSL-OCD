package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneStringsWithMaxLengthOf9_4 implements
        java.io.Serializable {
    public NullableSetOfOneStringsWithMaxLengthOf9_4(
            final java.util.Set<String> nullableSetOfOneStringsWithMaxLengthOf9,
            final java.util.Set<String> calculatedNullableSetOfOneStringsWithMaxLengthOf9,
            final java.util.Set<String> persistedNullableSetOfOneStringsWithMaxLengthOf9) {
        setNullableSetOfOneStringsWithMaxLengthOf9(nullableSetOfOneStringsWithMaxLengthOf9);
        this.calculatedNullableSetOfOneStringsWithMaxLengthOf9 = calculatedNullableSetOfOneStringsWithMaxLengthOf9;
        this.persistedNullableSetOfOneStringsWithMaxLengthOf9 = persistedNullableSetOfOneStringsWithMaxLengthOf9;
    }

    public NullableSetOfOneStringsWithMaxLengthOf9_4() {
        this.calculatedNullableSetOfOneStringsWithMaxLengthOf9 = null;
        this.persistedNullableSetOfOneStringsWithMaxLengthOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 906163903;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneStringsWithMaxLengthOf9_4))
            return false;
        final NullableSetOfOneStringsWithMaxLengthOf9_4 other = (NullableSetOfOneStringsWithMaxLengthOf9_4) obj;

        if (!(this.nullableSetOfOneStringsWithMaxLengthOf9 == other.nullableSetOfOneStringsWithMaxLengthOf9 || this.nullableSetOfOneStringsWithMaxLengthOf9 != null
                && this.nullableSetOfOneStringsWithMaxLengthOf9
                        .equals(other.nullableSetOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedNullableSetOfOneStringsWithMaxLengthOf9 == other.calculatedNullableSetOfOneStringsWithMaxLengthOf9 || this.calculatedNullableSetOfOneStringsWithMaxLengthOf9 != null
                && this.calculatedNullableSetOfOneStringsWithMaxLengthOf9
                        .equals(other.calculatedNullableSetOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedNullableSetOfOneStringsWithMaxLengthOf9 == other.persistedNullableSetOfOneStringsWithMaxLengthOf9 || this.persistedNullableSetOfOneStringsWithMaxLengthOf9 != null
                && this.persistedNullableSetOfOneStringsWithMaxLengthOf9
                        .equals(other.persistedNullableSetOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneStringsWithMaxLengthOf9_4("
                + nullableSetOfOneStringsWithMaxLengthOf9 + ','
                + calculatedNullableSetOfOneStringsWithMaxLengthOf9 + ','
                + persistedNullableSetOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableSetOfOneStringsWithMaxLengthOf9")
    public java.util.Set<String> getNullableSetOfOneStringsWithMaxLengthOf9() {
        return nullableSetOfOneStringsWithMaxLengthOf9;
    }

    public NullableSetOfOneStringsWithMaxLengthOf9_4 setNullableSetOfOneStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableSetOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.Set<String> calculatedNullableSetOfOneStringsWithMaxLengthOf9;

    public java.util.Set<String> getCalculatedNullableSetOfOneStringsWithMaxLengthOf9() {
        return this.calculatedNullableSetOfOneStringsWithMaxLengthOf9;
    }

    private final java.util.Set<String> persistedNullableSetOfOneStringsWithMaxLengthOf9;

    public java.util.Set<String> getPersistedNullableSetOfOneStringsWithMaxLengthOf9() {
        return this.persistedNullableSetOfOneStringsWithMaxLengthOf9;
    }
}

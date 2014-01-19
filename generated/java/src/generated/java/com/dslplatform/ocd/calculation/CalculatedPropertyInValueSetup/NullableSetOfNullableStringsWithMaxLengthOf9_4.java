package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableStringsWithMaxLengthOf9_4 implements
        java.io.Serializable {
    public NullableSetOfNullableStringsWithMaxLengthOf9_4(
            final java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9,
            final java.util.Set<String> calculatedNullableSetOfNullableStringsWithMaxLengthOf9,
            final java.util.Set<String> persistedNullableSetOfNullableStringsWithMaxLengthOf9) {
        setNullableSetOfNullableStringsWithMaxLengthOf9(nullableSetOfNullableStringsWithMaxLengthOf9);
        this.calculatedNullableSetOfNullableStringsWithMaxLengthOf9 = calculatedNullableSetOfNullableStringsWithMaxLengthOf9;
        this.persistedNullableSetOfNullableStringsWithMaxLengthOf9 = persistedNullableSetOfNullableStringsWithMaxLengthOf9;
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9_4() {
        this.calculatedNullableSetOfNullableStringsWithMaxLengthOf9 = null;
        this.persistedNullableSetOfNullableStringsWithMaxLengthOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1463944344;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableStringsWithMaxLengthOf9_4))
            return false;
        final NullableSetOfNullableStringsWithMaxLengthOf9_4 other = (NullableSetOfNullableStringsWithMaxLengthOf9_4) obj;

        if (!(this.nullableSetOfNullableStringsWithMaxLengthOf9 == other.nullableSetOfNullableStringsWithMaxLengthOf9 || this.nullableSetOfNullableStringsWithMaxLengthOf9 != null
                && this.nullableSetOfNullableStringsWithMaxLengthOf9
                        .equals(other.nullableSetOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedNullableSetOfNullableStringsWithMaxLengthOf9 == other.calculatedNullableSetOfNullableStringsWithMaxLengthOf9 || this.calculatedNullableSetOfNullableStringsWithMaxLengthOf9 != null
                && this.calculatedNullableSetOfNullableStringsWithMaxLengthOf9
                        .equals(other.calculatedNullableSetOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedNullableSetOfNullableStringsWithMaxLengthOf9 == other.persistedNullableSetOfNullableStringsWithMaxLengthOf9 || this.persistedNullableSetOfNullableStringsWithMaxLengthOf9 != null
                && this.persistedNullableSetOfNullableStringsWithMaxLengthOf9
                        .equals(other.persistedNullableSetOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableStringsWithMaxLengthOf9_4("
                + nullableSetOfNullableStringsWithMaxLengthOf9 + ','
                + calculatedNullableSetOfNullableStringsWithMaxLengthOf9 + ','
                + persistedNullableSetOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableSetOfNullableStringsWithMaxLengthOf9")
    public java.util.Set<String> getNullableSetOfNullableStringsWithMaxLengthOf9() {
        return nullableSetOfNullableStringsWithMaxLengthOf9;
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9_4 setNullableSetOfNullableStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableSetOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final java.util.Set<String> calculatedNullableSetOfNullableStringsWithMaxLengthOf9;

    public java.util.Set<String> getCalculatedNullableSetOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedNullableSetOfNullableStringsWithMaxLengthOf9;
    }

    private final java.util.Set<String> persistedNullableSetOfNullableStringsWithMaxLengthOf9;

    public java.util.Set<String> getPersistedNullableSetOfNullableStringsWithMaxLengthOf9() {
        return this.persistedNullableSetOfNullableStringsWithMaxLengthOf9;
    }
}

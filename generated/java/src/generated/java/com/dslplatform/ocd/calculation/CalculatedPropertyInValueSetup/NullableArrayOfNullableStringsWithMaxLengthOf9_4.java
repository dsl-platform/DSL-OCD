package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableStringsWithMaxLengthOf9_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableStringsWithMaxLengthOf9_4(
            final String[] nullableArrayOfNullableStringsWithMaxLengthOf9,
            final String[] calculatedNullableArrayOfNullableStringsWithMaxLengthOf9,
            final String[] persistedNullableArrayOfNullableStringsWithMaxLengthOf9) {
        setNullableArrayOfNullableStringsWithMaxLengthOf9(nullableArrayOfNullableStringsWithMaxLengthOf9);
        this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = calculatedNullableArrayOfNullableStringsWithMaxLengthOf9;
        this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = persistedNullableArrayOfNullableStringsWithMaxLengthOf9;
    }

    public NullableArrayOfNullableStringsWithMaxLengthOf9_4() {
        this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = null;
        this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1308775559;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableStringsWithMaxLengthOf9_4))
            return false;
        final NullableArrayOfNullableStringsWithMaxLengthOf9_4 other = (NullableArrayOfNullableStringsWithMaxLengthOf9_4) obj;

        if (!(java.util.Arrays.equals(
                this.nullableArrayOfNullableStringsWithMaxLengthOf9,
                other.nullableArrayOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 == other.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 || this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 != null
                && java.util.Arrays
                        .equals(this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9,
                                other.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9 == other.persistedNullableArrayOfNullableStringsWithMaxLengthOf9 || this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9 != null
                && java.util.Arrays
                        .equals(this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9,
                                other.persistedNullableArrayOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableStringsWithMaxLengthOf9_4("
                + nullableArrayOfNullableStringsWithMaxLengthOf9 + ','
                + calculatedNullableArrayOfNullableStringsWithMaxLengthOf9
                + ',' + persistedNullableArrayOfNullableStringsWithMaxLengthOf9
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableArrayOfNullableStringsWithMaxLengthOf9")
    public String[] getNullableArrayOfNullableStringsWithMaxLengthOf9() {
        return nullableArrayOfNullableStringsWithMaxLengthOf9;
    }

    public NullableArrayOfNullableStringsWithMaxLengthOf9_4 setNullableArrayOfNullableStringsWithMaxLengthOf9(
            final String[] value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableArrayOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final String[] calculatedNullableArrayOfNullableStringsWithMaxLengthOf9;

    public String[] getCalculatedNullableArrayOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9;
    }

    private final String[] persistedNullableArrayOfNullableStringsWithMaxLengthOf9;

    public String[] getPersistedNullableArrayOfNullableStringsWithMaxLengthOf9() {
        return this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9;
    }
}

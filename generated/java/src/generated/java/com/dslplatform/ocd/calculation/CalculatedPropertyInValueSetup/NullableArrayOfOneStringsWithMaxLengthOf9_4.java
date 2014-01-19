package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneStringsWithMaxLengthOf9_4 implements
        java.io.Serializable {
    public NullableArrayOfOneStringsWithMaxLengthOf9_4(
            final String[] nullableArrayOfOneStringsWithMaxLengthOf9,
            final String[] calculatedNullableArrayOfOneStringsWithMaxLengthOf9,
            final String[] persistedNullableArrayOfOneStringsWithMaxLengthOf9) {
        setNullableArrayOfOneStringsWithMaxLengthOf9(nullableArrayOfOneStringsWithMaxLengthOf9);
        this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9 = calculatedNullableArrayOfOneStringsWithMaxLengthOf9;
        this.persistedNullableArrayOfOneStringsWithMaxLengthOf9 = persistedNullableArrayOfOneStringsWithMaxLengthOf9;
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9_4() {
        this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9 = null;
        this.persistedNullableArrayOfOneStringsWithMaxLengthOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 51872154;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneStringsWithMaxLengthOf9_4))
            return false;
        final NullableArrayOfOneStringsWithMaxLengthOf9_4 other = (NullableArrayOfOneStringsWithMaxLengthOf9_4) obj;

        if (!(java.util.Arrays.equals(
                this.nullableArrayOfOneStringsWithMaxLengthOf9,
                other.nullableArrayOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9 == other.calculatedNullableArrayOfOneStringsWithMaxLengthOf9 || this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9 != null
                && java.util.Arrays
                        .equals(this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9,
                                other.calculatedNullableArrayOfOneStringsWithMaxLengthOf9)))
            return false;
        if (!(this.persistedNullableArrayOfOneStringsWithMaxLengthOf9 == other.persistedNullableArrayOfOneStringsWithMaxLengthOf9 || this.persistedNullableArrayOfOneStringsWithMaxLengthOf9 != null
                && java.util.Arrays
                        .equals(this.persistedNullableArrayOfOneStringsWithMaxLengthOf9,
                                other.persistedNullableArrayOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneStringsWithMaxLengthOf9_4("
                + nullableArrayOfOneStringsWithMaxLengthOf9 + ','
                + calculatedNullableArrayOfOneStringsWithMaxLengthOf9 + ','
                + persistedNullableArrayOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9")
    public String[] getNullableArrayOfOneStringsWithMaxLengthOf9() {
        return nullableArrayOfOneStringsWithMaxLengthOf9;
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9_4 setNullableArrayOfOneStringsWithMaxLengthOf9(
            final String[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableArrayOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private final String[] calculatedNullableArrayOfOneStringsWithMaxLengthOf9;

    public String[] getCalculatedNullableArrayOfOneStringsWithMaxLengthOf9() {
        return this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9;
    }

    private final String[] persistedNullableArrayOfOneStringsWithMaxLengthOf9;

    public String[] getPersistedNullableArrayOfOneStringsWithMaxLengthOf9() {
        return this.persistedNullableArrayOfOneStringsWithMaxLengthOf9;
    }
}

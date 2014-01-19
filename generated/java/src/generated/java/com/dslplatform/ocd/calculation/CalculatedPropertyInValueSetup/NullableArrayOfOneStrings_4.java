package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneStrings_4 implements java.io.Serializable {
    public NullableArrayOfOneStrings_4(
            final String[] nullableArrayOfOneStrings,
            final String[] calculatedNullableArrayOfOneStrings,
            final String[] persistedNullableArrayOfOneStrings) {
        setNullableArrayOfOneStrings(nullableArrayOfOneStrings);
        this.calculatedNullableArrayOfOneStrings = calculatedNullableArrayOfOneStrings;
        this.persistedNullableArrayOfOneStrings = persistedNullableArrayOfOneStrings;
    }

    public NullableArrayOfOneStrings_4() {
        this.calculatedNullableArrayOfOneStrings = null;
        this.persistedNullableArrayOfOneStrings = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 135224536;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneStrings_4)) return false;
        final NullableArrayOfOneStrings_4 other = (NullableArrayOfOneStrings_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneStrings,
                other.nullableArrayOfOneStrings))) return false;
        if (!(this.calculatedNullableArrayOfOneStrings == other.calculatedNullableArrayOfOneStrings || this.calculatedNullableArrayOfOneStrings != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneStrings,
                        other.calculatedNullableArrayOfOneStrings)))
            return false;
        if (!(this.persistedNullableArrayOfOneStrings == other.persistedNullableArrayOfOneStrings || this.persistedNullableArrayOfOneStrings != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneStrings,
                        other.persistedNullableArrayOfOneStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneStrings_4(" + nullableArrayOfOneStrings + ','
                + calculatedNullableArrayOfOneStrings + ','
                + persistedNullableArrayOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfOneStrings;

    @JsonProperty("nullableArrayOfOneStrings")
    public String[] getNullableArrayOfOneStrings() {
        return nullableArrayOfOneStrings;
    }

    public NullableArrayOfOneStrings_4 setNullableArrayOfOneStrings(
            final String[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneStrings = value;

        return this;
    }

    private final String[] calculatedNullableArrayOfOneStrings;

    public String[] getCalculatedNullableArrayOfOneStrings() {
        return this.calculatedNullableArrayOfOneStrings;
    }

    private final String[] persistedNullableArrayOfOneStrings;

    public String[] getPersistedNullableArrayOfOneStrings() {
        return this.persistedNullableArrayOfOneStrings;
    }
}

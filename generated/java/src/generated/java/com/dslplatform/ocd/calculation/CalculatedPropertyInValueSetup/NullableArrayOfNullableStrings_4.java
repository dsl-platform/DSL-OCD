package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableStrings_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableStrings_4(
            final String[] nullableArrayOfNullableStrings,
            final String[] calculatedNullableArrayOfNullableStrings,
            final String[] persistedNullableArrayOfNullableStrings) {
        setNullableArrayOfNullableStrings(nullableArrayOfNullableStrings);
        this.calculatedNullableArrayOfNullableStrings = calculatedNullableArrayOfNullableStrings;
        this.persistedNullableArrayOfNullableStrings = persistedNullableArrayOfNullableStrings;
    }

    public NullableArrayOfNullableStrings_4() {
        this.calculatedNullableArrayOfNullableStrings = null;
        this.persistedNullableArrayOfNullableStrings = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1957562147;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableStrings_4)) return false;
        final NullableArrayOfNullableStrings_4 other = (NullableArrayOfNullableStrings_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableStrings,
                other.nullableArrayOfNullableStrings))) return false;
        if (!(this.calculatedNullableArrayOfNullableStrings == other.calculatedNullableArrayOfNullableStrings || this.calculatedNullableArrayOfNullableStrings != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableStrings,
                        other.calculatedNullableArrayOfNullableStrings)))
            return false;
        if (!(this.persistedNullableArrayOfNullableStrings == other.persistedNullableArrayOfNullableStrings || this.persistedNullableArrayOfNullableStrings != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableStrings,
                        other.persistedNullableArrayOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableStrings_4("
                + nullableArrayOfNullableStrings + ','
                + calculatedNullableArrayOfNullableStrings + ','
                + persistedNullableArrayOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String[] nullableArrayOfNullableStrings;

    @JsonProperty("nullableArrayOfNullableStrings")
    public String[] getNullableArrayOfNullableStrings() {
        return nullableArrayOfNullableStrings;
    }

    public NullableArrayOfNullableStrings_4 setNullableArrayOfNullableStrings(
            final String[] value) {
        this.nullableArrayOfNullableStrings = value;

        return this;
    }

    private final String[] calculatedNullableArrayOfNullableStrings;

    public String[] getCalculatedNullableArrayOfNullableStrings() {
        return this.calculatedNullableArrayOfNullableStrings;
    }

    private final String[] persistedNullableArrayOfNullableStrings;

    public String[] getPersistedNullableArrayOfNullableStrings() {
        return this.persistedNullableArrayOfNullableStrings;
    }
}

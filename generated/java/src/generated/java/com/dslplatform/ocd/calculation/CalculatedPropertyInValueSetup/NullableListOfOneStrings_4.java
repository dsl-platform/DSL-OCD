package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneStrings_4 implements java.io.Serializable {
    public NullableListOfOneStrings_4(
            final java.util.List<String> nullableListOfOneStrings,
            final java.util.List<String> calculatedNullableListOfOneStrings,
            final java.util.List<String> persistedNullableListOfOneStrings) {
        setNullableListOfOneStrings(nullableListOfOneStrings);
        this.calculatedNullableListOfOneStrings = calculatedNullableListOfOneStrings;
        this.persistedNullableListOfOneStrings = persistedNullableListOfOneStrings;
    }

    public NullableListOfOneStrings_4() {
        this.calculatedNullableListOfOneStrings = null;
        this.persistedNullableListOfOneStrings = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1181077459;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneStrings_4)) return false;
        final NullableListOfOneStrings_4 other = (NullableListOfOneStrings_4) obj;

        if (!(this.nullableListOfOneStrings == other.nullableListOfOneStrings || this.nullableListOfOneStrings != null
                && this.nullableListOfOneStrings
                        .equals(other.nullableListOfOneStrings))) return false;
        if (!(this.calculatedNullableListOfOneStrings == other.calculatedNullableListOfOneStrings || this.calculatedNullableListOfOneStrings != null
                && this.calculatedNullableListOfOneStrings
                        .equals(other.calculatedNullableListOfOneStrings)))
            return false;
        if (!(this.persistedNullableListOfOneStrings == other.persistedNullableListOfOneStrings || this.persistedNullableListOfOneStrings != null
                && this.persistedNullableListOfOneStrings
                        .equals(other.persistedNullableListOfOneStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneStrings_4(" + nullableListOfOneStrings + ','
                + calculatedNullableListOfOneStrings + ','
                + persistedNullableListOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneStrings;

    @JsonProperty("nullableListOfOneStrings")
    public java.util.List<String> getNullableListOfOneStrings() {
        return nullableListOfOneStrings;
    }

    public NullableListOfOneStrings_4 setNullableListOfOneStrings(
            final java.util.List<String> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneStrings = value;

        return this;
    }

    private final java.util.List<String> calculatedNullableListOfOneStrings;

    public java.util.List<String> getCalculatedNullableListOfOneStrings() {
        return this.calculatedNullableListOfOneStrings;
    }

    private final java.util.List<String> persistedNullableListOfOneStrings;

    public java.util.List<String> getPersistedNullableListOfOneStrings() {
        return this.persistedNullableListOfOneStrings;
    }
}

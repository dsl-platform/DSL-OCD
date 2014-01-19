package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneStrings_4 implements java.io.Serializable {
    public NullableSetOfOneStrings_4(
            final java.util.Set<String> nullableSetOfOneStrings,
            final java.util.Set<String> calculatedNullableSetOfOneStrings,
            final java.util.Set<String> persistedNullableSetOfOneStrings) {
        setNullableSetOfOneStrings(nullableSetOfOneStrings);
        this.calculatedNullableSetOfOneStrings = calculatedNullableSetOfOneStrings;
        this.persistedNullableSetOfOneStrings = persistedNullableSetOfOneStrings;
    }

    public NullableSetOfOneStrings_4() {
        this.calculatedNullableSetOfOneStrings = null;
        this.persistedNullableSetOfOneStrings = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1247069181;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneStrings_4)) return false;
        final NullableSetOfOneStrings_4 other = (NullableSetOfOneStrings_4) obj;

        if (!(this.nullableSetOfOneStrings == other.nullableSetOfOneStrings || this.nullableSetOfOneStrings != null
                && this.nullableSetOfOneStrings
                        .equals(other.nullableSetOfOneStrings))) return false;
        if (!(this.calculatedNullableSetOfOneStrings == other.calculatedNullableSetOfOneStrings || this.calculatedNullableSetOfOneStrings != null
                && this.calculatedNullableSetOfOneStrings
                        .equals(other.calculatedNullableSetOfOneStrings)))
            return false;
        if (!(this.persistedNullableSetOfOneStrings == other.persistedNullableSetOfOneStrings || this.persistedNullableSetOfOneStrings != null
                && this.persistedNullableSetOfOneStrings
                        .equals(other.persistedNullableSetOfOneStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneStrings_4(" + nullableSetOfOneStrings + ','
                + calculatedNullableSetOfOneStrings + ','
                + persistedNullableSetOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfOneStrings;

    @JsonProperty("nullableSetOfOneStrings")
    public java.util.Set<String> getNullableSetOfOneStrings() {
        return nullableSetOfOneStrings;
    }

    public NullableSetOfOneStrings_4 setNullableSetOfOneStrings(
            final java.util.Set<String> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneStrings = value;

        return this;
    }

    private final java.util.Set<String> calculatedNullableSetOfOneStrings;

    public java.util.Set<String> getCalculatedNullableSetOfOneStrings() {
        return this.calculatedNullableSetOfOneStrings;
    }

    private final java.util.Set<String> persistedNullableSetOfOneStrings;

    public java.util.Set<String> getPersistedNullableSetOfOneStrings() {
        return this.persistedNullableSetOfOneStrings;
    }
}

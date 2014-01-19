package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableStrings_4 implements
        java.io.Serializable {
    public NullableSetOfNullableStrings_4(
            final java.util.Set<String> nullableSetOfNullableStrings,
            final java.util.Set<String> calculatedNullableSetOfNullableStrings,
            final java.util.Set<String> persistedNullableSetOfNullableStrings) {
        setNullableSetOfNullableStrings(nullableSetOfNullableStrings);
        this.calculatedNullableSetOfNullableStrings = calculatedNullableSetOfNullableStrings;
        this.persistedNullableSetOfNullableStrings = persistedNullableSetOfNullableStrings;
    }

    public NullableSetOfNullableStrings_4() {
        this.calculatedNullableSetOfNullableStrings = null;
        this.persistedNullableSetOfNullableStrings = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 588987618;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableStrings_4)) return false;
        final NullableSetOfNullableStrings_4 other = (NullableSetOfNullableStrings_4) obj;

        if (!(this.nullableSetOfNullableStrings == other.nullableSetOfNullableStrings || this.nullableSetOfNullableStrings != null
                && this.nullableSetOfNullableStrings
                        .equals(other.nullableSetOfNullableStrings)))
            return false;
        if (!(this.calculatedNullableSetOfNullableStrings == other.calculatedNullableSetOfNullableStrings || this.calculatedNullableSetOfNullableStrings != null
                && this.calculatedNullableSetOfNullableStrings
                        .equals(other.calculatedNullableSetOfNullableStrings)))
            return false;
        if (!(this.persistedNullableSetOfNullableStrings == other.persistedNullableSetOfNullableStrings || this.persistedNullableSetOfNullableStrings != null
                && this.persistedNullableSetOfNullableStrings
                        .equals(other.persistedNullableSetOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableStrings_4(" + nullableSetOfNullableStrings
                + ',' + calculatedNullableSetOfNullableStrings + ','
                + persistedNullableSetOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableStrings;

    @JsonProperty("nullableSetOfNullableStrings")
    public java.util.Set<String> getNullableSetOfNullableStrings() {
        return nullableSetOfNullableStrings;
    }

    public NullableSetOfNullableStrings_4 setNullableSetOfNullableStrings(
            final java.util.Set<String> value) {
        this.nullableSetOfNullableStrings = value;

        return this;
    }

    private final java.util.Set<String> calculatedNullableSetOfNullableStrings;

    public java.util.Set<String> getCalculatedNullableSetOfNullableStrings() {
        return this.calculatedNullableSetOfNullableStrings;
    }

    private final java.util.Set<String> persistedNullableSetOfNullableStrings;

    public java.util.Set<String> getPersistedNullableSetOfNullableStrings() {
        return this.persistedNullableSetOfNullableStrings;
    }
}

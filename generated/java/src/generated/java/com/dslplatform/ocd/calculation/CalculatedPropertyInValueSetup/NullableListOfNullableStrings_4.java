package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableStrings_4 implements
        java.io.Serializable {
    public NullableListOfNullableStrings_4(
            final java.util.List<String> nullableListOfNullableStrings,
            final java.util.List<String> calculatedNullableListOfNullableStrings,
            final java.util.List<String> persistedNullableListOfNullableStrings) {
        setNullableListOfNullableStrings(nullableListOfNullableStrings);
        this.calculatedNullableListOfNullableStrings = calculatedNullableListOfNullableStrings;
        this.persistedNullableListOfNullableStrings = persistedNullableListOfNullableStrings;
    }

    public NullableListOfNullableStrings_4() {
        this.calculatedNullableListOfNullableStrings = null;
        this.persistedNullableListOfNullableStrings = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 247576260;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableStrings_4)) return false;
        final NullableListOfNullableStrings_4 other = (NullableListOfNullableStrings_4) obj;

        if (!(this.nullableListOfNullableStrings == other.nullableListOfNullableStrings || this.nullableListOfNullableStrings != null
                && this.nullableListOfNullableStrings
                        .equals(other.nullableListOfNullableStrings)))
            return false;
        if (!(this.calculatedNullableListOfNullableStrings == other.calculatedNullableListOfNullableStrings || this.calculatedNullableListOfNullableStrings != null
                && this.calculatedNullableListOfNullableStrings
                        .equals(other.calculatedNullableListOfNullableStrings)))
            return false;
        if (!(this.persistedNullableListOfNullableStrings == other.persistedNullableListOfNullableStrings || this.persistedNullableListOfNullableStrings != null
                && this.persistedNullableListOfNullableStrings
                        .equals(other.persistedNullableListOfNullableStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableStrings_4("
                + nullableListOfNullableStrings + ','
                + calculatedNullableListOfNullableStrings + ','
                + persistedNullableListOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfNullableStrings;

    @JsonProperty("nullableListOfNullableStrings")
    public java.util.List<String> getNullableListOfNullableStrings() {
        return nullableListOfNullableStrings;
    }

    public NullableListOfNullableStrings_4 setNullableListOfNullableStrings(
            final java.util.List<String> value) {
        this.nullableListOfNullableStrings = value;

        return this;
    }

    private final java.util.List<String> calculatedNullableListOfNullableStrings;

    public java.util.List<String> getCalculatedNullableListOfNullableStrings() {
        return this.calculatedNullableListOfNullableStrings;
    }

    private final java.util.List<String> persistedNullableListOfNullableStrings;

    public java.util.List<String> getPersistedNullableListOfNullableStrings() {
        return this.persistedNullableListOfNullableStrings;
    }
}

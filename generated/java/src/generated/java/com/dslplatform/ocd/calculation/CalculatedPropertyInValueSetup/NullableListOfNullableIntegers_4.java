package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableIntegers_4 implements
        java.io.Serializable {
    public NullableListOfNullableIntegers_4(
            final java.util.List<Integer> nullableListOfNullableIntegers,
            final java.util.List<Integer> calculatedNullableListOfNullableIntegers,
            final java.util.List<Integer> persistedNullableListOfNullableIntegers) {
        setNullableListOfNullableIntegers(nullableListOfNullableIntegers);
        this.calculatedNullableListOfNullableIntegers = calculatedNullableListOfNullableIntegers;
        this.persistedNullableListOfNullableIntegers = persistedNullableListOfNullableIntegers;
    }

    public NullableListOfNullableIntegers_4() {
        this.calculatedNullableListOfNullableIntegers = null;
        this.persistedNullableListOfNullableIntegers = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 887828811;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableIntegers_4)) return false;
        final NullableListOfNullableIntegers_4 other = (NullableListOfNullableIntegers_4) obj;

        if (!(this.nullableListOfNullableIntegers == other.nullableListOfNullableIntegers || this.nullableListOfNullableIntegers != null
                && this.nullableListOfNullableIntegers
                        .equals(other.nullableListOfNullableIntegers)))
            return false;
        if (!(this.calculatedNullableListOfNullableIntegers == other.calculatedNullableListOfNullableIntegers || this.calculatedNullableListOfNullableIntegers != null
                && this.calculatedNullableListOfNullableIntegers
                        .equals(other.calculatedNullableListOfNullableIntegers)))
            return false;
        if (!(this.persistedNullableListOfNullableIntegers == other.persistedNullableListOfNullableIntegers || this.persistedNullableListOfNullableIntegers != null
                && this.persistedNullableListOfNullableIntegers
                        .equals(other.persistedNullableListOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableIntegers_4("
                + nullableListOfNullableIntegers + ','
                + calculatedNullableListOfNullableIntegers + ','
                + persistedNullableListOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfNullableIntegers;

    @JsonProperty("nullableListOfNullableIntegers")
    public java.util.List<Integer> getNullableListOfNullableIntegers() {
        return nullableListOfNullableIntegers;
    }

    public NullableListOfNullableIntegers_4 setNullableListOfNullableIntegers(
            final java.util.List<Integer> value) {
        this.nullableListOfNullableIntegers = value;

        return this;
    }

    private final java.util.List<Integer> calculatedNullableListOfNullableIntegers;

    public java.util.List<Integer> getCalculatedNullableListOfNullableIntegers() {
        return this.calculatedNullableListOfNullableIntegers;
    }

    private final java.util.List<Integer> persistedNullableListOfNullableIntegers;

    public java.util.List<Integer> getPersistedNullableListOfNullableIntegers() {
        return this.persistedNullableListOfNullableIntegers;
    }
}

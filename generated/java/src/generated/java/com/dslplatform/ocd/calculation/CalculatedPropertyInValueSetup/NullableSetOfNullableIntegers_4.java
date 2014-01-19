package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableIntegers_4 implements
        java.io.Serializable {
    public NullableSetOfNullableIntegers_4(
            final java.util.Set<Integer> nullableSetOfNullableIntegers,
            final java.util.Set<Integer> calculatedNullableSetOfNullableIntegers,
            final java.util.Set<Integer> persistedNullableSetOfNullableIntegers) {
        setNullableSetOfNullableIntegers(nullableSetOfNullableIntegers);
        this.calculatedNullableSetOfNullableIntegers = calculatedNullableSetOfNullableIntegers;
        this.persistedNullableSetOfNullableIntegers = persistedNullableSetOfNullableIntegers;
    }

    public NullableSetOfNullableIntegers_4() {
        this.calculatedNullableSetOfNullableIntegers = null;
        this.persistedNullableSetOfNullableIntegers = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 356431305;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableIntegers_4)) return false;
        final NullableSetOfNullableIntegers_4 other = (NullableSetOfNullableIntegers_4) obj;

        if (!(this.nullableSetOfNullableIntegers == other.nullableSetOfNullableIntegers || this.nullableSetOfNullableIntegers != null
                && this.nullableSetOfNullableIntegers
                        .equals(other.nullableSetOfNullableIntegers)))
            return false;
        if (!(this.calculatedNullableSetOfNullableIntegers == other.calculatedNullableSetOfNullableIntegers || this.calculatedNullableSetOfNullableIntegers != null
                && this.calculatedNullableSetOfNullableIntegers
                        .equals(other.calculatedNullableSetOfNullableIntegers)))
            return false;
        if (!(this.persistedNullableSetOfNullableIntegers == other.persistedNullableSetOfNullableIntegers || this.persistedNullableSetOfNullableIntegers != null
                && this.persistedNullableSetOfNullableIntegers
                        .equals(other.persistedNullableSetOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableIntegers_4("
                + nullableSetOfNullableIntegers + ','
                + calculatedNullableSetOfNullableIntegers + ','
                + persistedNullableSetOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> nullableSetOfNullableIntegers;

    @JsonProperty("nullableSetOfNullableIntegers")
    public java.util.Set<Integer> getNullableSetOfNullableIntegers() {
        return nullableSetOfNullableIntegers;
    }

    public NullableSetOfNullableIntegers_4 setNullableSetOfNullableIntegers(
            final java.util.Set<Integer> value) {
        this.nullableSetOfNullableIntegers = value;

        return this;
    }

    private final java.util.Set<Integer> calculatedNullableSetOfNullableIntegers;

    public java.util.Set<Integer> getCalculatedNullableSetOfNullableIntegers() {
        return this.calculatedNullableSetOfNullableIntegers;
    }

    private final java.util.Set<Integer> persistedNullableSetOfNullableIntegers;

    public java.util.Set<Integer> getPersistedNullableSetOfNullableIntegers() {
        return this.persistedNullableSetOfNullableIntegers;
    }
}

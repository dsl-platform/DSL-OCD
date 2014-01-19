package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneIntegers_4 implements java.io.Serializable {
    public NullableSetOfOneIntegers_4(
            final java.util.Set<Integer> nullableSetOfOneIntegers,
            final java.util.Set<Integer> calculatedNullableSetOfOneIntegers,
            final java.util.Set<Integer> persistedNullableSetOfOneIntegers) {
        setNullableSetOfOneIntegers(nullableSetOfOneIntegers);
        this.calculatedNullableSetOfOneIntegers = calculatedNullableSetOfOneIntegers;
        this.persistedNullableSetOfOneIntegers = persistedNullableSetOfOneIntegers;
    }

    public NullableSetOfOneIntegers_4() {
        this.calculatedNullableSetOfOneIntegers = null;
        this.persistedNullableSetOfOneIntegers = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 549462260;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneIntegers_4)) return false;
        final NullableSetOfOneIntegers_4 other = (NullableSetOfOneIntegers_4) obj;

        if (!(this.nullableSetOfOneIntegers == other.nullableSetOfOneIntegers || this.nullableSetOfOneIntegers != null
                && this.nullableSetOfOneIntegers
                        .equals(other.nullableSetOfOneIntegers))) return false;
        if (!(this.calculatedNullableSetOfOneIntegers == other.calculatedNullableSetOfOneIntegers || this.calculatedNullableSetOfOneIntegers != null
                && this.calculatedNullableSetOfOneIntegers
                        .equals(other.calculatedNullableSetOfOneIntegers)))
            return false;
        if (!(this.persistedNullableSetOfOneIntegers == other.persistedNullableSetOfOneIntegers || this.persistedNullableSetOfOneIntegers != null
                && this.persistedNullableSetOfOneIntegers
                        .equals(other.persistedNullableSetOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneIntegers_4(" + nullableSetOfOneIntegers + ','
                + calculatedNullableSetOfOneIntegers + ','
                + persistedNullableSetOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> nullableSetOfOneIntegers;

    @JsonProperty("nullableSetOfOneIntegers")
    public java.util.Set<Integer> getNullableSetOfOneIntegers() {
        return nullableSetOfOneIntegers;
    }

    public NullableSetOfOneIntegers_4 setNullableSetOfOneIntegers(
            final java.util.Set<Integer> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneIntegers = value;

        return this;
    }

    private final java.util.Set<Integer> calculatedNullableSetOfOneIntegers;

    public java.util.Set<Integer> getCalculatedNullableSetOfOneIntegers() {
        return this.calculatedNullableSetOfOneIntegers;
    }

    private final java.util.Set<Integer> persistedNullableSetOfOneIntegers;

    public java.util.Set<Integer> getPersistedNullableSetOfOneIntegers() {
        return this.persistedNullableSetOfOneIntegers;
    }
}

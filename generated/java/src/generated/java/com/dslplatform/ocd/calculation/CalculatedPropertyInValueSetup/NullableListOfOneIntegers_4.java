package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIntegers_4 implements java.io.Serializable {
    public NullableListOfOneIntegers_4(
            final java.util.List<Integer> nullableListOfOneIntegers,
            final java.util.List<Integer> calculatedNullableListOfOneIntegers,
            final java.util.List<Integer> persistedNullableListOfOneIntegers) {
        setNullableListOfOneIntegers(nullableListOfOneIntegers);
        this.calculatedNullableListOfOneIntegers = calculatedNullableListOfOneIntegers;
        this.persistedNullableListOfOneIntegers = persistedNullableListOfOneIntegers;
    }

    public NullableListOfOneIntegers_4() {
        this.calculatedNullableListOfOneIntegers = null;
        this.persistedNullableListOfOneIntegers = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 647077174;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIntegers_4)) return false;
        final NullableListOfOneIntegers_4 other = (NullableListOfOneIntegers_4) obj;

        if (!(this.nullableListOfOneIntegers == other.nullableListOfOneIntegers || this.nullableListOfOneIntegers != null
                && this.nullableListOfOneIntegers
                        .equals(other.nullableListOfOneIntegers)))
            return false;
        if (!(this.calculatedNullableListOfOneIntegers == other.calculatedNullableListOfOneIntegers || this.calculatedNullableListOfOneIntegers != null
                && this.calculatedNullableListOfOneIntegers
                        .equals(other.calculatedNullableListOfOneIntegers)))
            return false;
        if (!(this.persistedNullableListOfOneIntegers == other.persistedNullableListOfOneIntegers || this.persistedNullableListOfOneIntegers != null
                && this.persistedNullableListOfOneIntegers
                        .equals(other.persistedNullableListOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIntegers_4(" + nullableListOfOneIntegers + ','
                + calculatedNullableListOfOneIntegers + ','
                + persistedNullableListOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> nullableListOfOneIntegers;

    @JsonProperty("nullableListOfOneIntegers")
    public java.util.List<Integer> getNullableListOfOneIntegers() {
        return nullableListOfOneIntegers;
    }

    public NullableListOfOneIntegers_4 setNullableListOfOneIntegers(
            final java.util.List<Integer> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneIntegers = value;

        return this;
    }

    private final java.util.List<Integer> calculatedNullableListOfOneIntegers;

    public java.util.List<Integer> getCalculatedNullableListOfOneIntegers() {
        return this.calculatedNullableListOfOneIntegers;
    }

    private final java.util.List<Integer> persistedNullableListOfOneIntegers;

    public java.util.List<Integer> getPersistedNullableListOfOneIntegers() {
        return this.persistedNullableListOfOneIntegers;
    }
}

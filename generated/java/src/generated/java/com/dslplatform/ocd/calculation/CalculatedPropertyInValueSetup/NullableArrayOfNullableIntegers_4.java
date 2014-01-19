package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableIntegers_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableIntegers_4(
            final Integer[] nullableArrayOfNullableIntegers,
            final Integer[] calculatedNullableArrayOfNullableIntegers,
            final Integer[] persistedNullableArrayOfNullableIntegers) {
        setNullableArrayOfNullableIntegers(nullableArrayOfNullableIntegers);
        this.calculatedNullableArrayOfNullableIntegers = calculatedNullableArrayOfNullableIntegers;
        this.persistedNullableArrayOfNullableIntegers = persistedNullableArrayOfNullableIntegers;
    }

    public NullableArrayOfNullableIntegers_4() {
        this.calculatedNullableArrayOfNullableIntegers = null;
        this.persistedNullableArrayOfNullableIntegers = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1820101076;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableIntegers_4)) return false;
        final NullableArrayOfNullableIntegers_4 other = (NullableArrayOfNullableIntegers_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableIntegers,
                other.nullableArrayOfNullableIntegers))) return false;
        if (!(this.calculatedNullableArrayOfNullableIntegers == other.calculatedNullableArrayOfNullableIntegers || this.calculatedNullableArrayOfNullableIntegers != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableIntegers,
                        other.calculatedNullableArrayOfNullableIntegers)))
            return false;
        if (!(this.persistedNullableArrayOfNullableIntegers == other.persistedNullableArrayOfNullableIntegers || this.persistedNullableArrayOfNullableIntegers != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableIntegers,
                        other.persistedNullableArrayOfNullableIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableIntegers_4("
                + nullableArrayOfNullableIntegers + ','
                + calculatedNullableArrayOfNullableIntegers + ','
                + persistedNullableArrayOfNullableIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] nullableArrayOfNullableIntegers;

    @JsonProperty("nullableArrayOfNullableIntegers")
    public Integer[] getNullableArrayOfNullableIntegers() {
        return nullableArrayOfNullableIntegers;
    }

    public NullableArrayOfNullableIntegers_4 setNullableArrayOfNullableIntegers(
            final Integer[] value) {
        this.nullableArrayOfNullableIntegers = value;

        return this;
    }

    private final Integer[] calculatedNullableArrayOfNullableIntegers;

    public Integer[] getCalculatedNullableArrayOfNullableIntegers() {
        return this.calculatedNullableArrayOfNullableIntegers;
    }

    private final Integer[] persistedNullableArrayOfNullableIntegers;

    public Integer[] getPersistedNullableArrayOfNullableIntegers() {
        return this.persistedNullableArrayOfNullableIntegers;
    }
}

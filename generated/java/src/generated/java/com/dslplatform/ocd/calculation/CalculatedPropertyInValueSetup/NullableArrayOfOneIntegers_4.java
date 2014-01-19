package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneIntegers_4 implements java.io.Serializable {
    public NullableArrayOfOneIntegers_4(
            final int[] nullableArrayOfOneIntegers,
            final int[] calculatedNullableArrayOfOneIntegers,
            final int[] persistedNullableArrayOfOneIntegers) {
        setNullableArrayOfOneIntegers(nullableArrayOfOneIntegers);
        this.calculatedNullableArrayOfOneIntegers = calculatedNullableArrayOfOneIntegers;
        this.persistedNullableArrayOfOneIntegers = persistedNullableArrayOfOneIntegers;
    }

    public NullableArrayOfOneIntegers_4() {
        this.calculatedNullableArrayOfOneIntegers = null;
        this.persistedNullableArrayOfOneIntegers = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 529994317;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneIntegers_4)) return false;
        final NullableArrayOfOneIntegers_4 other = (NullableArrayOfOneIntegers_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneIntegers,
                other.nullableArrayOfOneIntegers))) return false;
        if (!(this.calculatedNullableArrayOfOneIntegers == other.calculatedNullableArrayOfOneIntegers || this.calculatedNullableArrayOfOneIntegers != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneIntegers,
                        other.calculatedNullableArrayOfOneIntegers)))
            return false;
        if (!(this.persistedNullableArrayOfOneIntegers == other.persistedNullableArrayOfOneIntegers || this.persistedNullableArrayOfOneIntegers != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneIntegers,
                        other.persistedNullableArrayOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneIntegers_4(" + nullableArrayOfOneIntegers
                + ',' + calculatedNullableArrayOfOneIntegers + ','
                + persistedNullableArrayOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int[] nullableArrayOfOneIntegers;

    @JsonProperty("nullableArrayOfOneIntegers")
    public int[] getNullableArrayOfOneIntegers() {
        return nullableArrayOfOneIntegers;
    }

    public NullableArrayOfOneIntegers_4 setNullableArrayOfOneIntegers(
            final int[] value) {
        this.nullableArrayOfOneIntegers = value;

        return this;
    }

    private final int[] calculatedNullableArrayOfOneIntegers;

    public int[] getCalculatedNullableArrayOfOneIntegers() {
        return this.calculatedNullableArrayOfOneIntegers;
    }

    private final int[] persistedNullableArrayOfOneIntegers;

    public int[] getPersistedNullableArrayOfOneIntegers() {
        return this.persistedNullableArrayOfOneIntegers;
    }
}

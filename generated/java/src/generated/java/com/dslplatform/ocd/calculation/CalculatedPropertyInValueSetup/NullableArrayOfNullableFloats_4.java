package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableFloats_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableFloats_4(
            final Float[] nullableArrayOfNullableFloats,
            final Float[] calculatedNullableArrayOfNullableFloats,
            final Float[] persistedNullableArrayOfNullableFloats) {
        setNullableArrayOfNullableFloats(nullableArrayOfNullableFloats);
        this.calculatedNullableArrayOfNullableFloats = calculatedNullableArrayOfNullableFloats;
        this.persistedNullableArrayOfNullableFloats = persistedNullableArrayOfNullableFloats;
    }

    public NullableArrayOfNullableFloats_4() {
        this.calculatedNullableArrayOfNullableFloats = null;
        this.persistedNullableArrayOfNullableFloats = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 708071356;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableFloats_4)) return false;
        final NullableArrayOfNullableFloats_4 other = (NullableArrayOfNullableFloats_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableFloats,
                other.nullableArrayOfNullableFloats))) return false;
        if (!(this.calculatedNullableArrayOfNullableFloats == other.calculatedNullableArrayOfNullableFloats || this.calculatedNullableArrayOfNullableFloats != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableFloats,
                        other.calculatedNullableArrayOfNullableFloats)))
            return false;
        if (!(this.persistedNullableArrayOfNullableFloats == other.persistedNullableArrayOfNullableFloats || this.persistedNullableArrayOfNullableFloats != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableFloats,
                        other.persistedNullableArrayOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableFloats_4("
                + nullableArrayOfNullableFloats + ','
                + calculatedNullableArrayOfNullableFloats + ','
                + persistedNullableArrayOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] nullableArrayOfNullableFloats;

    @JsonProperty("nullableArrayOfNullableFloats")
    public Float[] getNullableArrayOfNullableFloats() {
        return nullableArrayOfNullableFloats;
    }

    public NullableArrayOfNullableFloats_4 setNullableArrayOfNullableFloats(
            final Float[] value) {
        this.nullableArrayOfNullableFloats = value;

        return this;
    }

    private final Float[] calculatedNullableArrayOfNullableFloats;

    public Float[] getCalculatedNullableArrayOfNullableFloats() {
        return this.calculatedNullableArrayOfNullableFloats;
    }

    private final Float[] persistedNullableArrayOfNullableFloats;

    public Float[] getPersistedNullableArrayOfNullableFloats() {
        return this.persistedNullableArrayOfNullableFloats;
    }
}

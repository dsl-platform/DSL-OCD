package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneFloats_4 implements java.io.Serializable {
    public NullableArrayOfOneFloats_4(
            final float[] nullableArrayOfOneFloats,
            final float[] calculatedNullableArrayOfOneFloats,
            final float[] persistedNullableArrayOfOneFloats) {
        setNullableArrayOfOneFloats(nullableArrayOfOneFloats);
        this.calculatedNullableArrayOfOneFloats = calculatedNullableArrayOfOneFloats;
        this.persistedNullableArrayOfOneFloats = persistedNullableArrayOfOneFloats;
    }

    public NullableArrayOfOneFloats_4() {
        this.calculatedNullableArrayOfOneFloats = null;
        this.persistedNullableArrayOfOneFloats = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1779502349;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneFloats_4)) return false;
        final NullableArrayOfOneFloats_4 other = (NullableArrayOfOneFloats_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneFloats,
                other.nullableArrayOfOneFloats))) return false;
        if (!(this.calculatedNullableArrayOfOneFloats == other.calculatedNullableArrayOfOneFloats || this.calculatedNullableArrayOfOneFloats != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneFloats,
                        other.calculatedNullableArrayOfOneFloats)))
            return false;
        if (!(this.persistedNullableArrayOfOneFloats == other.persistedNullableArrayOfOneFloats || this.persistedNullableArrayOfOneFloats != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneFloats,
                        other.persistedNullableArrayOfOneFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneFloats_4(" + nullableArrayOfOneFloats + ','
                + calculatedNullableArrayOfOneFloats + ','
                + persistedNullableArrayOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float[] nullableArrayOfOneFloats;

    @JsonProperty("nullableArrayOfOneFloats")
    public float[] getNullableArrayOfOneFloats() {
        return nullableArrayOfOneFloats;
    }

    public NullableArrayOfOneFloats_4 setNullableArrayOfOneFloats(
            final float[] value) {
        this.nullableArrayOfOneFloats = value;

        return this;
    }

    private final float[] calculatedNullableArrayOfOneFloats;

    public float[] getCalculatedNullableArrayOfOneFloats() {
        return this.calculatedNullableArrayOfOneFloats;
    }

    private final float[] persistedNullableArrayOfOneFloats;

    public float[] getPersistedNullableArrayOfOneFloats() {
        return this.persistedNullableArrayOfOneFloats;
    }
}

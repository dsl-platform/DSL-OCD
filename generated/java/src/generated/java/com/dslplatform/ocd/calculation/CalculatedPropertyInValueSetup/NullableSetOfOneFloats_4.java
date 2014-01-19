package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneFloats_4 implements java.io.Serializable {
    public NullableSetOfOneFloats_4(
            final java.util.Set<Float> nullableSetOfOneFloats,
            final java.util.Set<Float> calculatedNullableSetOfOneFloats,
            final java.util.Set<Float> persistedNullableSetOfOneFloats) {
        setNullableSetOfOneFloats(nullableSetOfOneFloats);
        this.calculatedNullableSetOfOneFloats = calculatedNullableSetOfOneFloats;
        this.persistedNullableSetOfOneFloats = persistedNullableSetOfOneFloats;
    }

    public NullableSetOfOneFloats_4() {
        this.calculatedNullableSetOfOneFloats = null;
        this.persistedNullableSetOfOneFloats = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 545838852;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneFloats_4)) return false;
        final NullableSetOfOneFloats_4 other = (NullableSetOfOneFloats_4) obj;

        if (!(this.nullableSetOfOneFloats == other.nullableSetOfOneFloats || this.nullableSetOfOneFloats != null
                && this.nullableSetOfOneFloats
                        .equals(other.nullableSetOfOneFloats))) return false;
        if (!(this.calculatedNullableSetOfOneFloats == other.calculatedNullableSetOfOneFloats || this.calculatedNullableSetOfOneFloats != null
                && this.calculatedNullableSetOfOneFloats
                        .equals(other.calculatedNullableSetOfOneFloats)))
            return false;
        if (!(this.persistedNullableSetOfOneFloats == other.persistedNullableSetOfOneFloats || this.persistedNullableSetOfOneFloats != null
                && this.persistedNullableSetOfOneFloats
                        .equals(other.persistedNullableSetOfOneFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneFloats_4(" + nullableSetOfOneFloats + ','
                + calculatedNullableSetOfOneFloats + ','
                + persistedNullableSetOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> nullableSetOfOneFloats;

    @JsonProperty("nullableSetOfOneFloats")
    public java.util.Set<Float> getNullableSetOfOneFloats() {
        return nullableSetOfOneFloats;
    }

    public NullableSetOfOneFloats_4 setNullableSetOfOneFloats(
            final java.util.Set<Float> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneFloats = value;

        return this;
    }

    private final java.util.Set<Float> calculatedNullableSetOfOneFloats;

    public java.util.Set<Float> getCalculatedNullableSetOfOneFloats() {
        return this.calculatedNullableSetOfOneFloats;
    }

    private final java.util.Set<Float> persistedNullableSetOfOneFloats;

    public java.util.Set<Float> getPersistedNullableSetOfOneFloats() {
        return this.persistedNullableSetOfOneFloats;
    }
}

package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableFloats_4 implements
        java.io.Serializable {
    public NullableSetOfNullableFloats_4(
            final java.util.Set<Float> nullableSetOfNullableFloats,
            final java.util.Set<Float> calculatedNullableSetOfNullableFloats,
            final java.util.Set<Float> persistedNullableSetOfNullableFloats) {
        setNullableSetOfNullableFloats(nullableSetOfNullableFloats);
        this.calculatedNullableSetOfNullableFloats = calculatedNullableSetOfNullableFloats;
        this.persistedNullableSetOfNullableFloats = persistedNullableSetOfNullableFloats;
    }

    public NullableSetOfNullableFloats_4() {
        this.calculatedNullableSetOfNullableFloats = null;
        this.persistedNullableSetOfNullableFloats = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 377400203;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableFloats_4)) return false;
        final NullableSetOfNullableFloats_4 other = (NullableSetOfNullableFloats_4) obj;

        if (!(this.nullableSetOfNullableFloats == other.nullableSetOfNullableFloats || this.nullableSetOfNullableFloats != null
                && this.nullableSetOfNullableFloats
                        .equals(other.nullableSetOfNullableFloats)))
            return false;
        if (!(this.calculatedNullableSetOfNullableFloats == other.calculatedNullableSetOfNullableFloats || this.calculatedNullableSetOfNullableFloats != null
                && this.calculatedNullableSetOfNullableFloats
                        .equals(other.calculatedNullableSetOfNullableFloats)))
            return false;
        if (!(this.persistedNullableSetOfNullableFloats == other.persistedNullableSetOfNullableFloats || this.persistedNullableSetOfNullableFloats != null
                && this.persistedNullableSetOfNullableFloats
                        .equals(other.persistedNullableSetOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableFloats_4(" + nullableSetOfNullableFloats
                + ',' + calculatedNullableSetOfNullableFloats + ','
                + persistedNullableSetOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Float> nullableSetOfNullableFloats;

    @JsonProperty("nullableSetOfNullableFloats")
    public java.util.Set<Float> getNullableSetOfNullableFloats() {
        return nullableSetOfNullableFloats;
    }

    public NullableSetOfNullableFloats_4 setNullableSetOfNullableFloats(
            final java.util.Set<Float> value) {
        this.nullableSetOfNullableFloats = value;

        return this;
    }

    private final java.util.Set<Float> calculatedNullableSetOfNullableFloats;

    public java.util.Set<Float> getCalculatedNullableSetOfNullableFloats() {
        return this.calculatedNullableSetOfNullableFloats;
    }

    private final java.util.Set<Float> persistedNullableSetOfNullableFloats;

    public java.util.Set<Float> getPersistedNullableSetOfNullableFloats() {
        return this.persistedNullableSetOfNullableFloats;
    }
}

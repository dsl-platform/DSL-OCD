package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableFloats_4 implements
        java.io.Serializable {
    public NullableListOfNullableFloats_4(
            final java.util.List<Float> nullableListOfNullableFloats,
            final java.util.List<Float> calculatedNullableListOfNullableFloats,
            final java.util.List<Float> persistedNullableListOfNullableFloats) {
        setNullableListOfNullableFloats(nullableListOfNullableFloats);
        this.calculatedNullableListOfNullableFloats = calculatedNullableListOfNullableFloats;
        this.persistedNullableListOfNullableFloats = persistedNullableListOfNullableFloats;
    }

    public NullableListOfNullableFloats_4() {
        this.calculatedNullableListOfNullableFloats = null;
        this.persistedNullableListOfNullableFloats = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 564345051;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableFloats_4)) return false;
        final NullableListOfNullableFloats_4 other = (NullableListOfNullableFloats_4) obj;

        if (!(this.nullableListOfNullableFloats == other.nullableListOfNullableFloats || this.nullableListOfNullableFloats != null
                && this.nullableListOfNullableFloats
                        .equals(other.nullableListOfNullableFloats)))
            return false;
        if (!(this.calculatedNullableListOfNullableFloats == other.calculatedNullableListOfNullableFloats || this.calculatedNullableListOfNullableFloats != null
                && this.calculatedNullableListOfNullableFloats
                        .equals(other.calculatedNullableListOfNullableFloats)))
            return false;
        if (!(this.persistedNullableListOfNullableFloats == other.persistedNullableListOfNullableFloats || this.persistedNullableListOfNullableFloats != null
                && this.persistedNullableListOfNullableFloats
                        .equals(other.persistedNullableListOfNullableFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableFloats_4(" + nullableListOfNullableFloats
                + ',' + calculatedNullableListOfNullableFloats + ','
                + persistedNullableListOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> nullableListOfNullableFloats;

    @JsonProperty("nullableListOfNullableFloats")
    public java.util.List<Float> getNullableListOfNullableFloats() {
        return nullableListOfNullableFloats;
    }

    public NullableListOfNullableFloats_4 setNullableListOfNullableFloats(
            final java.util.List<Float> value) {
        this.nullableListOfNullableFloats = value;

        return this;
    }

    private final java.util.List<Float> calculatedNullableListOfNullableFloats;

    public java.util.List<Float> getCalculatedNullableListOfNullableFloats() {
        return this.calculatedNullableListOfNullableFloats;
    }

    private final java.util.List<Float> persistedNullableListOfNullableFloats;

    public java.util.List<Float> getPersistedNullableListOfNullableFloats() {
        return this.persistedNullableListOfNullableFloats;
    }
}

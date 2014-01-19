package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneFloats_4 implements java.io.Serializable {
    public NullableListOfOneFloats_4(
            final java.util.List<Float> nullableListOfOneFloats,
            final java.util.List<Float> calculatedNullableListOfOneFloats,
            final java.util.List<Float> persistedNullableListOfOneFloats) {
        setNullableListOfOneFloats(nullableListOfOneFloats);
        this.calculatedNullableListOfOneFloats = calculatedNullableListOfOneFloats;
        this.persistedNullableListOfOneFloats = persistedNullableListOfOneFloats;
    }

    public NullableListOfOneFloats_4() {
        this.calculatedNullableListOfOneFloats = null;
        this.persistedNullableListOfOneFloats = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 881314314;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneFloats_4)) return false;
        final NullableListOfOneFloats_4 other = (NullableListOfOneFloats_4) obj;

        if (!(this.nullableListOfOneFloats == other.nullableListOfOneFloats || this.nullableListOfOneFloats != null
                && this.nullableListOfOneFloats
                        .equals(other.nullableListOfOneFloats))) return false;
        if (!(this.calculatedNullableListOfOneFloats == other.calculatedNullableListOfOneFloats || this.calculatedNullableListOfOneFloats != null
                && this.calculatedNullableListOfOneFloats
                        .equals(other.calculatedNullableListOfOneFloats)))
            return false;
        if (!(this.persistedNullableListOfOneFloats == other.persistedNullableListOfOneFloats || this.persistedNullableListOfOneFloats != null
                && this.persistedNullableListOfOneFloats
                        .equals(other.persistedNullableListOfOneFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneFloats_4(" + nullableListOfOneFloats + ','
                + calculatedNullableListOfOneFloats + ','
                + persistedNullableListOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> nullableListOfOneFloats;

    @JsonProperty("nullableListOfOneFloats")
    public java.util.List<Float> getNullableListOfOneFloats() {
        return nullableListOfOneFloats;
    }

    public NullableListOfOneFloats_4 setNullableListOfOneFloats(
            final java.util.List<Float> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneFloats = value;

        return this;
    }

    private final java.util.List<Float> calculatedNullableListOfOneFloats;

    public java.util.List<Float> getCalculatedNullableListOfOneFloats() {
        return this.calculatedNullableListOfOneFloats;
    }

    private final java.util.List<Float> persistedNullableListOfOneFloats;

    public java.util.List<Float> getPersistedNullableListOfOneFloats() {
        return this.persistedNullableListOfOneFloats;
    }
}

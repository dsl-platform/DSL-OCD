package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneMaps_4 implements java.io.Serializable {
    public NullableArrayOfOneMaps_4(
            final java.util.Map<String, String>[] nullableArrayOfOneMaps,
            final java.util.Map<String, String>[] calculatedNullableArrayOfOneMaps,
            final java.util.Map<String, String>[] persistedNullableArrayOfOneMaps) {
        setNullableArrayOfOneMaps(nullableArrayOfOneMaps);
        this.calculatedNullableArrayOfOneMaps = calculatedNullableArrayOfOneMaps;
        this.persistedNullableArrayOfOneMaps = persistedNullableArrayOfOneMaps;
    }

    public NullableArrayOfOneMaps_4() {
        this.calculatedNullableArrayOfOneMaps = null;
        this.persistedNullableArrayOfOneMaps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1764816319;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneMaps_4)) return false;
        final NullableArrayOfOneMaps_4 other = (NullableArrayOfOneMaps_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneMaps,
                other.nullableArrayOfOneMaps))) return false;
        if (!(this.calculatedNullableArrayOfOneMaps == other.calculatedNullableArrayOfOneMaps || this.calculatedNullableArrayOfOneMaps != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneMaps,
                        other.calculatedNullableArrayOfOneMaps))) return false;
        if (!(this.persistedNullableArrayOfOneMaps == other.persistedNullableArrayOfOneMaps || this.persistedNullableArrayOfOneMaps != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneMaps,
                        other.persistedNullableArrayOfOneMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneMaps_4(" + nullableArrayOfOneMaps + ','
                + calculatedNullableArrayOfOneMaps + ','
                + persistedNullableArrayOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] nullableArrayOfOneMaps;

    @JsonProperty("nullableArrayOfOneMaps")
    public java.util.Map<String, String>[] getNullableArrayOfOneMaps() {
        return nullableArrayOfOneMaps;
    }

    public NullableArrayOfOneMaps_4 setNullableArrayOfOneMaps(
            final java.util.Map<String, String>[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneMaps = value;

        return this;
    }

    private final java.util.Map<String, String>[] calculatedNullableArrayOfOneMaps;

    public java.util.Map<String, String>[] getCalculatedNullableArrayOfOneMaps() {
        return this.calculatedNullableArrayOfOneMaps;
    }

    private final java.util.Map<String, String>[] persistedNullableArrayOfOneMaps;

    public java.util.Map<String, String>[] getPersistedNullableArrayOfOneMaps() {
        return this.persistedNullableArrayOfOneMaps;
    }
}

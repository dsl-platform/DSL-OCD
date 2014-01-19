package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableFloats_5 implements java.io.Serializable {
    public OneArrayOfNullableFloats_5(
            final Float[] oneArrayOfNullableFloats,
            final Float[] calculatedOneArrayOfNullableFloats,
            final Float[] persistedOneArrayOfNullableFloats) {
        setOneArrayOfNullableFloats(oneArrayOfNullableFloats);
        this.calculatedOneArrayOfNullableFloats = calculatedOneArrayOfNullableFloats;
        this.persistedOneArrayOfNullableFloats = persistedOneArrayOfNullableFloats;
    }

    public OneArrayOfNullableFloats_5() {
        this.oneArrayOfNullableFloats = new Float[] {};
        this.calculatedOneArrayOfNullableFloats = new Float[] {};
        this.persistedOneArrayOfNullableFloats = new Float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 522512808;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableFloats_5)) return false;
        final OneArrayOfNullableFloats_5 other = (OneArrayOfNullableFloats_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableFloats,
                other.oneArrayOfNullableFloats))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableFloats,
                other.calculatedOneArrayOfNullableFloats))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableFloats,
                other.persistedOneArrayOfNullableFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableFloats_5(" + oneArrayOfNullableFloats + ','
                + calculatedOneArrayOfNullableFloats + ','
                + persistedOneArrayOfNullableFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] oneArrayOfNullableFloats;

    @JsonProperty("oneArrayOfNullableFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Float[] getOneArrayOfNullableFloats() {
        return oneArrayOfNullableFloats;
    }

    public OneArrayOfNullableFloats_5 setOneArrayOfNullableFloats(
            final Float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableFloats\" cannot be null!");
        this.oneArrayOfNullableFloats = value;

        return this;
    }

    private final Float[] calculatedOneArrayOfNullableFloats;

    public Float[] getCalculatedOneArrayOfNullableFloats() {
        return this.calculatedOneArrayOfNullableFloats;
    }

    private final Float[] persistedOneArrayOfNullableFloats;

    public Float[] getPersistedOneArrayOfNullableFloats() {
        return this.persistedOneArrayOfNullableFloats;
    }
}

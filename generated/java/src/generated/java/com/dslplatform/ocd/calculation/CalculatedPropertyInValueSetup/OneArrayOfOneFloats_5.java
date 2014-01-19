package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneFloats_5 implements java.io.Serializable {
    public OneArrayOfOneFloats_5(
            final float[] oneArrayOfOneFloats,
            final float[] calculatedOneArrayOfOneFloats,
            final float[] persistedOneArrayOfOneFloats) {
        setOneArrayOfOneFloats(oneArrayOfOneFloats);
        this.calculatedOneArrayOfOneFloats = calculatedOneArrayOfOneFloats;
        this.persistedOneArrayOfOneFloats = persistedOneArrayOfOneFloats;
    }

    public OneArrayOfOneFloats_5() {
        this.oneArrayOfOneFloats = new float[] {};
        this.calculatedOneArrayOfOneFloats = new float[] {};
        this.persistedOneArrayOfOneFloats = new float[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 844884183;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneFloats_5)) return false;
        final OneArrayOfOneFloats_5 other = (OneArrayOfOneFloats_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneFloats,
                other.oneArrayOfOneFloats))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneFloats,
                other.calculatedOneArrayOfOneFloats))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneFloats,
                other.persistedOneArrayOfOneFloats))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneFloats_5(" + oneArrayOfOneFloats + ','
                + calculatedOneArrayOfOneFloats + ','
                + persistedOneArrayOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float[] oneArrayOfOneFloats;

    @JsonProperty("oneArrayOfOneFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public float[] getOneArrayOfOneFloats() {
        return oneArrayOfOneFloats;
    }

    public OneArrayOfOneFloats_5 setOneArrayOfOneFloats(final float[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneFloats\" cannot be null!");
        this.oneArrayOfOneFloats = value;

        return this;
    }

    private final float[] calculatedOneArrayOfOneFloats;

    public float[] getCalculatedOneArrayOfOneFloats() {
        return this.calculatedOneArrayOfOneFloats;
    }

    private final float[] persistedOneArrayOfOneFloats;

    public float[] getPersistedOneArrayOfOneFloats() {
        return this.persistedOneArrayOfOneFloats;
    }
}

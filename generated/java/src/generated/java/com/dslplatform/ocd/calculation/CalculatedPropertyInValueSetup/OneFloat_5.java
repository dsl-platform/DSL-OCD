package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneFloat_5 implements java.io.Serializable {
    public OneFloat_5(
            final float oneFloat,
            final float calculatedOneFloat,
            final float persistedOneFloat) {
        setOneFloat(oneFloat);
        this.calculatedOneFloat = calculatedOneFloat;
        this.persistedOneFloat = persistedOneFloat;
    }

    public OneFloat_5() {
        this.oneFloat = 0.0f;
        this.calculatedOneFloat = 0.0f;
        this.persistedOneFloat = 0.0f;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1660933036;
        result = prime * result + (Float.valueOf(this.oneFloat).hashCode());
        result = prime * result
                + (Float.valueOf(this.calculatedOneFloat).hashCode());
        result = prime * result
                + (Float.valueOf(this.persistedOneFloat).hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneFloat_5)) return false;
        final OneFloat_5 other = (OneFloat_5) obj;

        if (!(Float.floatToIntBits(this.oneFloat) == Float
                .floatToIntBits(other.oneFloat))) return false;
        if (!(Float.floatToIntBits(this.calculatedOneFloat) == Float
                .floatToIntBits(other.calculatedOneFloat))) return false;
        if (!(Float.floatToIntBits(this.persistedOneFloat) == Float
                .floatToIntBits(other.persistedOneFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneFloat_5(" + oneFloat + ',' + calculatedOneFloat + ','
                + persistedOneFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float oneFloat;

    @JsonProperty("oneFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public float getOneFloat() {
        return oneFloat;
    }

    public OneFloat_5 setOneFloat(final float value) {
        this.oneFloat = value;

        return this;
    }

    private final float calculatedOneFloat;

    public float getCalculatedOneFloat() {
        return this.calculatedOneFloat;
    }

    private final float persistedOneFloat;

    public float getPersistedOneFloat() {
        return this.persistedOneFloat;
    }
}

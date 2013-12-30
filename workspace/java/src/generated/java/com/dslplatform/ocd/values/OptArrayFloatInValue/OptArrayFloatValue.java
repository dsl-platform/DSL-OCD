package com.dslplatform.ocd.values.OptArrayFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayFloatValue implements java.io.Serializable {
    public OptArrayFloatValue(
            final float[] optArrayFloat) {
        setOptArrayFloat(optArrayFloat);
    }

    public OptArrayFloatValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 830790619;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayFloatValue)) return false;
        final OptArrayFloatValue other = (OptArrayFloatValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayFloat, other.optArrayFloat)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayFloatValue(" + optArrayFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float[] optArrayFloat;

    @JsonProperty("optArrayFloat")
    public float[] getOptArrayFloat() {
        return optArrayFloat;
    }

    public OptArrayFloatValue setOptArrayFloat(final float[] value) {
        this.optArrayFloat = value;

        return this;
    }
}

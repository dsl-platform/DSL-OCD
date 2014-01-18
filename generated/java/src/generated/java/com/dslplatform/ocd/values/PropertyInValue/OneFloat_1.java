package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneFloat_1 implements java.io.Serializable {
    public OneFloat_1(
            final float oneFloat) {
        setOneFloat(oneFloat);
    }

    public OneFloat_1() {
        this.oneFloat = 0.0f;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 664665792;
        result = prime * result + (Float.valueOf(this.oneFloat).hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneFloat_1)) return false;
        final OneFloat_1 other = (OneFloat_1) obj;

        if (!(Float.floatToIntBits(this.oneFloat) == Float
                .floatToIntBits(other.oneFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneFloat_1(" + oneFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float oneFloat;

    @JsonProperty("oneFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public float getOneFloat() {
        return oneFloat;
    }

    public OneFloat_1 setOneFloat(final float value) {
        this.oneFloat = value;

        return this;
    }
}

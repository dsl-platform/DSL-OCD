package com.dslplatform.ocd.values.OneDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneDoubleValue implements java.io.Serializable {
    public OneDoubleValue(
            final double oneDouble) {
        setOneDouble(oneDouble);
    }

    public OneDoubleValue() {
        this.oneDouble = 0.0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 918217920;
        result = prime * result + (Double.valueOf(this.oneDouble).hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDoubleValue)) return false;
        final OneDoubleValue other = (OneDoubleValue) obj;

        if (!(Double.doubleToLongBits(this.oneDouble) == Double
                .doubleToLongBits(other.oneDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDoubleValue(" + oneDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double oneDouble;

    @JsonProperty("oneDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double getOneDouble() {
        return oneDouble;
    }

    public OneDoubleValue setOneDouble(final double value) {
        this.oneDouble = value;

        return this;
    }
}

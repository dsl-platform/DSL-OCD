package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneDouble_1 implements java.io.Serializable {
    public OneDouble_1(
            final double oneDouble) {
        setOneDouble(oneDouble);
    }

    public OneDouble_1() {
        this.oneDouble = 0.0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 820920093;
        result = prime * result + (Double.valueOf(this.oneDouble).hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDouble_1)) return false;
        final OneDouble_1 other = (OneDouble_1) obj;

        if (!(Double.doubleToLongBits(this.oneDouble) == Double
                .doubleToLongBits(other.oneDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDouble_1(" + oneDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double oneDouble;

    @JsonProperty("oneDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double getOneDouble() {
        return oneDouble;
    }

    public OneDouble_1 setOneDouble(final double value) {
        this.oneDouble = value;

        return this;
    }
}

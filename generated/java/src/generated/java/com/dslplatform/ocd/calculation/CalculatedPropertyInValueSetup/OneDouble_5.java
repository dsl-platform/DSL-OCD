package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneDouble_5 implements java.io.Serializable {
    public OneDouble_5(
            final double oneDouble,
            final double calculatedOneDouble,
            final double persistedOneDouble) {
        setOneDouble(oneDouble);
        this.calculatedOneDouble = calculatedOneDouble;
        this.persistedOneDouble = persistedOneDouble;
    }

    public OneDouble_5() {
        this.oneDouble = 0.0;
        this.calculatedOneDouble = 0.0;
        this.persistedOneDouble = 0.0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 820920097;
        result = prime * result + (Double.valueOf(this.oneDouble).hashCode());
        result = prime * result
                + (Double.valueOf(this.calculatedOneDouble).hashCode());
        result = prime * result
                + (Double.valueOf(this.persistedOneDouble).hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDouble_5)) return false;
        final OneDouble_5 other = (OneDouble_5) obj;

        if (!(Double.doubleToLongBits(this.oneDouble) == Double
                .doubleToLongBits(other.oneDouble))) return false;
        if (!(Double.doubleToLongBits(this.calculatedOneDouble) == Double
                .doubleToLongBits(other.calculatedOneDouble))) return false;
        if (!(Double.doubleToLongBits(this.persistedOneDouble) == Double
                .doubleToLongBits(other.persistedOneDouble))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDouble_5(" + oneDouble + ',' + calculatedOneDouble + ','
                + persistedOneDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double oneDouble;

    @JsonProperty("oneDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double getOneDouble() {
        return oneDouble;
    }

    public OneDouble_5 setOneDouble(final double value) {
        this.oneDouble = value;

        return this;
    }

    private final double calculatedOneDouble;

    public double getCalculatedOneDouble() {
        return this.calculatedOneDouble;
    }

    private final double persistedOneDouble;

    public double getPersistedOneDouble() {
        return this.persistedOneDouble;
    }
}

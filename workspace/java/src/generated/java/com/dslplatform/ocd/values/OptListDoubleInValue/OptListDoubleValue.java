package com.dslplatform.ocd.values.OptListDoubleInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListDoubleValue implements java.io.Serializable {
    public OptListDoubleValue(
            final java.util.List<Double> optListDouble) {
        setOptListDouble(optListDouble);
    }

    public OptListDoubleValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 48677081;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListDoubleValue)) return false;
        final OptListDoubleValue other = (OptListDoubleValue) obj;

        if (!(this.optListDouble == other.optListDouble || this.optListDouble != null
                && this.optListDouble.equals(other.optListDouble)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListDoubleValue(" + optListDouble + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> optListDouble;

    @JsonProperty("optListDouble")
    public java.util.List<Double> getOptListDouble() {
        return optListDouble;
    }

    public OptListDoubleValue setOptListDouble(
            final java.util.List<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListDouble = value;

        return this;
    }
}

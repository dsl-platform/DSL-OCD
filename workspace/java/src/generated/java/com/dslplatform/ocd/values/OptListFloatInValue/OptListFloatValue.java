package com.dslplatform.ocd.values.OptListFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListFloatValue implements java.io.Serializable {
    public OptListFloatValue(
            final java.util.List<Float> optListFloat) {
        setOptListFloat(optListFloat);
    }

    public OptListFloatValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 995971136;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListFloatValue)) return false;
        final OptListFloatValue other = (OptListFloatValue) obj;

        if (!(this.optListFloat == other.optListFloat || this.optListFloat != null
                && this.optListFloat.equals(other.optListFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListFloatValue(" + optListFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> optListFloat;

    @JsonProperty("optListFloat")
    public java.util.List<Float> getOptListFloat() {
        return optListFloat;
    }

    public OptListFloatValue setOptListFloat(final java.util.List<Float> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListFloat = value;

        return this;
    }
}

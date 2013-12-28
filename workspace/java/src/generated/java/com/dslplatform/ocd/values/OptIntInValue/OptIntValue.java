package com.dslplatform.ocd.values.OptIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptIntValue implements java.io.Serializable {
    public OptIntValue(
            final Integer optInt) {
        setOptInt(optInt);
    }

    public OptIntValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1745782309;
        result = prime * result
                + (this.optInt != null ? this.optInt.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptIntValue)) return false;
        final OptIntValue other = (OptIntValue) obj;

        if (!(this.optInt == other.optInt || this.optInt != null
                && this.optInt.equals(other.optInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptIntValue(" + optInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer optInt;

    @JsonProperty("optInt")
    public Integer getOptInt() {
        return optInt;
    }

    public OptIntValue setOptInt(final Integer value) {
        this.optInt = value;

        return this;
    }
}

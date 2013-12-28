package com.dslplatform.ocd.values.OptArrayOptIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptIntValue implements java.io.Serializable {
    public OptArrayOptIntValue(
            final Integer[] optArrayOptInt) {
        setOptArrayOptInt(optArrayOptInt);
    }

    public OptArrayOptIntValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1639502523;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptIntValue)) return false;
        final OptArrayOptIntValue other = (OptArrayOptIntValue) obj;

        if (!(java.util.Arrays
                .equals(this.optArrayOptInt, other.optArrayOptInt)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptIntValue(" + optArrayOptInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Integer[] optArrayOptInt;

    @JsonProperty("optArrayOptInt")
    public Integer[] getOptArrayOptInt() {
        return optArrayOptInt;
    }

    public OptArrayOptIntValue setOptArrayOptInt(final Integer[] value) {
        this.optArrayOptInt = value;

        return this;
    }
}

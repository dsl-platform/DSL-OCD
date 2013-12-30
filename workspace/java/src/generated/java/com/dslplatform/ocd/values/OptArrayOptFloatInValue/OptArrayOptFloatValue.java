package com.dslplatform.ocd.values.OptArrayOptFloatInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptFloatValue implements java.io.Serializable {
    public OptArrayOptFloatValue(
            final Float[] optArrayOptFloat) {
        setOptArrayOptFloat(optArrayOptFloat);
    }

    public OptArrayOptFloatValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 515276094;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptFloatValue)) return false;
        final OptArrayOptFloatValue other = (OptArrayOptFloatValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptFloat,
                other.optArrayOptFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptFloatValue(" + optArrayOptFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Float[] optArrayOptFloat;

    @JsonProperty("optArrayOptFloat")
    public Float[] getOptArrayOptFloat() {
        return optArrayOptFloat;
    }

    public OptArrayOptFloatValue setOptArrayOptFloat(final Float[] value) {
        this.optArrayOptFloat = value;

        return this;
    }
}

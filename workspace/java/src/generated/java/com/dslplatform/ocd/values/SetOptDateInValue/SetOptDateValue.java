package com.dslplatform.ocd.values.SetOptDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptDateValue implements java.io.Serializable {
    public SetOptDateValue(
            final java.util.Set<org.joda.time.LocalDate> setOptDate) {
        setSetOptDate(setOptDate);
    }

    public SetOptDateValue() {
        this.setOptDate = new java.util.HashSet<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1768063884;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptDateValue)) return false;
        final SetOptDateValue other = (SetOptDateValue) obj;

        if (!(this.setOptDate.equals(other.setOptDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptDateValue(" + setOptDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> setOptDate;

    @JsonProperty("setOptDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.LocalDate> getSetOptDate() {
        return setOptDate;
    }

    public SetOptDateValue setSetOptDate(
            final java.util.Set<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptDate\" cannot be null!");
        this.setOptDate = value;

        return this;
    }
}

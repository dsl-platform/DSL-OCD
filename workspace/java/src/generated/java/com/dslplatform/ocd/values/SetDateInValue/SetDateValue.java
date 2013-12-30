package com.dslplatform.ocd.values.SetDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetDateValue implements java.io.Serializable {
    public SetDateValue(
            final java.util.Set<org.joda.time.LocalDate> setDate) {
        setSetDate(setDate);
    }

    public SetDateValue() {
        this.setDate = new java.util.HashSet<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1005462115;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetDateValue)) return false;
        final SetDateValue other = (SetDateValue) obj;

        if (!(this.setDate.equals(other.setDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetDateValue(" + setDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> setDate;

    @JsonProperty("setDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.LocalDate> getSetDate() {
        return setDate;
    }

    public SetDateValue setSetDate(
            final java.util.Set<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setDate\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setDate = value;

        return this;
    }
}

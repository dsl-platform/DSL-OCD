package com.dslplatform.ocd.values.OptSetDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetDateValue implements java.io.Serializable {
    public OptSetDateValue(
            final java.util.Set<org.joda.time.LocalDate> optSetDate) {
        setOptSetDate(optSetDate);
    }

    public OptSetDateValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 495297470;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetDateValue)) return false;
        final OptSetDateValue other = (OptSetDateValue) obj;

        if (!(this.optSetDate == other.optSetDate || this.optSetDate != null
                && this.optSetDate.equals(other.optSetDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetDateValue(" + optSetDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> optSetDate;

    @JsonProperty("optSetDate")
    public java.util.Set<org.joda.time.LocalDate> getOptSetDate() {
        return optSetDate;
    }

    public OptSetDateValue setOptSetDate(
            final java.util.Set<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetDate = value;

        return this;
    }
}

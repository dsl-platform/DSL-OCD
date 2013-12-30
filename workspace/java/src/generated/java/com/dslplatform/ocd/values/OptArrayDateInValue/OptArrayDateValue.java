package com.dslplatform.ocd.values.OptArrayDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayDateValue implements java.io.Serializable {
    public OptArrayDateValue(
            final org.joda.time.LocalDate[] optArrayDate) {
        setOptArrayDate(optArrayDate);
    }

    public OptArrayDateValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 916219597;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayDateValue)) return false;
        final OptArrayDateValue other = (OptArrayDateValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayDate, other.optArrayDate)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayDateValue(" + optArrayDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] optArrayDate;

    @JsonProperty("optArrayDate")
    public org.joda.time.LocalDate[] getOptArrayDate() {
        return optArrayDate;
    }

    public OptArrayDateValue setOptArrayDate(
            final org.joda.time.LocalDate[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayDate = value;

        return this;
    }
}

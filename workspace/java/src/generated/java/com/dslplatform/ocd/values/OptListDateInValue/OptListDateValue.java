package com.dslplatform.ocd.values.OptListDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListDateValue implements java.io.Serializable {
    public OptListDateValue(
            final java.util.List<org.joda.time.LocalDate> optListDate) {
        setOptListDate(optListDate);
    }

    public OptListDateValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1195404180;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListDateValue)) return false;
        final OptListDateValue other = (OptListDateValue) obj;

        if (!(this.optListDate == other.optListDate || this.optListDate != null
                && this.optListDate.equals(other.optListDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListDateValue(" + optListDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> optListDate;

    @JsonProperty("optListDate")
    public java.util.List<org.joda.time.LocalDate> getOptListDate() {
        return optListDate;
    }

    public OptListDateValue setOptListDate(
            final java.util.List<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListDate = value;

        return this;
    }
}

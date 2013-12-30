package com.dslplatform.ocd.values.OptSetOptDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptDateValue implements java.io.Serializable {
    public OptSetOptDateValue(
            final java.util.Set<org.joda.time.LocalDate> optSetOptDate) {
        setOptSetOptDate(optSetOptDate);
    }

    public OptSetOptDateValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 767166767;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptDateValue)) return false;
        final OptSetOptDateValue other = (OptSetOptDateValue) obj;

        if (!(this.optSetOptDate == other.optSetOptDate || this.optSetOptDate != null
                && this.optSetOptDate.equals(other.optSetOptDate)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptDateValue(" + optSetOptDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> optSetOptDate;

    @JsonProperty("optSetOptDate")
    public java.util.Set<org.joda.time.LocalDate> getOptSetOptDate() {
        return optSetOptDate;
    }

    public OptSetOptDateValue setOptSetOptDate(
            final java.util.Set<org.joda.time.LocalDate> value) {
        this.optSetOptDate = value;

        return this;
    }
}

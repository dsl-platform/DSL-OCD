package com.dslplatform.ocd.values.OptDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptDateValue implements java.io.Serializable {
    public OptDateValue(
            final org.joda.time.LocalDate optDate) {
        setOptDate(optDate);
    }

    public OptDateValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1449804112;
        result = prime * result
                + (this.optDate != null ? this.optDate.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptDateValue)) return false;
        final OptDateValue other = (OptDateValue) obj;

        if (!(this.optDate == other.optDate || this.optDate != null
                && this.optDate.equals(other.optDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptDateValue(" + optDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate optDate;

    @JsonProperty("optDate")
    public org.joda.time.LocalDate getOptDate() {
        return optDate;
    }

    public OptDateValue setOptDate(final org.joda.time.LocalDate value) {
        this.optDate = value;

        return this;
    }
}

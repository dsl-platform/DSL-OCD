package com.dslplatform.ocd.values.OptArrayOptDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptDateValue implements java.io.Serializable {
    public OptArrayOptDateValue(
            final org.joda.time.LocalDate[] optArrayOptDate) {
        setOptArrayOptDate(optArrayOptDate);
    }

    public OptArrayOptDateValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 93933030;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptDateValue)) return false;
        final OptArrayOptDateValue other = (OptArrayOptDateValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayOptDate,
                other.optArrayOptDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptDateValue(" + optArrayOptDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] optArrayOptDate;

    @JsonProperty("optArrayOptDate")
    public org.joda.time.LocalDate[] getOptArrayOptDate() {
        return optArrayOptDate;
    }

    public OptArrayOptDateValue setOptArrayOptDate(
            final org.joda.time.LocalDate[] value) {
        this.optArrayOptDate = value;

        return this;
    }
}

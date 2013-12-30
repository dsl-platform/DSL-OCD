package com.dslplatform.ocd.values.OptListOptDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptDateValue implements java.io.Serializable {
    public OptListOptDateValue(
            final java.util.List<org.joda.time.LocalDate> optListOptDate) {
        setOptListOptDate(optListOptDate);
    }

    public OptListOptDateValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1686007295;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptDateValue)) return false;
        final OptListOptDateValue other = (OptListOptDateValue) obj;

        if (!(this.optListOptDate == other.optListOptDate || this.optListOptDate != null
                && this.optListOptDate.equals(other.optListOptDate)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptDateValue(" + optListOptDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> optListOptDate;

    @JsonProperty("optListOptDate")
    public java.util.List<org.joda.time.LocalDate> getOptListOptDate() {
        return optListOptDate;
    }

    public OptListOptDateValue setOptListOptDate(
            final java.util.List<org.joda.time.LocalDate> value) {
        this.optListOptDate = value;

        return this;
    }
}

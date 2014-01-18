package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneDate_1 implements java.io.Serializable {
    public OneDate_1(
            final org.joda.time.LocalDate oneDate) {
        setOneDate(oneDate);
    }

    public OneDate_1() {
        this.oneDate = new org.joda.time.LocalDate();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1900790350;
        result = prime * result
                + (this.oneDate != null ? this.oneDate.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDate_1)) return false;
        final OneDate_1 other = (OneDate_1) obj;

        if (!(this.oneDate.equals(other.oneDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDate_1(" + oneDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate oneDate;

    @JsonProperty("oneDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate getOneDate() {
        return oneDate;
    }

    public OneDate_1 setOneDate(final org.joda.time.LocalDate value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDate\" cannot be null!");
        this.oneDate = value;

        return this;
    }
}

package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneDateValue1 implements java.io.Serializable {
    public OneDateValue1(
            final org.joda.time.LocalDate oneDate) {
        setOneDate(oneDate);
    }

    public OneDateValue1() {
        this.oneDate = new org.joda.time.LocalDate();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 325363166;
        result = prime * result
                + (this.oneDate != null ? this.oneDate.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDateValue1)) return false;
        final OneDateValue1 other = (OneDateValue1) obj;

        if (!(this.oneDate.equals(other.oneDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDateValue1(" + oneDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate oneDate;

    @JsonProperty("oneDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate getOneDate() {
        return oneDate;
    }

    public OneDateValue1 setOneDate(final org.joda.time.LocalDate value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDate\" cannot be null!");
        this.oneDate = value;

        return this;
    }
}

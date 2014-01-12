package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneBooleansValue5 implements
        java.io.Serializable {
    public NullableListOfOneBooleansValue5(
            final java.util.List<Boolean> nullableListOfOneBooleans) {
        setNullableListOfOneBooleans(nullableListOfOneBooleans);
    }

    public NullableListOfOneBooleansValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 19617587;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneBooleansValue5)) return false;
        final NullableListOfOneBooleansValue5 other = (NullableListOfOneBooleansValue5) obj;

        if (!(this.nullableListOfOneBooleans == other.nullableListOfOneBooleans || this.nullableListOfOneBooleans != null
                && this.nullableListOfOneBooleans
                        .equals(other.nullableListOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneBooleansValue5(" + nullableListOfOneBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> nullableListOfOneBooleans;

    @JsonProperty("nullableListOfOneBooleans")
    public java.util.List<Boolean> getNullableListOfOneBooleans() {
        return nullableListOfOneBooleans;
    }

    public NullableListOfOneBooleansValue5 setNullableListOfOneBooleans(
            final java.util.List<Boolean> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneBooleans = value;

        return this;
    }
}

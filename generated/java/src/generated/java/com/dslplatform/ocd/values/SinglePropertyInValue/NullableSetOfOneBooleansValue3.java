package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneBooleansValue3 implements
        java.io.Serializable {
    public NullableSetOfOneBooleansValue3(
            final java.util.Set<Boolean> nullableSetOfOneBooleans) {
        setNullableSetOfOneBooleans(nullableSetOfOneBooleans);
    }

    public NullableSetOfOneBooleansValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1568109501;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneBooleansValue3)) return false;
        final NullableSetOfOneBooleansValue3 other = (NullableSetOfOneBooleansValue3) obj;

        if (!(this.nullableSetOfOneBooleans == other.nullableSetOfOneBooleans || this.nullableSetOfOneBooleans != null
                && this.nullableSetOfOneBooleans
                        .equals(other.nullableSetOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneBooleansValue3(" + nullableSetOfOneBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> nullableSetOfOneBooleans;

    @JsonProperty("nullableSetOfOneBooleans")
    public java.util.Set<Boolean> getNullableSetOfOneBooleans() {
        return nullableSetOfOneBooleans;
    }

    public NullableSetOfOneBooleansValue3 setNullableSetOfOneBooleans(
            final java.util.Set<Boolean> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneBooleans = value;

        return this;
    }
}

package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableBooleansValue4 implements
        java.io.Serializable {
    public NullableSetOfNullableBooleansValue4(
            final java.util.Set<Boolean> nullableSetOfNullableBooleans) {
        setNullableSetOfNullableBooleans(nullableSetOfNullableBooleans);
    }

    public NullableSetOfNullableBooleansValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 899819079;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableBooleansValue4))
            return false;
        final NullableSetOfNullableBooleansValue4 other = (NullableSetOfNullableBooleansValue4) obj;

        if (!(this.nullableSetOfNullableBooleans == other.nullableSetOfNullableBooleans || this.nullableSetOfNullableBooleans != null
                && this.nullableSetOfNullableBooleans
                        .equals(other.nullableSetOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableBooleansValue4("
                + nullableSetOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> nullableSetOfNullableBooleans;

    @JsonProperty("nullableSetOfNullableBooleans")
    public java.util.Set<Boolean> getNullableSetOfNullableBooleans() {
        return nullableSetOfNullableBooleans;
    }

    public NullableSetOfNullableBooleansValue4 setNullableSetOfNullableBooleans(
            final java.util.Set<Boolean> value) {
        this.nullableSetOfNullableBooleans = value;

        return this;
    }
}

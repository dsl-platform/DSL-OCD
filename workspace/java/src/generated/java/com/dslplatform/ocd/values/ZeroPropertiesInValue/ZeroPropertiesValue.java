package com.dslplatform.ocd.values.ZeroPropertiesInValue;

import com.fasterxml.jackson.annotation.*;

public final class ZeroPropertiesValue implements java.io.Serializable {
    public ZeroPropertiesValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1228214578;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ZeroPropertiesValue)) return false;
        final ZeroPropertiesValue other = (ZeroPropertiesValue) obj;

        return true;
    }

    @Override
    public String toString() {
        return "ZeroPropertiesValue(" + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

}

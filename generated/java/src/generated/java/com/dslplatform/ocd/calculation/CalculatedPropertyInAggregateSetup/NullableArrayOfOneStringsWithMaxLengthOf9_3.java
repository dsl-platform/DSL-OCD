package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableArrayOfOneStringsWithMaxLengthOf9_3 implements
        java.io.Serializable, AggregateRoot {
    public NullableArrayOfOneStringsWithMaxLengthOf9_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
    }

    private transient final ServiceLocator _serviceLocator;
    private transient final DomainProxy _domainProxy;
    private transient final CrudProxy _crudProxy;

    private String URI;

    @JsonProperty("URI")
    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI != null ? URI.hashCode() : super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final NullableArrayOfOneStringsWithMaxLengthOf9_3 other = (NullableArrayOfOneStringsWithMaxLengthOf9_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableArrayOfOneStringsWithMaxLengthOf9_3(" + URI + ')'
                : "new NullableArrayOfOneStringsWithMaxLengthOf9_3("
                        + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableArrayOfOneStringsWithMaxLengthOf9_3(
            final String[] nullableArrayOfOneStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableArrayOfOneStringsWithMaxLengthOf9(nullableArrayOfOneStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private NullableArrayOfOneStringsWithMaxLengthOf9_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9") final String[] nullableArrayOfOneStringsWithMaxLengthOf9,
            @JsonProperty("calculatedNullableArrayOfOneStringsWithMaxLengthOf9") final String[] calculatedNullableArrayOfOneStringsWithMaxLengthOf9,
            @JsonProperty("persistedNullableArrayOfOneStringsWithMaxLengthOf9") final String[] persistedNullableArrayOfOneStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableArrayOfOneStringsWithMaxLengthOf9 = nullableArrayOfOneStringsWithMaxLengthOf9;
        this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9 = calculatedNullableArrayOfOneStringsWithMaxLengthOf9 == null
                ? new String[] {}
                : calculatedNullableArrayOfOneStringsWithMaxLengthOf9;
        this.persistedNullableArrayOfOneStringsWithMaxLengthOf9 = persistedNullableArrayOfOneStringsWithMaxLengthOf9 == null
                ? new String[] {}
                : persistedNullableArrayOfOneStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableArrayOfOneStringsWithMaxLengthOf9_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableArrayOfOneStringsWithMaxLengthOf9_3 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableArrayOfOneStringsWithMaxLengthOf9_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableArrayOfOneStringsWithMaxLengthOf9_3.class,
                            uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableArrayOfOneStringsWithMaxLengthOf9_3.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableArrayOfOneStringsWithMaxLengthOf9_3.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfOneStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfOneStringsWithMaxLengthOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfOneStringsWithMaxLengthOf9_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfOneStringsWithMaxLengthOf9_3> specification,
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .search(specification, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count() throws java.io.IOException {
        return count(Bootstrap.getLocator());
    }

    public static long count(final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .count(NullableArrayOfOneStringsWithMaxLengthOf9_3.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableArrayOfOneStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableArrayOfOneStringsWithMaxLengthOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(specification).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private void updateWithAnother(
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneStringsWithMaxLengthOf9_3 result) {
        this.URI = result.URI;

        this.nullableArrayOfOneStringsWithMaxLengthOf9 = result.nullableArrayOfOneStringsWithMaxLengthOf9;
        this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9 = result.calculatedNullableArrayOfOneStringsWithMaxLengthOf9;
        this.persistedNullableArrayOfOneStringsWithMaxLengthOf9 = result.persistedNullableArrayOfOneStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9_3 persist()
            throws java.io.IOException {
        final NullableArrayOfOneStringsWithMaxLengthOf9_3 result;
        try {
            result = this.URI == null
                    ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    NullableArrayOfOneStringsWithMaxLengthOf9_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private String[] nullableArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9")
    public String[] getNullableArrayOfOneStringsWithMaxLengthOf9() {
        return nullableArrayOfOneStringsWithMaxLengthOf9;
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9_3 setNullableArrayOfOneStringsWithMaxLengthOf9(
            final String[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableArrayOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private String[] calculatedNullableArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("calculatedNullableArrayOfOneStringsWithMaxLengthOf9")
    public String[] getCalculatedNullableArrayOfOneStringsWithMaxLengthOf9() {
        return this.calculatedNullableArrayOfOneStringsWithMaxLengthOf9;
    }

    private String[] persistedNullableArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("persistedNullableArrayOfOneStringsWithMaxLengthOf9")
    public String[] getPersistedNullableArrayOfOneStringsWithMaxLengthOf9() {
        return this.persistedNullableArrayOfOneStringsWithMaxLengthOf9;
    }
}

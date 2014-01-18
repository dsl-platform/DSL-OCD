package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableArrayOfNullableStringsWithMaxLengthOf9_3 implements
        java.io.Serializable, AggregateRoot {
    public NullableArrayOfNullableStringsWithMaxLengthOf9_3() {
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
        final NullableArrayOfNullableStringsWithMaxLengthOf9_3 other = (NullableArrayOfNullableStringsWithMaxLengthOf9_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableArrayOfNullableStringsWithMaxLengthOf9_3(" + URI
                        + ')'
                : "new NullableArrayOfNullableStringsWithMaxLengthOf9_3("
                        + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableArrayOfNullableStringsWithMaxLengthOf9_3(
            final String[] nullableArrayOfNullableStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableArrayOfNullableStringsWithMaxLengthOf9(nullableArrayOfNullableStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private NullableArrayOfNullableStringsWithMaxLengthOf9_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableArrayOfNullableStringsWithMaxLengthOf9") final String[] nullableArrayOfNullableStringsWithMaxLengthOf9,
            @JsonProperty("calculatedNullableArrayOfNullableStringsWithMaxLengthOf9") final String[] calculatedNullableArrayOfNullableStringsWithMaxLengthOf9,
            @JsonProperty("persistedNullableArrayOfNullableStringsWithMaxLengthOf9") final String[] persistedNullableArrayOfNullableStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableArrayOfNullableStringsWithMaxLengthOf9 = nullableArrayOfNullableStringsWithMaxLengthOf9;
        this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 == null
                ? new String[] {}
                : calculatedNullableArrayOfNullableStringsWithMaxLengthOf9;
        this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = persistedNullableArrayOfNullableStringsWithMaxLengthOf9 == null
                ? new String[] {}
                : persistedNullableArrayOfNullableStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableArrayOfNullableStringsWithMaxLengthOf9_3 setID(
            final int value) {
        this.ID = value;

        return this;
    }

    public static NullableArrayOfNullableStringsWithMaxLengthOf9_3 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableArrayOfNullableStringsWithMaxLengthOf9_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableArrayOfNullableStringsWithMaxLengthOf9_3.class,
                            uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableArrayOfNullableStringsWithMaxLengthOf9_3.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(
                            NullableArrayOfNullableStringsWithMaxLengthOf9_3.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfNullableStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfNullableStringsWithMaxLengthOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfNullableStringsWithMaxLengthOf9_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableArrayOfNullableStringsWithMaxLengthOf9_3> specification,
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
                    .count(NullableArrayOfNullableStringsWithMaxLengthOf9_3.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableArrayOfNullableStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableArrayOfNullableStringsWithMaxLengthOf9_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableStringsWithMaxLengthOf9_3 result) {
        this.URI = result.URI;

        this.nullableArrayOfNullableStringsWithMaxLengthOf9 = result.nullableArrayOfNullableStringsWithMaxLengthOf9;
        this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = result.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9;
        this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = result.persistedNullableArrayOfNullableStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public NullableArrayOfNullableStringsWithMaxLengthOf9_3 persist()
            throws java.io.IOException {
        final NullableArrayOfNullableStringsWithMaxLengthOf9_3 result;
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

    public NullableArrayOfNullableStringsWithMaxLengthOf9_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy
                    .delete(NullableArrayOfNullableStringsWithMaxLengthOf9_3.class,
                            URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private String[] nullableArrayOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableArrayOfNullableStringsWithMaxLengthOf9")
    public String[] getNullableArrayOfNullableStringsWithMaxLengthOf9() {
        return nullableArrayOfNullableStringsWithMaxLengthOf9;
    }

    public NullableArrayOfNullableStringsWithMaxLengthOf9_3 setNullableArrayOfNullableStringsWithMaxLengthOf9(
            final String[] value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableArrayOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private String[] calculatedNullableArrayOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("calculatedNullableArrayOfNullableStringsWithMaxLengthOf9")
    public String[] getCalculatedNullableArrayOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedNullableArrayOfNullableStringsWithMaxLengthOf9;
    }

    private String[] persistedNullableArrayOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("persistedNullableArrayOfNullableStringsWithMaxLengthOf9")
    public String[] getPersistedNullableArrayOfNullableStringsWithMaxLengthOf9() {
        return this.persistedNullableArrayOfNullableStringsWithMaxLengthOf9;
    }
}

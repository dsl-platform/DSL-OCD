package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfNullableStringsWithMaxLengthOf9_3 implements
        java.io.Serializable, AggregateRoot {
    public NullableListOfNullableStringsWithMaxLengthOf9_3() {
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
        final NullableListOfNullableStringsWithMaxLengthOf9_3 other = (NullableListOfNullableStringsWithMaxLengthOf9_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableListOfNullableStringsWithMaxLengthOf9_3(" + URI
                        + ')'
                : "new NullableListOfNullableStringsWithMaxLengthOf9_3("
                        + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfNullableStringsWithMaxLengthOf9_3(
            final java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfNullableStringsWithMaxLengthOf9(nullableListOfNullableStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private NullableListOfNullableStringsWithMaxLengthOf9_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfNullableStringsWithMaxLengthOf9") final java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9,
            @JsonProperty("calculatedNullableListOfNullableStringsWithMaxLengthOf9") final java.util.List<String> calculatedNullableListOfNullableStringsWithMaxLengthOf9,
            @JsonProperty("persistedNullableListOfNullableStringsWithMaxLengthOf9") final java.util.List<String> persistedNullableListOfNullableStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfNullableStringsWithMaxLengthOf9 = nullableListOfNullableStringsWithMaxLengthOf9;
        this.calculatedNullableListOfNullableStringsWithMaxLengthOf9 = calculatedNullableListOfNullableStringsWithMaxLengthOf9 == null
                ? new java.util.ArrayList<String>()
                : calculatedNullableListOfNullableStringsWithMaxLengthOf9;
        this.persistedNullableListOfNullableStringsWithMaxLengthOf9 = persistedNullableListOfNullableStringsWithMaxLengthOf9 == null
                ? new java.util.ArrayList<String>()
                : persistedNullableListOfNullableStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfNullableStringsWithMaxLengthOf9_3 setID(
            final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfNullableStringsWithMaxLengthOf9_3 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfNullableStringsWithMaxLengthOf9_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfNullableStringsWithMaxLengthOf9_3.class,
                            uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfNullableStringsWithMaxLengthOf9_3.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(
                            NullableListOfNullableStringsWithMaxLengthOf9_3.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfNullableStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfNullableStringsWithMaxLengthOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfNullableStringsWithMaxLengthOf9_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfNullableStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfNullableStringsWithMaxLengthOf9_3> specification,
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
                    .count(NullableListOfNullableStringsWithMaxLengthOf9_3.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfNullableStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfNullableStringsWithMaxLengthOf9_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableStringsWithMaxLengthOf9_3 result) {
        this.URI = result.URI;

        this.nullableListOfNullableStringsWithMaxLengthOf9 = result.nullableListOfNullableStringsWithMaxLengthOf9;
        this.calculatedNullableListOfNullableStringsWithMaxLengthOf9 = result.calculatedNullableListOfNullableStringsWithMaxLengthOf9;
        this.persistedNullableListOfNullableStringsWithMaxLengthOf9 = result.persistedNullableListOfNullableStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public NullableListOfNullableStringsWithMaxLengthOf9_3 persist()
            throws java.io.IOException {
        final NullableListOfNullableStringsWithMaxLengthOf9_3 result;
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

    public NullableListOfNullableStringsWithMaxLengthOf9_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    NullableListOfNullableStringsWithMaxLengthOf9_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableListOfNullableStringsWithMaxLengthOf9")
    public java.util.List<String> getNullableListOfNullableStringsWithMaxLengthOf9() {
        return nullableListOfNullableStringsWithMaxLengthOf9;
    }

    public NullableListOfNullableStringsWithMaxLengthOf9_3 setNullableListOfNullableStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableListOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }

    private java.util.List<String> calculatedNullableListOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("calculatedNullableListOfNullableStringsWithMaxLengthOf9")
    public java.util.List<String> getCalculatedNullableListOfNullableStringsWithMaxLengthOf9() {
        return this.calculatedNullableListOfNullableStringsWithMaxLengthOf9;
    }

    private java.util.List<String> persistedNullableListOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("persistedNullableListOfNullableStringsWithMaxLengthOf9")
    public java.util.List<String> getPersistedNullableListOfNullableStringsWithMaxLengthOf9() {
        return this.persistedNullableListOfNullableStringsWithMaxLengthOf9;
    }
}

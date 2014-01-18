package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneSetOfOneStringsWithMaxLengthOf9_4 implements
        java.io.Serializable, AggregateRoot {
    public OneSetOfOneStringsWithMaxLengthOf9_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
        this.calculatedOneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
        this.persistedOneSetOfOneStringsWithMaxLengthOf9 = new java.util.HashSet<String>();
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
        final OneSetOfOneStringsWithMaxLengthOf9_4 other = (OneSetOfOneStringsWithMaxLengthOf9_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "OneSetOfOneStringsWithMaxLengthOf9_4(" + URI
                + ')' : "new OneSetOfOneStringsWithMaxLengthOf9_4("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneSetOfOneStringsWithMaxLengthOf9_4(
            final java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneSetOfOneStringsWithMaxLengthOf9(oneSetOfOneStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private OneSetOfOneStringsWithMaxLengthOf9_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneSetOfOneStringsWithMaxLengthOf9") final java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9,
            @JsonProperty("calculatedOneSetOfOneStringsWithMaxLengthOf9") final java.util.Set<String> calculatedOneSetOfOneStringsWithMaxLengthOf9,
            @JsonProperty("persistedOneSetOfOneStringsWithMaxLengthOf9") final java.util.Set<String> persistedOneSetOfOneStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneSetOfOneStringsWithMaxLengthOf9 = oneSetOfOneStringsWithMaxLengthOf9 == null
                ? new java.util.HashSet<String>()
                : oneSetOfOneStringsWithMaxLengthOf9;
        this.calculatedOneSetOfOneStringsWithMaxLengthOf9 = calculatedOneSetOfOneStringsWithMaxLengthOf9;
        this.persistedOneSetOfOneStringsWithMaxLengthOf9 = persistedOneSetOfOneStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneSetOfOneStringsWithMaxLengthOf9_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneSetOfOneStringsWithMaxLengthOf9_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneSetOfOneStringsWithMaxLengthOf9_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneSetOfOneStringsWithMaxLengthOf9_4.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneSetOfOneStringsWithMaxLengthOf9_4.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneSetOfOneStringsWithMaxLengthOf9_4.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneSetOfOneStringsWithMaxLengthOf9_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneSetOfOneStringsWithMaxLengthOf9_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneSetOfOneStringsWithMaxLengthOf9_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneSetOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneSetOfOneStringsWithMaxLengthOf9_4> specification,
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
                    .count(OneSetOfOneStringsWithMaxLengthOf9_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneSetOfOneStringsWithMaxLengthOf9_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneSetOfOneStringsWithMaxLengthOf9_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneStringsWithMaxLengthOf9_4 result) {
        this.URI = result.URI;

        this.oneSetOfOneStringsWithMaxLengthOf9 = result.oneSetOfOneStringsWithMaxLengthOf9;
        this.calculatedOneSetOfOneStringsWithMaxLengthOf9 = result.calculatedOneSetOfOneStringsWithMaxLengthOf9;
        this.persistedOneSetOfOneStringsWithMaxLengthOf9 = result.persistedOneSetOfOneStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public OneSetOfOneStringsWithMaxLengthOf9_4 persist()
            throws java.io.IOException {
        final OneSetOfOneStringsWithMaxLengthOf9_4 result;
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

    public OneSetOfOneStringsWithMaxLengthOf9_4 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    OneSetOfOneStringsWithMaxLengthOf9_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneSetOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneStringsWithMaxLengthOf9() {
        return oneSetOfOneStringsWithMaxLengthOf9;
    }

    public OneSetOfOneStringsWithMaxLengthOf9_4 setOneSetOfOneStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneSetOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private java.util.Set<String> calculatedOneSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("calculatedOneSetOfOneStringsWithMaxLengthOf9")
    public java.util.Set<String> getCalculatedOneSetOfOneStringsWithMaxLengthOf9() {
        return this.calculatedOneSetOfOneStringsWithMaxLengthOf9;
    }

    private java.util.Set<String> persistedOneSetOfOneStringsWithMaxLengthOf9;

    @JsonProperty("persistedOneSetOfOneStringsWithMaxLengthOf9")
    public java.util.Set<String> getPersistedOneSetOfOneStringsWithMaxLengthOf9() {
        return this.persistedOneSetOfOneStringsWithMaxLengthOf9;
    }
}

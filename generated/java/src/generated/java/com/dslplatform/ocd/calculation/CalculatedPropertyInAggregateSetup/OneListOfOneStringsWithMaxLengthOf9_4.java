package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneStringsWithMaxLengthOf9_4 implements
        java.io.Serializable, AggregateRoot {
    public OneListOfOneStringsWithMaxLengthOf9_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
        this.calculatedOneListOfOneStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
        this.persistedOneListOfOneStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
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
        final OneListOfOneStringsWithMaxLengthOf9_4 other = (OneListOfOneStringsWithMaxLengthOf9_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "OneListOfOneStringsWithMaxLengthOf9_4(" + URI
                + ')' : "new OneListOfOneStringsWithMaxLengthOf9_4("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneStringsWithMaxLengthOf9_4(
            final java.util.List<String> oneListOfOneStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneStringsWithMaxLengthOf9(oneListOfOneStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private OneListOfOneStringsWithMaxLengthOf9_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneStringsWithMaxLengthOf9") final java.util.List<String> oneListOfOneStringsWithMaxLengthOf9,
            @JsonProperty("calculatedOneListOfOneStringsWithMaxLengthOf9") final java.util.List<String> calculatedOneListOfOneStringsWithMaxLengthOf9,
            @JsonProperty("persistedOneListOfOneStringsWithMaxLengthOf9") final java.util.List<String> persistedOneListOfOneStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneStringsWithMaxLengthOf9 = oneListOfOneStringsWithMaxLengthOf9 == null
                ? new java.util.ArrayList<String>()
                : oneListOfOneStringsWithMaxLengthOf9;
        this.calculatedOneListOfOneStringsWithMaxLengthOf9 = calculatedOneListOfOneStringsWithMaxLengthOf9;
        this.persistedOneListOfOneStringsWithMaxLengthOf9 = persistedOneListOfOneStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneStringsWithMaxLengthOf9_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneStringsWithMaxLengthOf9_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneStringsWithMaxLengthOf9_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneStringsWithMaxLengthOf9_4.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneStringsWithMaxLengthOf9_4.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneStringsWithMaxLengthOf9_4.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneListOfOneStringsWithMaxLengthOf9_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneListOfOneStringsWithMaxLengthOf9_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneListOfOneStringsWithMaxLengthOf9_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneStringsWithMaxLengthOf9_4> search(
            final Specification<OneListOfOneStringsWithMaxLengthOf9_4> specification,
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
                    .count(OneListOfOneStringsWithMaxLengthOf9_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneStringsWithMaxLengthOf9_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneStringsWithMaxLengthOf9_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneStringsWithMaxLengthOf9_4 result) {
        this.URI = result.URI;

        this.oneListOfOneStringsWithMaxLengthOf9 = result.oneListOfOneStringsWithMaxLengthOf9;
        this.calculatedOneListOfOneStringsWithMaxLengthOf9 = result.calculatedOneListOfOneStringsWithMaxLengthOf9;
        this.persistedOneListOfOneStringsWithMaxLengthOf9 = result.persistedOneListOfOneStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public OneListOfOneStringsWithMaxLengthOf9_4 persist()
            throws java.io.IOException {
        final OneListOfOneStringsWithMaxLengthOf9_4 result;
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

    public OneListOfOneStringsWithMaxLengthOf9_4 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    OneListOfOneStringsWithMaxLengthOf9_4.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<String> oneListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneListOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneStringsWithMaxLengthOf9() {
        return oneListOfOneStringsWithMaxLengthOf9;
    }

    public OneListOfOneStringsWithMaxLengthOf9_4 setOneListOfOneStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneListOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private java.util.List<String> calculatedOneListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("calculatedOneListOfOneStringsWithMaxLengthOf9")
    public java.util.List<String> getCalculatedOneListOfOneStringsWithMaxLengthOf9() {
        return this.calculatedOneListOfOneStringsWithMaxLengthOf9;
    }

    private java.util.List<String> persistedOneListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("persistedOneListOfOneStringsWithMaxLengthOf9")
    public java.util.List<String> getPersistedOneListOfOneStringsWithMaxLengthOf9() {
        return this.persistedOneListOfOneStringsWithMaxLengthOf9;
    }
}

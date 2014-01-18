package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfOneXmls_3 implements java.io.Serializable, AggregateRoot {
    public OneListOfOneXmls_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfOneXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.calculatedOneListOfOneXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.persistedOneListOfOneXmls = new java.util.ArrayList<org.w3c.dom.Element>();
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
        final OneListOfOneXmls_3 other = (OneListOfOneXmls_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfOneXmls_3(" + URI + ')'
                : "new OneListOfOneXmls_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfOneXmls_3(
            final java.util.List<org.w3c.dom.Element> oneListOfOneXmls) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfOneXmls(oneListOfOneXmls);
    }

    @JsonCreator
    private OneListOfOneXmls_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfOneXmls") final java.util.List<org.w3c.dom.Element> oneListOfOneXmls,
            @JsonProperty("calculatedOneListOfOneXmls") final java.util.List<org.w3c.dom.Element> calculatedOneListOfOneXmls,
            @JsonProperty("persistedOneListOfOneXmls") final java.util.List<org.w3c.dom.Element> persistedOneListOfOneXmls) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfOneXmls = oneListOfOneXmls == null
                ? new java.util.ArrayList<org.w3c.dom.Element>()
                : oneListOfOneXmls;
        this.calculatedOneListOfOneXmls = calculatedOneListOfOneXmls;
        this.persistedOneListOfOneXmls = persistedOneListOfOneXmls;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfOneXmls_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfOneXmls_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfOneXmls_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfOneXmls_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneXmls_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneXmls_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfOneXmls_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneXmls_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneXmls_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfOneXmls_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneXmls_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfOneXmls_3.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfOneXmls_3> search(
            final Specification<OneListOfOneXmls_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneXmls_3> search(
            final Specification<OneListOfOneXmls_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfOneXmls_3> search(
            final Specification<OneListOfOneXmls_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfOneXmls_3> search(
            final Specification<OneListOfOneXmls_3> specification,
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
                    .resolve(DomainProxy.class).count(OneListOfOneXmls_3.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfOneXmls_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfOneXmls_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneXmls_3 result) {
        this.URI = result.URI;

        this.oneListOfOneXmls = result.oneListOfOneXmls;
        this.calculatedOneListOfOneXmls = result.calculatedOneListOfOneXmls;
        this.persistedOneListOfOneXmls = result.persistedOneListOfOneXmls;
        this.ID = result.ID;
    }

    public OneListOfOneXmls_3 persist() throws java.io.IOException {
        final OneListOfOneXmls_3 result;
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

    public OneListOfOneXmls_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfOneXmls_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<org.w3c.dom.Element> oneListOfOneXmls;

    @JsonProperty("oneListOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getOneListOfOneXmls() {
        return oneListOfOneXmls;
    }

    public OneListOfOneXmls_3 setOneListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneXmls = value;

        return this;
    }

    private java.util.List<org.w3c.dom.Element> calculatedOneListOfOneXmls;

    @JsonProperty("calculatedOneListOfOneXmls")
    public java.util.List<org.w3c.dom.Element> getCalculatedOneListOfOneXmls() {
        return this.calculatedOneListOfOneXmls;
    }

    private java.util.List<org.w3c.dom.Element> persistedOneListOfOneXmls;

    @JsonProperty("persistedOneListOfOneXmls")
    public java.util.List<org.w3c.dom.Element> getPersistedOneListOfOneXmls() {
        return this.persistedOneListOfOneXmls;
    }
}

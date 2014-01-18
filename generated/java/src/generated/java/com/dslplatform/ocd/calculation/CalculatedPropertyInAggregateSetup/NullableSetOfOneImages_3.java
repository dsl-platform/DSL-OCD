package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableSetOfOneImages_3 implements java.io.Serializable,
        AggregateRoot {
    public NullableSetOfOneImages_3() {
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
        final NullableSetOfOneImages_3 other = (NullableSetOfOneImages_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableSetOfOneImages_3(" + URI + ')'
                : "new NullableSetOfOneImages_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableSetOfOneImages_3(
            final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableSetOfOneImages(nullableSetOfOneImages);
    }

    @JsonCreator
    private NullableSetOfOneImages_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableSetOfOneImages") final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages,
            @JsonProperty("calculatedNullableSetOfOneImages") final java.util.Set<java.awt.image.BufferedImage> calculatedNullableSetOfOneImages,
            @JsonProperty("persistedNullableSetOfOneImages") final java.util.Set<java.awt.image.BufferedImage> persistedNullableSetOfOneImages) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableSetOfOneImages = nullableSetOfOneImages;
        this.calculatedNullableSetOfOneImages = calculatedNullableSetOfOneImages == null
                ? new java.util.HashSet<java.awt.image.BufferedImage>()
                : calculatedNullableSetOfOneImages;
        this.persistedNullableSetOfOneImages = persistedNullableSetOfOneImages == null
                ? new java.util.HashSet<java.awt.image.BufferedImage>()
                : persistedNullableSetOfOneImages;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableSetOfOneImages_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableSetOfOneImages_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableSetOfOneImages_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableSetOfOneImages_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneImages_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneImages_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableSetOfOneImages_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneImages_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneImages_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableSetOfOneImages_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneImages_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableSetOfOneImages_3.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableSetOfOneImages_3> search(
            final Specification<NullableSetOfOneImages_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneImages_3> search(
            final Specification<NullableSetOfOneImages_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableSetOfOneImages_3> search(
            final Specification<NullableSetOfOneImages_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableSetOfOneImages_3> search(
            final Specification<NullableSetOfOneImages_3> specification,
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
                    .count(NullableSetOfOneImages_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableSetOfOneImages_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableSetOfOneImages_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneImages_3 result) {
        this.URI = result.URI;

        this.nullableSetOfOneImages = result.nullableSetOfOneImages;
        this.calculatedNullableSetOfOneImages = result.calculatedNullableSetOfOneImages;
        this.persistedNullableSetOfOneImages = result.persistedNullableSetOfOneImages;
        this.ID = result.ID;
    }

    public NullableSetOfOneImages_3 persist() throws java.io.IOException {
        final NullableSetOfOneImages_3 result;
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

    public NullableSetOfOneImages_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableSetOfOneImages_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages;

    @JsonProperty("nullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getNullableSetOfOneImages() {
        return nullableSetOfOneImages;
    }

    public NullableSetOfOneImages_3 setNullableSetOfOneImages(
            final java.util.Set<java.awt.image.BufferedImage> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneImages = value;

        return this;
    }

    private java.util.Set<java.awt.image.BufferedImage> calculatedNullableSetOfOneImages;

    @JsonProperty("calculatedNullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getCalculatedNullableSetOfOneImages() {
        return this.calculatedNullableSetOfOneImages;
    }

    private java.util.Set<java.awt.image.BufferedImage> persistedNullableSetOfOneImages;

    @JsonProperty("persistedNullableSetOfOneImages")
    public java.util.Set<java.awt.image.BufferedImage> getPersistedNullableSetOfOneImages() {
        return this.persistedNullableSetOfOneImages;
    }
}

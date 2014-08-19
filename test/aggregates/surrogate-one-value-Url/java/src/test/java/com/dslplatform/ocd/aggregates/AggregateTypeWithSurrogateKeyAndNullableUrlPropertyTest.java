package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableUrlPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateUrl.Aggregate0Ur> aggregate0UrRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableUrlPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0UrRepository = locator.resolve(ocd.AggregateSurrogateUrl.repositories.Aggregate0UrRepository.class);
    }

    /* Testing the "p0Ur" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur();
        final java.net.URI testValue = aggregate.getP0Ur();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" Default property value after active record persist */
    @org.junit.Test
    public void testP0UrDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur();
        final java.net.URI testValue = aggregate.getP0Ur();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault7 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault7PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault7 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault7PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault8 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault8PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault8 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault8PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Ur" NonDefault9 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0UrNonDefault9PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Ur());
    }

    /* Testing the "p0Ur" NonDefault9 property value after active record persist */
    @org.junit.Test
    public void testP0UrNonDefault9PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI testValue = com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)");
        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0Ur()
                .setP0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Ur().getP0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

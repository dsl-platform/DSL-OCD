package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneBooleansPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate0S1Bo> aggregate0S1BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneBooleansPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate0S1BoRepository.class);
    }

    /* Testing the "p0S1Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo();
        final java.util.Set<Boolean> testValue = aggregate.getP0S1Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bo());
    }

    /* Testing the "p0S1Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo();
        final java.util.Set<Boolean> testValue = aggregate.getP0S1Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo().getP0S1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo()
                .setP0S1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bo());
    }

    /* Testing the "p0S1Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo()
                .setP0S1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo().getP0S1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Bo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo()
                .setP0S1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bo());
    }

    /* Testing the "p0S1Bo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1BoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo()
                .setP0S1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo().getP0S1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Bo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1BoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo()
                .setP0S1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Bo());
    }

    /* Testing the "p0S1Bo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1BoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0S1Bo()
                .setP0S1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Bo().getP0S1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0S1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0S1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

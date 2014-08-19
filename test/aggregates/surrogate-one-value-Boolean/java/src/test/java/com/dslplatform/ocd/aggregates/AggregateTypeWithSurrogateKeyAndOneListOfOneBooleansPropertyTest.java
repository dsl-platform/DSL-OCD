package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOneBooleansPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate1L1Bo> aggregate1L1BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOneBooleansPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate1L1BoRepository.class);
    }

    /* Testing the "p1L1Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo();
        final java.util.List<Boolean> testValue = aggregate.getP1L1Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bo());
    }

    /* Testing the "p1L1Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo();
        final java.util.List<Boolean> testValue = aggregate.getP1L1Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo().getP1L1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo()
                .setP1L1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bo());
    }

    /* Testing the "p1L1Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo()
                .setP1L1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo().getP1L1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Bo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo()
                .setP1L1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bo());
    }

    /* Testing the "p1L1Bo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1BoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo()
                .setP1L1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo().getP1L1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Bo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1BoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo()
                .setP1L1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Bo());
    }

    /* Testing the "p1L1Bo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1BoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L1Bo()
                .setP1L1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Bo().getP1L1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

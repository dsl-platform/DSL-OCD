package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneBooleanPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate1Bo> aggregate1BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneBooleanPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate1BoRepository.class);
    }

    /* Testing the "p1Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1Bo();
        final boolean testValue = aggregate.getP1Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Bo());
    }

    /* Testing the "p1Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP1BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1Bo();
        final boolean testValue = aggregate.getP1Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bo().getP1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final boolean testValue = true;
        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1Bo()
                .setP1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Bo());
    }

    /* Testing the "p1Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final boolean testValue = true;
        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1Bo()
                .setP1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bo().getP1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

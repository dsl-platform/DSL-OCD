package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableBooleanPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate0Bo> aggregate0BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableBooleanPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate0BoRepository.class);
    }

    /* Testing the "p0Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0Bo();
        final Boolean testValue = aggregate.getP0Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bo());
    }

    /* Testing the "p0Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP0BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0Bo();
        final Boolean testValue = aggregate.getP0Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bo().getP0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Boolean testValue = false;
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0Bo()
                .setP0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bo());
    }

    /* Testing the "p0Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Boolean testValue = false;
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0Bo()
                .setP0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bo().getP0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Bo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Boolean testValue = true;
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0Bo()
                .setP0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bo());
    }

    /* Testing the "p0Bo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0BoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Boolean testValue = true;
        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0Bo()
                .setP0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bo().getP0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

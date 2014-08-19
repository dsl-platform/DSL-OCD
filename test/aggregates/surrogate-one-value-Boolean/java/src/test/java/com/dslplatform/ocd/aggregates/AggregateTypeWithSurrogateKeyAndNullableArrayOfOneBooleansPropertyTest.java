package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneBooleansPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate0A1Bo> aggregate0A1BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneBooleansPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate0A1BoRepository.class);
    }

    /* Testing the "p0A1Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo();
        final boolean[] testValue = aggregate.getP0A1Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Bo());
    }

    /* Testing the "p0A1Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo();
        final boolean[] testValue = aggregate.getP0A1Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo().getP0A1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final boolean[] testValue = new boolean[] { false };
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo()
                .setP0A1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Bo());
    }

    /* Testing the "p0A1Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final boolean[] testValue = new boolean[] { false };
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo()
                .setP0A1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo().getP0A1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Bo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1BoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final boolean[] testValue = new boolean[] { true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo()
                .setP0A1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Bo());
    }

    /* Testing the "p0A1Bo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1BoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final boolean[] testValue = new boolean[] { true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo()
                .setP0A1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo().getP0A1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Bo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1BoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final boolean[] testValue = new boolean[] { false, true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo()
                .setP0A1Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Bo());
    }

    /* Testing the "p0A1Bo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A1BoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final boolean[] testValue = new boolean[] { false, true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A1Bo()
                .setP0A1Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Bo().getP0A1Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A1Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A1Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

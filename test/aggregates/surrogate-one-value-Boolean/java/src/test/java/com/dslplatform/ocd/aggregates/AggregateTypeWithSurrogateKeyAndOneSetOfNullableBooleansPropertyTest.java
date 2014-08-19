package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfNullableBooleansPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate1S0Bo> aggregate1S0BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfNullableBooleansPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S0BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate1S0BoRepository.class);
    }

    /* Testing the "p1S0Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo();
        final java.util.Set<Boolean> testValue = aggregate.getP1S0Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bo());
    }

    /* Testing the "p1S0Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP1S0BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo();
        final java.util.Set<Boolean> testValue = aggregate.getP1S0Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo().getP1S0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(null); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bo());
    }

    /* Testing the "p1S0Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S0BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(null); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo().getP1S0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bo());
    }

    /* Testing the "p1S0Bo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S0BoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo().getP1S0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bo());
    }

    /* Testing the "p1S0Bo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S0BoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo().getP1S0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bo());
    }

    /* Testing the "p1S0Bo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1S0BoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo().getP1S0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Bo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0BoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(null); add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Bo());
    }

    /* Testing the "p1S0Bo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1S0BoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Boolean> testValue = new java.util.HashSet<Boolean>() {{ add(null); add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1S0Bo()
                .setP1S0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Bo().getP1S0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1S0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1S0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

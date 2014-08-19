package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfNullableBooleansPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate1L0Bo> aggregate1L0BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfNullableBooleansPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L0BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate1L0BoRepository.class);
    }

    /* Testing the "p1L0Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo();
        final java.util.List<Boolean> testValue = aggregate.getP1L0Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Bo());
    }

    /* Testing the "p1L0Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP1L0BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo();
        final java.util.List<Boolean> testValue = aggregate.getP1L0Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo().getP1L0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(null); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Bo());
    }

    /* Testing the "p1L0Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L0BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(null); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo().getP1L0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Bo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0BoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Bo());
    }

    /* Testing the "p1L0Bo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L0BoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo().getP1L0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Bo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0BoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Bo());
    }

    /* Testing the "p1L0Bo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L0BoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo().getP1L0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Bo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0BoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Bo());
    }

    /* Testing the "p1L0Bo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1L0BoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo().getP1L0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L0Bo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L0BoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(null); add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1L0Bo());
    }

    /* Testing the "p1L0Bo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1L0BoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Boolean> testValue = new java.util.ArrayList<Boolean>() {{ add(null); add(false); add(true); }};
        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate1L0Bo()
                .setP1L0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregate.getP1L0Bo().getP1L0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate1L0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate1L0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertOneListOfNullableEquals(
                testValue,
                aggregateFound.getP1L0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

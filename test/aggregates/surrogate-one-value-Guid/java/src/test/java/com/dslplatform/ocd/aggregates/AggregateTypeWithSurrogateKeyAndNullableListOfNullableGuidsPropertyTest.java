package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfNullableGuidsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateGuid.Aggregate0L0Gu> aggregate0L0GuRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfNullableGuidsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L0GuRepository = locator.resolve(ocd.AggregateSurrogateGuid.repositories.Aggregate0L0GuRepository.class);
    }

    /* Testing the "p0L0Gu" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0GuDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu();
        final java.util.List<java.util.UUID> testValue = aggregate.getP0L0Gu();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0L0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Gu());
    }

    /* Testing the "p0L0Gu" Default property value after active record persist */
    @org.junit.Test
    public void testP0L0GuDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu();
        final java.util.List<java.util.UUID> testValue = aggregate.getP0L0Gu();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu().getP0L0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Gu" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0GuNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(null); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0L0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Gu());
    }

    /* Testing the "p0L0Gu" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L0GuNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(null); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu().getP0L0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Gu" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0GuNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0L0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Gu());
    }

    /* Testing the "p0L0Gu" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L0GuNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu().getP0L0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Gu" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0GuNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0L0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Gu());
    }

    /* Testing the "p0L0Gu" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L0GuNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu().getP0L0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Gu" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0GuNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0L0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Gu());
    }

    /* Testing the "p0L0Gu" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0L0GuNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu().getP0L0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Gu" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0GuNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(null); add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0L0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Gu());
    }

    /* Testing the "p0L0Gu" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0L0GuNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.UUID> testValue = new java.util.ArrayList<java.util.UUID>() {{ add(null); add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0L0Gu()
                .setP0L0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Gu().getP0L0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0L0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0L0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfNullableGuidsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateGuid.Aggregate1S0Gu> aggregate1S0GuRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfNullableGuidsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S0GuRepository = locator.resolve(ocd.AggregateSurrogateGuid.repositories.Aggregate1S0GuRepository.class);
    }

    /* Testing the "p1S0Gu" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0GuDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu();
        final java.util.Set<java.util.UUID> testValue = aggregate.getP1S0Gu();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1S0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Gu());
    }

    /* Testing the "p1S0Gu" Default property value after active record persist */
    @org.junit.Test
    public void testP1S0GuDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu();
        final java.util.Set<java.util.UUID> testValue = aggregate.getP1S0Gu();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu().getP1S0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Gu" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0GuNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(null); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1S0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Gu());
    }

    /* Testing the "p1S0Gu" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S0GuNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(null); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu().getP1S0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Gu" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0GuNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1S0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Gu());
    }

    /* Testing the "p1S0Gu" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S0GuNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu().getP1S0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Gu" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0GuNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1S0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Gu());
    }

    /* Testing the "p1S0Gu" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S0GuNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu().getP1S0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Gu" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0GuNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1S0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Gu());
    }

    /* Testing the "p1S0Gu" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1S0GuNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu().getP1S0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Gu" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0GuNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(null); add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate1S0Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Gu());
    }

    /* Testing the "p1S0Gu" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1S0GuNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(null); add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate1S0Gu()
                .setP1S0Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Gu().getP1S0Gu());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate1S0Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate1S0Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

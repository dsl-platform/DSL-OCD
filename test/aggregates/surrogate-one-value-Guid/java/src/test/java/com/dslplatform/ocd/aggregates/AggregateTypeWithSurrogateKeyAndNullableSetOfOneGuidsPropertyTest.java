package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneGuidsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateGuid.Aggregate0S1Gu> aggregate0S1GuRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneGuidsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1GuRepository = locator.resolve(ocd.AggregateSurrogateGuid.repositories.Aggregate0S1GuRepository.class);
    }

    /* Testing the "p0S1Gu" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1GuDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu();
        final java.util.Set<java.util.UUID> testValue = aggregate.getP0S1Gu();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0S1Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Gu());
    }

    /* Testing the "p0S1Gu" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1GuDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu();
        final java.util.Set<java.util.UUID> testValue = aggregate.getP0S1Gu();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu().getP0S1Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Gu" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1GuNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); }};
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu()
                .setP0S1Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0S1Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Gu());
    }

    /* Testing the "p0S1Gu" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1GuNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); }};
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu()
                .setP0S1Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu().getP0S1Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Gu" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1GuNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu()
                .setP0S1Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0S1Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Gu());
    }

    /* Testing the "p0S1Gu" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1GuNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu()
                .setP0S1Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu().getP0S1Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Gu" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1GuNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu()
                .setP0S1Gu(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateGuid.Aggregate0S1Gu.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Gu());
    }

    /* Testing the "p0S1Gu" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1GuNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.util.UUID> testValue = new java.util.HashSet<java.util.UUID>() {{ add(java.util.UUID.randomUUID()); add(java.util.UUID.fromString("1-2-3-4-5")); add(new java.util.UUID(0L, 0L)); }};
        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregate =
                new ocd.AggregateSurrogateGuid.Aggregate0S1Gu()
                .setP0S1Gu(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Gu().getP0S1Gu());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        final ocd.AggregateSurrogateGuid.Aggregate0S1Gu aggregateFound =
                ocd.AggregateSurrogateGuid.Aggregate0S1Gu.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.GuidAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Gu());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

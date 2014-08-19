package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneMapsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateMap.Aggregate0A1Ma> aggregate0A1MaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneMapsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1MaRepository = locator.resolve(ocd.AggregateSurrogateMap.repositories.Aggregate0A1MaRepository.class);
    }

    /* Testing the "p0A1Ma" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1MaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma();
        final java.util.Map<String, String>[] testValue = aggregate.getP0A1Ma();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0A1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ma());
    }

    /* Testing the "p0A1Ma" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1MaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma();
        final java.util.Map<String, String>[] testValue = aggregate.getP0A1Ma();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma().getP0A1Ma());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Ma" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1MaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Map<String, String>[] testValue = new java.util.Map[] { new java.util.HashMap<String, String>(0) };
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma()
                .setP0A1Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0A1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ma());
    }

    /* Testing the "p0A1Ma" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1MaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Map<String, String>[] testValue = new java.util.Map[] { new java.util.HashMap<String, String>(0) };
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma()
                .setP0A1Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma().getP0A1Ma());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Ma" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1MaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Map<String, String>[] testValue = new java.util.Map[] { new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }} };
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma()
                .setP0A1Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0A1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ma());
    }

    /* Testing the "p0A1Ma" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1MaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Map<String, String>[] testValue = new java.util.Map[] { new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }} };
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma()
                .setP0A1Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma().getP0A1Ma());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Ma" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1MaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Map<String, String>[] testValue = new java.util.Map[] { new java.util.HashMap<String, String>(0), new java.util.HashMap<String, String>() {{ put("a", "b"); }}, new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }}, new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }} };
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma()
                .setP0A1Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0A1Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ma());
    }

    /* Testing the "p0A1Ma" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A1MaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Map<String, String>[] testValue = new java.util.Map[] { new java.util.HashMap<String, String>(0), new java.util.HashMap<String, String>() {{ put("a", "b"); }}, new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }}, new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }} };
        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0A1Ma()
                .setP0A1Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ma().getP0A1Ma());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0A1Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0A1Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

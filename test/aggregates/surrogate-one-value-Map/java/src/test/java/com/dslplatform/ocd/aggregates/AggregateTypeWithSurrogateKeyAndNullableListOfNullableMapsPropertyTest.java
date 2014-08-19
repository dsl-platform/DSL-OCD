package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfNullableMapsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateMap.Aggregate0L0Ma> aggregate0L0MaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfNullableMapsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L0MaRepository = locator.resolve(ocd.AggregateSurrogateMap.repositories.Aggregate0L0MaRepository.class);
    }

    /* Testing the "p0L0Ma" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0MaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma();
        final java.util.List<java.util.Map<String, String>> testValue = aggregate.getP0L0Ma();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0L0Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Ma());
    }

    /* Testing the "p0L0Ma" Default property value after active record persist */
    @org.junit.Test
    public void testP0L0MaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma();
        final java.util.List<java.util.Map<String, String>> testValue = aggregate.getP0L0Ma();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma().getP0L0Ma());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Ma" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0MaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(null); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0L0Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Ma());
    }

    /* Testing the "p0L0Ma" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L0MaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(null); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma().getP0L0Ma());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Ma" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0MaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(new java.util.HashMap<String, String>(0)); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0L0Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Ma());
    }

    /* Testing the "p0L0Ma" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L0MaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(new java.util.HashMap<String, String>(0)); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma().getP0L0Ma());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Ma" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0MaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0L0Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Ma());
    }

    /* Testing the "p0L0Ma" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0L0MaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma().getP0L0Ma());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Ma" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0MaNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(new java.util.HashMap<String, String>(0)); add(new java.util.HashMap<String, String>() {{ put("a", "b"); }}); add(new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }}); add(new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0L0Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Ma());
    }

    /* Testing the "p0L0Ma" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0L0MaNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(new java.util.HashMap<String, String>(0)); add(new java.util.HashMap<String, String>() {{ put("a", "b"); }}); add(new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }}); add(new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma().getP0L0Ma());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L0Ma" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L0MaNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(null); add(new java.util.HashMap<String, String>(0)); add(new java.util.HashMap<String, String>() {{ put("a", "b"); }}); add(new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }}); add(new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMap.Aggregate0L0Ma.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0L0Ma());
    }

    /* Testing the "p0L0Ma" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0L0MaNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.util.Map<String, String>> testValue = new java.util.ArrayList<java.util.Map<String, String>>() {{ add(null); add(new java.util.HashMap<String, String>(0)); add(new java.util.HashMap<String, String>() {{ put("a", "b"); }}); add(new java.util.HashMap<String, String>() {{ put("Quote: \", Solidus /", "Backslash: \\, Aphos: ', Brackets: [] () {}"); }}); add(new java.util.HashMap<String, String>() {{ put("", "empty"); put("a", "1"); put("b", "2"); put("c", "3"); }}); }};
        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregate =
                new ocd.AggregateSurrogateMap.Aggregate0L0Ma()
                .setP0L0Ma(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregate.getP0L0Ma().getP0L0Ma());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        final ocd.AggregateSurrogateMap.Aggregate0L0Ma aggregateFound =
                ocd.AggregateSurrogateMap.Aggregate0L0Ma.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MapAsserts.assertNullableListOfNullableEquals(
                testValue,
                aggregateFound.getP0L0Ma());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOneDatesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDate.Aggregate1L1Da> aggregate1L1DaRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOneDatesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1DaRepository = locator.resolve(ocd.AggregateSurrogateDate.repositories.Aggregate1L1DaRepository.class);
    }

    /* Testing the "p1L1Da" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DaDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da();
        final java.util.List<org.joda.time.LocalDate> testValue = aggregate.getP1L1Da();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1L1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Da());
    }

    /* Testing the "p1L1Da" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1DaDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da();
        final java.util.List<org.joda.time.LocalDate> testValue = aggregate.getP1L1Da();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da().getP1L1Da());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Da" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DaNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.joda.time.LocalDate> testValue = new java.util.ArrayList<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); }};
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da()
                .setP1L1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1L1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Da());
    }

    /* Testing the "p1L1Da" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1DaNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.joda.time.LocalDate> testValue = new java.util.ArrayList<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); }};
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da()
                .setP1L1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da().getP1L1Da());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Da" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DaNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.joda.time.LocalDate> testValue = new java.util.ArrayList<org.joda.time.LocalDate>() {{ add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da()
                .setP1L1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1L1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Da());
    }

    /* Testing the "p1L1Da" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1DaNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.joda.time.LocalDate> testValue = new java.util.ArrayList<org.joda.time.LocalDate>() {{ add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da()
                .setP1L1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da().getP1L1Da());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Da" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DaNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.joda.time.LocalDate> testValue = new java.util.ArrayList<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); add(new org.joda.time.LocalDate(1, 2, 3)); add(new org.joda.time.LocalDate(1, 1, 1)); add(new org.joda.time.LocalDate(0)); add(new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)); add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da()
                .setP1L1Da(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDate.Aggregate1L1Da.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Da());
    }

    /* Testing the "p1L1Da" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1DaNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.joda.time.LocalDate> testValue = new java.util.ArrayList<org.joda.time.LocalDate>() {{ add(org.joda.time.LocalDate.now()); add(new org.joda.time.LocalDate(1, 2, 3)); add(new org.joda.time.LocalDate(1, 1, 1)); add(new org.joda.time.LocalDate(0)); add(new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)); add(new org.joda.time.LocalDate(9999, 12, 31)); }};
        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregate =
                new ocd.AggregateSurrogateDate.Aggregate1L1Da()
                .setP1L1Da(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Da().getP1L1Da());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        final ocd.AggregateSurrogateDate.Aggregate1L1Da aggregateFound =
                ocd.AggregateSurrogateDate.Aggregate1L1Da.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DateAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Da());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

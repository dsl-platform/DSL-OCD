package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneTextsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateText.Aggregate0S1Te> aggregate0S1TeRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneTextsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1TeRepository = locator.resolve(ocd.AggregateSurrogateText.repositories.Aggregate0S1TeRepository.class);
    }

    /* Testing the "p0S1Te" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TeDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te();
        final java.util.Set<String> testValue = aggregate.getP0S1Te();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateText.Aggregate0S1Te.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Te());
    }

    /* Testing the "p0S1Te" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1TeDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te();
        final java.util.Set<String> testValue = aggregate.getP0S1Te();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te().getP0S1Te());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Te());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Te" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TeNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<String> testValue = new java.util.HashSet<String>() {{ add(""); }};
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te()
                .setP0S1Te(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateText.Aggregate0S1Te.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Te());
    }

    /* Testing the "p0S1Te" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1TeNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<String> testValue = new java.util.HashSet<String>() {{ add(""); }};
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te()
                .setP0S1Te(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te().getP0S1Te());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Te());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Te" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TeNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<String> testValue = new java.util.HashSet<String>() {{ add("\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009C\u009D\u009E\u009F\u00A0\u00A1\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00AA\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u00BA\u00BB\u00BC\u00BD\u00BE\u00BF\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u00D7\u00D8\u00D9\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u00F0\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u00FE\u00FF\u0100"); }};
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te()
                .setP0S1Te(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateText.Aggregate0S1Te.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Te());
    }

    /* Testing the "p0S1Te" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1TeNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<String> testValue = new java.util.HashSet<String>() {{ add("\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009C\u009D\u009E\u009F\u00A0\u00A1\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00AA\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u00BA\u00BB\u00BC\u00BD\u00BE\u00BF\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u00D7\u00D8\u00D9\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u00F0\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u00FE\u00FF\u0100"); }};
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te()
                .setP0S1Te(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te().getP0S1Te());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Te());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Te" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1TeNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<String> testValue = new java.util.HashSet<String>() {{ add(""); add("\""); add("Quote: \", Solidus /, Backslash: \\, Aphos: ', Brackets: [] () {}"); add("\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009C\u009D\u009E\u009F\u00A0\u00A1\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00AA\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u00BA\u00BB\u00BC\u00BD\u00BE\u00BF\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u00D7\u00D8\u00D9\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u00F0\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u00FE\u00FF\u0100"); }};
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te()
                .setP0S1Te(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateText.Aggregate0S1Te.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Te());
    }

    /* Testing the "p0S1Te" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1TeNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<String> testValue = new java.util.HashSet<String>() {{ add(""); add("\""); add("Quote: \", Solidus /, Backslash: \\, Aphos: ', Brackets: [] () {}"); add("\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009C\u009D\u009E\u009F\u00A0\u00A1\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00AA\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u00BA\u00BB\u00BC\u00BD\u00BE\u00BF\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u00D7\u00D8\u00D9\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u00F0\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u00FE\u00FF\u0100"); }};
        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregate =
                new ocd.AggregateSurrogateText.Aggregate0S1Te()
                .setP0S1Te(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Te().getP0S1Te());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        final ocd.AggregateSurrogateText.Aggregate0S1Te aggregateFound =
                ocd.AggregateSurrogateText.Aggregate0S1Te.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.TextAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Te());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

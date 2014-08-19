package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableListOfOneXmlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateXml.Aggregate0L1Xm> aggregate0L1XmRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableListOfOneXmlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0L1XmRepository = locator.resolve(ocd.AggregateSurrogateXml.repositories.Aggregate0L1XmRepository.class);
    }

    /* Testing the "p0L1Xm" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1XmDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0L1Xm();
        final java.util.List<org.w3c.dom.Element> testValue = aggregate.getP0L1Xm();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0L1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Xm());
    }

    /* Testing the "p0L1Xm" Default property value after active record persist */
    @org.junit.Test
    public void testP0L1XmDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0L1Xm();
        final java.util.List<org.w3c.dom.Element> testValue = aggregate.getP0L1Xm();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Xm().getP0L1Xm());

        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0L1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0L1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Xm" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1XmNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0L1Xm()
                .setP0L1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0L1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Xm());
    }

    /* Testing the "p0L1Xm" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0L1XmNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0L1Xm()
                .setP0L1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Xm().getP0L1Xm());

        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0L1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0L1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0L1Xm" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0L1XmNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0L1Xm()
                .setP0L1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0L1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateDeserialized.getP0L1Xm());
    }

    /* Testing the "p0L1Xm" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0L1XmNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<org.w3c.dom.Element> testValue = new java.util.ArrayList<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0L1Xm()
                .setP0L1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregate.getP0L1Xm().getP0L1Xm());

        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0L1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0L1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0L1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableListOfOneEquals(
                testValue,
                aggregateFound.getP0L1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}

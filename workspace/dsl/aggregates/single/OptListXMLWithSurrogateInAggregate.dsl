module OptListXMLWithSurrogateInAggregate
{
  root OptListXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<XML>? optListXML;
  }
}

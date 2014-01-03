module OptSetXMLWithSurrogateInAggregate
{
  root OptSetXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<XML>? optSetXML;
  }
}

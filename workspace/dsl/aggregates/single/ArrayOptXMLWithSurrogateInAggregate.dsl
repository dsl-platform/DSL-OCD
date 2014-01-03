module ArrayOptXMLWithSurrogateInAggregate
{
  root ArrayOptXMLWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    XML?[]  arrayOptXML;
  }
}

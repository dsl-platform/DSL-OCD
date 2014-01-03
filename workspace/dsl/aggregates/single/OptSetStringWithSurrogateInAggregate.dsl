module OptSetStringWithSurrogateInAggregate
{
  root OptSetStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<String>? optSetString;
  }
}

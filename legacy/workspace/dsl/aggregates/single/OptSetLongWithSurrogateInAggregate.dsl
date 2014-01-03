module OptSetLongWithSurrogateInAggregate
{
  root OptSetLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Long>? optSetLong;
  }
}

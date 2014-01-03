module OptListLongWithSurrogateInAggregate
{
  root OptListLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Long>? optListLong;
  }
}

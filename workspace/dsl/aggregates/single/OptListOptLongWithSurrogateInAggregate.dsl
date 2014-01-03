module OptListOptLongWithSurrogateInAggregate
{
  root OptListOptLongWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Long?>? optListOptLong;
  }
}

module OptListIntWithSurrogateInAggregate
{
  root OptListIntWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Int>? optListInt;
  }
}

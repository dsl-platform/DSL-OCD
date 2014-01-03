module OptSetIntWithSurrogateInAggregate
{
  root OptSetIntWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Int>? optSetInt;
  }
}

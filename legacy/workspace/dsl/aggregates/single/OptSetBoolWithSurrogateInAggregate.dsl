module OptSetBoolWithSurrogateInAggregate
{
  root OptSetBoolWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Bool>? optSetBool;
  }
}

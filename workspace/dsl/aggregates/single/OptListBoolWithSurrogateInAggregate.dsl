module OptListBoolWithSurrogateInAggregate
{
  root OptListBoolWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Bool>? optListBool;
  }
}

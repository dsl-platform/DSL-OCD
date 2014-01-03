module OptListFloatWithSurrogateInAggregate
{
  root OptListFloatWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Float>? optListFloat;
  }
}

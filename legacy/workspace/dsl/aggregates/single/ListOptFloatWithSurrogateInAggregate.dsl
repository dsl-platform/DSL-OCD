module ListOptFloatWithSurrogateInAggregate
{
  root ListOptFloatWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Float?>  listOptFloat;
  }
}

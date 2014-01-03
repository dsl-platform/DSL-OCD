module ListFloatWithSurrogateInAggregate
{
  root ListFloatWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Float>  listFloat;
  }
}

module OptSetBinaryWithSurrogateInAggregate
{
  root OptSetBinaryWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Binary>? optSetBinary;
  }
}

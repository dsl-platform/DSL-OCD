module OptListBinaryWithSurrogateInAggregate
{
  root OptListBinaryWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Binary>? optListBinary;
  }
}

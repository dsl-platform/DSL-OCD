module OptSetOptBinaryWithSurrogateInAggregate
{
  root OptSetOptBinaryWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Binary?>? optSetOptBinary;
  }
}

module SetBinaryWithSurrogateInAggregate
{
  root SetBinaryWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Binary>  setBinary;
  }
}

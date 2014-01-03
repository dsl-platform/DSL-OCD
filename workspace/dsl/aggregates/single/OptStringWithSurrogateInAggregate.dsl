module OptStringWithSurrogateInAggregate
{
  root OptStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    String? optString;
  }
}

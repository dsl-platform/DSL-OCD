module OptArrayStringWithSurrogateInAggregate
{
  root OptArrayStringWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    String[]? optArrayString;
  }
}

module OptArrayTimestampWithSurrogateInAggregate
{
  root OptArrayTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Timestamp[]? optArrayTimestamp;
  }
}

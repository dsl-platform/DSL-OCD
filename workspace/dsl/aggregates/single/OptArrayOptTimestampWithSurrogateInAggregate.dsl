module OptArrayOptTimestampWithSurrogateInAggregate
{
  root OptArrayOptTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Timestamp?[]? optArrayOptTimestamp;
  }
}

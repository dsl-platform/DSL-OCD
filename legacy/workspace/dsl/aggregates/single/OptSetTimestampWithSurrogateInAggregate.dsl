module OptSetTimestampWithSurrogateInAggregate
{
  root OptSetTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Timestamp>? optSetTimestamp;
  }
}

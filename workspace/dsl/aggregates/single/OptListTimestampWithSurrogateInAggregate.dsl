module OptListTimestampWithSurrogateInAggregate
{
  root OptListTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Timestamp>? optListTimestamp;
  }
}

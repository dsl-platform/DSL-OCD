module OptSetOptTimestampWithSurrogateInAggregate
{
  root OptSetOptTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Timestamp?>? optSetOptTimestamp;
  }
}

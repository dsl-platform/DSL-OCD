module OneTimestampWithSurrogateInAggregate
{
  root OneTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Timestamp  oneTimestamp;
  }
}

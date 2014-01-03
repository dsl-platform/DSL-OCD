module OptTimestampWithSurrogateInAggregate
{
  root OptTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Timestamp? optTimestamp;
  }
}

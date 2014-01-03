module OptListOptTimestampWithSurrogateInAggregate
{
  root OptListOptTimestampWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Timestamp?>? optListOptTimestamp;
  }
}

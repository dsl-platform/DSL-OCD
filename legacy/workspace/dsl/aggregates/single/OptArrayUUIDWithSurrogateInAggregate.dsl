module OptArrayUUIDWithSurrogateInAggregate
{
  root OptArrayUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    UUID[]? optArrayUUID;
  }
}

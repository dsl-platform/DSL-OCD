module OptArrayOptUUIDWithSurrogateInAggregate
{
  root OptArrayOptUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    UUID?[]? optArrayOptUUID;
  }
}

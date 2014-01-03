module OptSetOptUUIDWithSurrogateInAggregate
{
  root OptSetOptUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<UUID?>? optSetOptUUID;
  }
}

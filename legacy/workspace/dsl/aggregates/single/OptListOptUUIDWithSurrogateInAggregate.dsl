module OptListOptUUIDWithSurrogateInAggregate
{
  root OptListOptUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<UUID?>? optListOptUUID;
  }
}

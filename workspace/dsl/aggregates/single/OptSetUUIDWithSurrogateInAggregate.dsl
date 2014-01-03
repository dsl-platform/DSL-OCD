module OptSetUUIDWithSurrogateInAggregate
{
  root OptSetUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<UUID>? optSetUUID;
  }
}

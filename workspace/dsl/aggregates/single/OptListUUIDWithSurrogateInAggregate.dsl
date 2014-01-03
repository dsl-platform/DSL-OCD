module OptListUUIDWithSurrogateInAggregate
{
  root OptListUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<UUID>? optListUUID;
  }
}

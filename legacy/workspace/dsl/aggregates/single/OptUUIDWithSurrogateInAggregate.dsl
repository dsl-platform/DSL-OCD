module OptUUIDWithSurrogateInAggregate
{
  root OptUUIDWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    UUID? optUUID;
  }
}

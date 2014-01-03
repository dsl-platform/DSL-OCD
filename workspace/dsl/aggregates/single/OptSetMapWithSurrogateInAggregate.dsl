module OptSetMapWithSurrogateInAggregate
{
  root OptSetMapWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    Set<Map>? optSetMap;
  }
}

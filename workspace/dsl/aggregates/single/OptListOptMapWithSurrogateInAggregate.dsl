module OptListOptMapWithSurrogateInAggregate
{
  root OptListOptMapWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Map?>? optListOptMap;
  }
}

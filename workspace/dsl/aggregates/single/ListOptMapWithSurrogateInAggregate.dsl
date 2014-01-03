module ListOptMapWithSurrogateInAggregate
{
  root ListOptMapWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Map?>  listOptMap;
  }
}

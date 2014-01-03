module ListOptDateWithSurrogateInAggregate
{
  root ListOptDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Date?>  listOptDate;
  }
}

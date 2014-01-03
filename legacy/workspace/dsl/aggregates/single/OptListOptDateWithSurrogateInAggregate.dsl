module OptListOptDateWithSurrogateInAggregate
{
  root OptListOptDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Date?>? optListOptDate;
  }
}

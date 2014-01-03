module OptListDateWithSurrogateInAggregate
{
  root OptListDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Date>? optListDate;
  }
}

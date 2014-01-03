module ListDateWithSurrogateInAggregate
{
  root ListDateWithSurrogateAggregate(ID) {
    Int  ID { Sequence; }
    List<Date>  listDate;
  }
}

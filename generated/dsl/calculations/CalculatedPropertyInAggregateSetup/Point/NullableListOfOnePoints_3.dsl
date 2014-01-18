module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOnePoints_3 {
    List<Point>? nullableListOfOnePoints;

    calculated List<Point>? calculatedNullableListOfOnePoints from 'it => it.nullableListOfOnePoints';

    calculated List<Point>? persistedNullableListOfOnePoints from 'it => it.nullableListOfOnePoints' { persisted; }
  }
}

module CalculatedPropertyInValueSetup
{
  value NullableListOfOnePoints_4 {
    List<Point>? nullableListOfOnePoints;

    calculated List<Point>? calculatedNullableListOfOnePoints from 'it => it.nullableListOfOnePoints';

    calculated List<Point>? persistedNullableListOfOnePoints from 'it => it.nullableListOfOnePoints' { persisted; }
  }
}

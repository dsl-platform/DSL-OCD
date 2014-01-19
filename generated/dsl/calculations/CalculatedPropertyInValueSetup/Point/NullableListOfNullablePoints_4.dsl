module CalculatedPropertyInValueSetup
{
  value NullableListOfNullablePoints_4 {
    List<Point?>? nullableListOfNullablePoints;

    calculated List<Point?>? calculatedNullableListOfNullablePoints from 'it => it.nullableListOfNullablePoints';

    calculated List<Point?>? persistedNullableListOfNullablePoints from 'it => it.nullableListOfNullablePoints' { persisted; }
  }
}

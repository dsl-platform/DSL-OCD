module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullablePoints_4 {
    Set<Point?>? nullableSetOfNullablePoints;

    calculated Set<Point?>? calculatedNullableSetOfNullablePoints from 'it => it.nullableSetOfNullablePoints';

    calculated Set<Point?>? persistedNullableSetOfNullablePoints from 'it => it.nullableSetOfNullablePoints' { persisted; }
  }
}

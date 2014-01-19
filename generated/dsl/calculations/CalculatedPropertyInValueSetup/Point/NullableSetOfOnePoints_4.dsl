module CalculatedPropertyInValueSetup
{
  value NullableSetOfOnePoints_4 {
    Set<Point>? nullableSetOfOnePoints;

    calculated Set<Point>? calculatedNullableSetOfOnePoints from 'it => it.nullableSetOfOnePoints';

    calculated Set<Point>? persistedNullableSetOfOnePoints from 'it => it.nullableSetOfOnePoints' { persisted; }
  }
}

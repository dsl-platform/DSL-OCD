module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableRectangles_3 {
    Set<Rectangle?>? nullableSetOfNullableRectangles;

    calculated Set<Rectangle?>? calculatedNullableSetOfNullableRectangles from 'it => it.nullableSetOfNullableRectangles';

    calculated Set<Rectangle?>? persistedNullableSetOfNullableRectangles from 'it => it.nullableSetOfNullableRectangles' { persisted; }
  }
}

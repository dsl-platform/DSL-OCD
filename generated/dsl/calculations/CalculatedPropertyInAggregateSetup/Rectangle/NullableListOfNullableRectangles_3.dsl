module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableRectangles_3 {
    List<Rectangle?>? nullableListOfNullableRectangles;

    calculated List<Rectangle?>? calculatedNullableListOfNullableRectangles from 'it => it.nullableListOfNullableRectangles';

    calculated List<Rectangle?>? persistedNullableListOfNullableRectangles from 'it => it.nullableListOfNullableRectangles' { persisted; }
  }
}

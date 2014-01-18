module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneRectangles_3 {
    List<Rectangle>? nullableListOfOneRectangles;

    calculated List<Rectangle>? calculatedNullableListOfOneRectangles from 'it => it.nullableListOfOneRectangles';

    calculated List<Rectangle>? persistedNullableListOfOneRectangles from 'it => it.nullableListOfOneRectangles' { persisted; }
  }
}

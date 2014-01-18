module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableRectangles_3 {
    Set<Rectangle?> oneSetOfNullableRectangles;

    calculated Set<Rectangle?> calculatedOneSetOfNullableRectangles from 'it => it.oneSetOfNullableRectangles';

    calculated Set<Rectangle?> persistedOneSetOfNullableRectangles from 'it => it.oneSetOfNullableRectangles' { persisted; }
  }
}

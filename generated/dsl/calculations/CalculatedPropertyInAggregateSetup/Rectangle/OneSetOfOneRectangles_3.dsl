module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneRectangles_3 {
    Set<Rectangle> oneSetOfOneRectangles;

    calculated Set<Rectangle> calculatedOneSetOfOneRectangles from 'it => it.oneSetOfOneRectangles';

    calculated Set<Rectangle> persistedOneSetOfOneRectangles from 'it => it.oneSetOfOneRectangles' { persisted; }
  }
}

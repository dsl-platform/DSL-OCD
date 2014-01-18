module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneRectangles_3 {
    List<Rectangle> oneListOfOneRectangles;

    calculated List<Rectangle> calculatedOneListOfOneRectangles from 'it => it.oneListOfOneRectangles';

    calculated List<Rectangle> persistedOneListOfOneRectangles from 'it => it.oneListOfOneRectangles' { persisted; }
  }
}

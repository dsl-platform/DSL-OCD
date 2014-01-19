module CalculatedPropertyInValueSetup
{
  value OneSetOfOneRectangles_4 {
    Set<Rectangle> oneSetOfOneRectangles;

    calculated Set<Rectangle> calculatedOneSetOfOneRectangles from 'it => it.oneSetOfOneRectangles';

    calculated Set<Rectangle> persistedOneSetOfOneRectangles from 'it => it.oneSetOfOneRectangles' { persisted; }
  }
}

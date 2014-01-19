module CalculatedPropertyInValueSetup
{
  value OneSetOfOnePoints_4 {
    Set<Point> oneSetOfOnePoints;

    calculated Set<Point> calculatedOneSetOfOnePoints from 'it => it.oneSetOfOnePoints';

    calculated Set<Point> persistedOneSetOfOnePoints from 'it => it.oneSetOfOnePoints' { persisted; }
  }
}

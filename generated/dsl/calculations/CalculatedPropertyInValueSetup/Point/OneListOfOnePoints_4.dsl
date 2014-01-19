module CalculatedPropertyInValueSetup
{
  value OneListOfOnePoints_4 {
    List<Point> oneListOfOnePoints;

    calculated List<Point> calculatedOneListOfOnePoints from 'it => it.oneListOfOnePoints';

    calculated List<Point> persistedOneListOfOnePoints from 'it => it.oneListOfOnePoints' { persisted; }
  }
}

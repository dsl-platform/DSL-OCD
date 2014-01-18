module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOnePoints_3 {
    List<Point> oneListOfOnePoints;

    calculated List<Point> calculatedOneListOfOnePoints from 'it => it.oneListOfOnePoints';

    calculated List<Point> persistedOneListOfOnePoints from 'it => it.oneListOfOnePoints' { persisted; }
  }
}

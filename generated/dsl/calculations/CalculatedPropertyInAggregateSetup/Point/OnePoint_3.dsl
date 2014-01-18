module CalculatedPropertyInAggregateSetup
{
  aggregate OnePoint_3 {
    Point onePoint;

    calculated Point calculatedOnePoint from 'it => it.onePoint';

    calculated Point persistedOnePoint from 'it => it.onePoint' { persisted; }
  }
}

module CalculatedPropertyInValueSetup
{
  value OnePoint_4 {
    Point onePoint;

    calculated Point calculatedOnePoint from 'it => it.onePoint';

    calculated Point persistedOnePoint from 'it => it.onePoint' { persisted; }
  }
}

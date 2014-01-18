module CalculatedPropertyInAggregateSetup
{
  aggregate OneRectangle_3 {
    Rectangle oneRectangle;

    calculated Rectangle calculatedOneRectangle from 'it => it.oneRectangle';

    calculated Rectangle persistedOneRectangle from 'it => it.oneRectangle' { persisted; }
  }
}

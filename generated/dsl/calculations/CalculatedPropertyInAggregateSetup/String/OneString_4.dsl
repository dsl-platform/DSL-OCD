module CalculatedPropertyInAggregateSetup
{
  aggregate OneString_4 {
    String oneString;

    calculated String calculatedOneString from 'it => it.oneString';

    calculated String persistedOneString from 'it => it.oneString' { persisted; }
  }
}

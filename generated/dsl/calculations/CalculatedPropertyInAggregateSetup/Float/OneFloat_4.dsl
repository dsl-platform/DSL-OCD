module CalculatedPropertyInAggregateSetup
{
  aggregate OneFloat_4 {
    Float oneFloat;

    calculated Float calculatedOneFloat from 'it => it.oneFloat';

    calculated Float persistedOneFloat from 'it => it.oneFloat' { persisted; }
  }
}

module CalculatedPropertyInAggregateSetup
{
  aggregate OneLocation_3 {
    Location oneLocation;

    calculated Location calculatedOneLocation from 'it => it.oneLocation';

    calculated Location persistedOneLocation from 'it => it.oneLocation' { persisted; }
  }
}

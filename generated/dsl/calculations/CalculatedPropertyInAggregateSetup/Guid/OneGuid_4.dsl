module CalculatedPropertyInAggregateSetup
{
  aggregate OneGuid_4 {
    Guid oneGuid;

    calculated Guid calculatedOneGuid from 'it => it.oneGuid';

    calculated Guid persistedOneGuid from 'it => it.oneGuid' { persisted; }
  }
}
